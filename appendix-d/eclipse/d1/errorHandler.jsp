<%@page isErrorPage="true"%>
<html>
<head><title>Error</title></head>
<body>
An error has occurred. <br/>
Error message: 
<%
    out.println(exception.toString());
%>
</body>
</html>