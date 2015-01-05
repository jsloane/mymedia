//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.05 at 03:05:11 PM EST 
//


package mymedia.model.xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="application">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="syncInterval" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="tvdbApiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tvdbApiNotice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tmdbApiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tmdbApiNotice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="debugOnHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="torrentClient">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heading" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "application",
    "torrentClient",
    "to",
    "from",
    "heading",
    "body"
})
@XmlRootElement(name = "settings")
public class Settings {

    @XmlElement(required = true)
    protected Settings.Application application;
    @XmlElement(required = true)
    protected Settings.TorrentClient torrentClient;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String heading;
    @XmlElement(required = true)
    protected String body;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link Settings.Application }
     *     
     */
    public Settings.Application getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link Settings.Application }
     *     
     */
    public void setApplication(Settings.Application value) {
        this.application = value;
    }

    /**
     * Gets the value of the torrentClient property.
     * 
     * @return
     *     possible object is
     *     {@link Settings.TorrentClient }
     *     
     */
    public Settings.TorrentClient getTorrentClient() {
        return torrentClient;
    }

    /**
     * Sets the value of the torrentClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Settings.TorrentClient }
     *     
     */
    public void setTorrentClient(Settings.TorrentClient value) {
        this.torrentClient = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeading(String value) {
        this.heading = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="syncInterval" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="tvdbApiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tvdbApiNotice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tmdbApiKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tmdbApiNotice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="debugOnHost" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "syncInterval",
        "tvdbApiKey",
        "tvdbApiNotice",
        "tmdbApiKey",
        "tmdbApiNotice",
        "debugOnHost"
    })
    public static class Application {

        @XmlElement(required = true, defaultValue = "SwordfishSync")
        protected String title;
        @XmlElement(required = true, defaultValue = "15")
        protected BigInteger syncInterval;
        @XmlElement(required = true)
        protected String tvdbApiKey;
        @XmlElement(required = true, defaultValue = "thetvdb dot com")
        protected String tvdbApiNotice;
        @XmlElement(required = true)
        protected String tmdbApiKey;
        @XmlElement(required = true, defaultValue = "This product uses the TMDb API but is not endorsed or certified by TMDb.")
        protected String tmdbApiNotice;
        @XmlElement(required = true)
        protected String debugOnHost;

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Gets the value of the syncInterval property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSyncInterval() {
            return syncInterval;
        }

        /**
         * Sets the value of the syncInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSyncInterval(BigInteger value) {
            this.syncInterval = value;
        }

        /**
         * Gets the value of the tvdbApiKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTvdbApiKey() {
            return tvdbApiKey;
        }

        /**
         * Sets the value of the tvdbApiKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTvdbApiKey(String value) {
            this.tvdbApiKey = value;
        }

        /**
         * Gets the value of the tvdbApiNotice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTvdbApiNotice() {
            return tvdbApiNotice;
        }

        /**
         * Sets the value of the tvdbApiNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTvdbApiNotice(String value) {
            this.tvdbApiNotice = value;
        }

        /**
         * Gets the value of the tmdbApiKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTmdbApiKey() {
            return tmdbApiKey;
        }

        /**
         * Sets the value of the tmdbApiKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTmdbApiKey(String value) {
            this.tmdbApiKey = value;
        }

        /**
         * Gets the value of the tmdbApiNotice property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTmdbApiNotice() {
            return tmdbApiNotice;
        }

        /**
         * Sets the value of the tmdbApiNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTmdbApiNotice(String value) {
            this.tmdbApiNotice = value;
        }

        /**
         * Gets the value of the debugOnHost property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebugOnHost() {
            return debugOnHost;
        }

        /**
         * Sets the value of the debugOnHost property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDebugOnHost(String value) {
            this.debugOnHost = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "host"
    })
    public static class TorrentClient {

        @XmlElement(required = true, defaultValue = "127.0.0.1")
        protected String host;

        /**
         * Gets the value of the host property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHost() {
            return host;
        }

        /**
         * Sets the value of the host property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHost(String value) {
            this.host = value;
        }

    }

}
