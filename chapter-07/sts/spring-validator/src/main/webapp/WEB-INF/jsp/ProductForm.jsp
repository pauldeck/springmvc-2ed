<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url("<c:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<form:form commandName="product" action="save-product" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p class="errorLine">
            <form:errors path="name" cssClass="error"/>
        </p>
        <p>
            <label for="name">*Product Name: </label>
            <form:input id="name" path="name" tabindex="1"/>
        </p>
        <p>
            <label for="description">Description: </label>
            <form:input id="description" path="description" tabindex="2"/>
        </p>
        <p class="errorLine">
            <form:errors path="price" cssClass="error"/>
        </p>
        <p>
            <label for="price">*Price: </label>
            <form:input id="price" path="price" tabindex="3"/>
        </p>
        <p class="errorLine">
            <form:errors path="productionDate" cssClass="error"/>
        </p>
        <p>
            <label for="productionDate">*Production Date (MM-dd-yyyy): </label>
            <form:input id="productionDate" path="productionDate" tabindex="4"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="5">
            <input id="submit" type="submit" tabindex="6" 
                value="Add Product">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
