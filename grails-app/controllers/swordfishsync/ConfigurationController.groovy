package swordfishsync

import grails.core.GrailsApplication
import grails.transaction.Transactional
import org.springframework.mail.MailSender

import static org.springframework.http.HttpStatus.*

@Transactional(readOnly = true)
class ConfigurationController {
	
    GrailsApplication grailsApplication
	MailSender mailSender
	
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
    def index() {
		respond Configuration.findByTitle('Configuration')
    }
	
	def edit() {
		respond Configuration.findByTitle('Configuration')
	}
	
    @Transactional
    def save() {
		def errorMessages = []
		def settings = Setting.list()
		settings.each { setting ->
			boolean doSave = false
			if (params.containsKey(setting.code)) {
				def newValue = params.get(setting.code)
				if (newValue != setting.value) {
					setting.value = newValue
					doSave = true
				}
			} else if (setting.type == 'boolean') {
				setting.value = false
				doSave = true
			}
			if (doSave) {
				if (!setting.save()) {
					errorMessages.add('Error saving ' + Configuration.findBySetting(setting).title)
				} else {
					if (setting.code == 'email.host') {
						grailsApplication.config.grails.mail.host = setting.valueObject
						mailSender.setHost(grailsApplication.config.grails.mail.host)
					} else if (setting.code == 'email.port') {
						grailsApplication.config.grails.mail.port = setting.valueObject
						mailSender.setPort(grailsApplication.config.grails.mail.port)
					}
				}
			}
		}
		
		if (errors) {
			flash.error = 'Error saving configuration'
			respond Configuration.findByTitle('Configuration'), view: 'edit', model: [errorMessages: errorMessages]
		} else {
			flash.message = 'Configuration saved'
			respond Configuration.findByTitle('Configuration'), view: 'index'
		}
	}
	
    def show(Configuration configuration) {
        respond configuration
    }

    def create() {
        respond new Configuration(params)
    }

    /*@Transactional
    def save(Configuration configuration) {
        if (configuration == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (configuration.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond configuration.errors, view:'create'
            return
        }

        configuration.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'configuration.label', default: 'Configuration'), configuration.id])
                redirect configuration
            }
            '*' { respond configuration, [status: CREATED] }
        }
    }*/

    /*def edit(Configuration configuration) {
        respond configuration
    }*/

    @Transactional
    def update(Configuration configuration) {
        if (configuration == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (configuration.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond configuration.errors, view:'edit'
            return
        }

        configuration.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'configuration.label', default: 'Configuration'), configuration.id])
                redirect configuration
            }
            '*'{ respond configuration, [status: OK] }
        }
    }

    @Transactional
    def delete(Configuration configuration) {

        if (configuration == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        configuration.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'configuration.label', default: 'Configuration'), configuration.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'configuration.label', default: 'Configuration'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
