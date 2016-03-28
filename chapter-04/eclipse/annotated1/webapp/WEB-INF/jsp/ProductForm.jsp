<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
<form action="save-product" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p>
            <label for="name">Product Name: </label>
            <input type="text" id="name" name="name" 
                tabindex="1">
        </p>
        <p>
            <label for="description">Description: </label>
            <input type="text" id="description" 
                name="description" tabindex="2">
        </p>
        <p>
            <label for="price">Price: </label>
            <input type="text" id="price" name="price" 
                tabindex="3">
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Add Product">
        </p>
    </fieldset>
</form>
</div>
</body>
</html>
