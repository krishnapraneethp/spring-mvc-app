<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:url value="${request.getContextPath()}/usertransactions/signup" var="signUpURL" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Welcome to Spring MVC</title>
	</head>
	<body>
		<form:form action="${signUpURL}" method="post" id="userDetailsForm" modelAttribute="UserDetails">
			<form:input type="hidden" value="${UserDetails.userid}" id = "userid" path="userid" name = "userid"/>
			<form:input type="text" id = "username" placeholder="Kindly enter your name" path="username" name="username"/><br/>
			<form:input type="password" id = "password" placeholder="Kindly enter your preferred password" path="password" name="password"/><br/>
			<form:input type="text" id = "emailId" placeholder="Kindly enter your email id" path="emailId" name="emailId"/><br/>
			<input type="submit">
		</form:form>
	</body>
</html>