<!DOCTYPE html>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<form method="post" action="save-product">
    <h1>Add Product 
        <span>Please use this form to enter product details</span>
    </h1>
    ${empty requestScope.errors? "" : "<p id='errors'>" 
      += "Error(s)!"
      += "<ul>"}
    <!--${requestScope.errors.stream().map(
          x -> "--><li>"+=x+="</li><!--").toList()}-->
    ${empty requestScope.errors? "" : "</ul></p>"}
    <label>
        <span>Product Name :</span>
        <input id="name" type="text" name="name" 
            placeholder="The complete product name"
            value="${form.name}"/>
    </label>
    <label>
        <span>Description :</span>
        <input id="description" type="text" name="description" 
            placeholder="Product description"
            value="${form.description}"/>
    </label>
    <label>
        <span>Price :</span>
        <input id="price" name="price" type="number" step="any"
            placeholder="Product price in #.## format"
            value="${form.price}"/>
    </label> 
    <label>
        <span>&nbsp;</span> 
        <input type="submit"/> 
    </label> 
</form>
</body>
</html>