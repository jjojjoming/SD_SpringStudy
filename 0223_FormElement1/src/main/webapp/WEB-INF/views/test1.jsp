<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test1</title>
</head>
<body>
<h1>Test1</h1>
<form:form modelAttribute="dataBean" action="result">
	전공 : <form:hidden path="a1"/><br/>
	이름 : <form:input path="a2"/><br/>
	비밀번호 : <form:password path="a3" showPassword="true"/><br/>
	주소 : <form:textarea path="a4"/><br/>
	<form:button disabled="true">확인버튼</form:button>
</form:form>
</body>
</html>