<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test2</title>
</head>
<body>
<h1>Test2</h1>
<form:form modelAttribute="userDataBean" action="result">
이름 : <form:input path='user_name'/><br/>
아이디 : <form:input path='user_id'/><br/>
비밀번호 : <form:password path='user_pw' showPassword="true"/><br/>
우편번호 : <form:input path='user_postcode'/><br/>
주소1 : <form:input path='user_address1'/><br/>
주소2 : <form:input path='user_address2'/><br/>
<button type="submit">확인</button>

</form:form>
</body>
</html>

<%-- path : id와 name의 속성값이 혼합된것임
<form:password>은 노출되지 않으므로 showPassword="true"를 선언한다 --%>


