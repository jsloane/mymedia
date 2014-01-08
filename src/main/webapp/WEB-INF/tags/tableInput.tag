<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="fieldType" required="true" type="java.lang.String" description="Field type." %>
<%@ attribute name="fieldName" required="true" type="java.lang.String" description="Field name." %>
<%@ attribute name="fieldLabel" required="true" type="java.lang.String" description="Field value." %>
<%@ attribute name="fieldHelp" required="false" type="java.lang.String" description="Field help." %>
<%@ attribute name="fieldValue" required="false" type="java.lang.String" description="Field value." %>
<%@ attribute name="fieldValues" required="false" type="java.util.Map" description="Field values." %>
<%@ attribute name="fieldChecked" required="false" type="java.lang.String" description="Field value." %>
<%@ attribute name="fieldRequired" required="false" type="java.lang.Boolean" description="Field required." %>
<%@ attribute name="fieldAdvanced" required="false" type="java.lang.Boolean" description="Field advanced." %>
<%@ attribute name="fieldClass" required="false" type="java.lang.String" description="Field class." %>



<div class="table-row ${advancedClass}">
    <div class="table-cell">
        <label for="${fieldName}">${fieldLabel}</label><c:if test="${fieldRequired}">*</c:if>
    </div>
    <div class="table-cell">
        <c:choose>
            <c:when test="${fieldType eq 'checkbox'}">
                <input type="${fieldType}" name="${fieldName}" id="${fieldName}" ${fieldChecked}/>
            </c:when>
            <c:when test="${fieldType eq 'select'}">
                <select name="${fieldName}" id="${fieldName}">
                    <c:forEach items="${fieldValues}" var="selectOption">
                        <option value="${selectOption.key}"<c:if test="${fieldValue  == selectOption.key}"> selected="selected"</c:if>>${selectOption.value}</option>
                    </c:forEach>
                </select>
            </c:when>
            <c:when test="${fieldType eq 'textarea'}">
                <textarea name="${fieldName}">${fieldValue}</textarea>
            </c:when>
            <c:otherwise>
                <input type="${fieldType}" class="${fieldClass}" name="${fieldName}" id="${fieldName}" value="${fieldValue}"/>
            </c:otherwise>
        </c:choose>
        ${fieldHelp}
    </div>
</div>
