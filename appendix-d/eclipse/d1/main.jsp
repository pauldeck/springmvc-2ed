<html>
<head><title>Including a file</title></head>
<body>
This is the included content: <hr/>
<%@ include file="copyright.jspf"%>
</body>
</html>
Using the include directive in the main.jsp page has the same effect as writing the following JSP page.

<html>
<head><title>Including a file</title></head>
<body>
This is the included content: <hr/>
<hr/>
&copy;2012 BrainySoftware
<hr/>
</body>
</html>