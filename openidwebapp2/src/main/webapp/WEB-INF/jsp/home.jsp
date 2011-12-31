<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Secured Home Page</title>
</head>
<body>
Welcome to the secured home page.
<form name="logoutform" action="/web2/j_spring_security_logout" method="post">
    <a href="javascript:document.logoutform.submit();"/>Logout</a>
</form>
</body>
</html>
