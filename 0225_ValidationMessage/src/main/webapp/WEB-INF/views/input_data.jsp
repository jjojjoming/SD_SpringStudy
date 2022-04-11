<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>input_data</h1>
	<%-- <form action="input_pro" method="post">
	
		data1 : <input type="text" name='data1' /><br>
		
		<spring:hasBindErrors name="dataBean1">
			<!-- dataBean1에 error를 감지하기 위한 설정(result담겨져 있는 메세지) -->
			<c:if test="${errors.hasFieldErrors('data1') }">
				${errors.getFieldError('data1').defaultMessage }<br/>
			<spring:message code="${errors.getFieldError('data1').codes[0]}"/><br/>
			</c:if>
		</spring:hasBindErrors>


		data2 : <input type="text" name='data2' /><br>
		
		<spring:hasBindErrors name="dataBean1">
			<!-- dataBean1에 error를 감지하기 위한 설정(result담겨져 있는 메세지) -->
			<c:if test="${errors.hasFieldErrors('data2') }">
				${errors.getFieldError('data2').defaultMessage }<br/>
				<spring:message code="${errors.getFieldError('data2').codes[0]}"/><br/>
			</c:if>
		</spring:hasBindErrors>
		
		<button type="submit">확인</button>
	</form>
	 --%>
	<!-- ========================================================================= -->
	
	<form:form action="input_pro" modelAttribute="dataBean1" method="post">
	
	data1 : <form:input path="data1" type='text'/><br>
				<form:errors path="data1" style='color:red'/><br>
	data2 : <form:input path="data2" type='text'/><br>
				<form:errors path="data2" style='color:red'/><br>
				
				<form:button type="submit">확인</form:button>
	
	</form:form>
	
	
	
	
	
	
	
	
	
</body>
</html>