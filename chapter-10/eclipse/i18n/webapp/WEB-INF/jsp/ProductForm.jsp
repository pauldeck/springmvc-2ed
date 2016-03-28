<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="page.productform.title"/></title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
Current Locale : ${pageContext.response.locale}
<br/>
accept-language header: ${header["accept-language"]}

<form:form commandName="product" action="save-product" method="post">
    <fieldset>
        <legend><spring:message code="form.name"/></legend>
        <p>
            <label for="name"><spring:message code="label.productName" text="default text" />:</label>
            <form:input id="name" path="name" cssErrorClass="error"/>
            <form:errors path="name" cssClass="error"/>
        </p>
        <p>
            <label for="description"><spring:message code="label.description"/>: </label>
            <form:input id="description" path="description"/>
        </p>
        <p>
            <label for="price"><spring:message code="label.price" text="default text" />: </label>
            <form:input id="price" path="price" cssErrorClass="error"/>
            <form:errors path="price" cssClass="error"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4" 
                value="<spring:message code="button.reset"/>">
            <input id="submit" type="submit" tabindex="5" 
                value="<spring:message code="button.submit"/>">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
