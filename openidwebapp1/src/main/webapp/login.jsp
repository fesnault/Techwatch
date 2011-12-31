<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<c:set var="authResult" value="${param.authfailed}"/>
<c:if test="${authResult == 'true'}">
<font color="red"><b>Authentication failed.</b></font>
</c:if>
<form action="j_spring_security_check" method="post">
    <h1>Please Login</h1>
    Login:    <input type="text" name="j_username"><br>
    Password: <input type="password" name="j_password"><br>
    <input type=submit value="Login">
</form>
<form action="j_spring_openid_security_check" method="post">
    <h1>Or login using OpenId</h1>
    OpenID:    <input type="text" name="openid_identifier" id="openid_identifier"><br>
    <input type=submit value="Login">
</form>
</body>
</html>