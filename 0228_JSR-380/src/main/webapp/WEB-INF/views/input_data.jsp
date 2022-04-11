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
	
	<form:form action="input_pro" modelAttribute="dataBean1" method="post">
			data1 : <form:input type="text" path="data1"/><br>
						<form:errors path="data1" style='color:red'/><br>
						
			data2 : <form:input type="text" path="data2"/><br>
						<form:errors path="data2" style='color:red'/><br>
						
			data3 : <form:input type="text" path="data3"/><br>
						<form:errors path="data3" style='color:red'/><br>
						
			data4 : <form:input type="text" path="data4"/><br>
						<form:errors path="data4" style='color:red'/><br>
						
			data5 : <form:input type="text" path="data5"/><br>
						<form:errors path="data5" style='color:red'/><br>
						
			data6 : <form:input type="text" path="data6"/><br>
						<form:errors path="data6" style='color:red'/><br>
						
			data7 : <form:input type="text" path="data7"/><br>
						<form:errors path="data7" style='color:red'/><br>
			
			
			
           
           <form:button type="submit">확인</form:button>
	
	</form:form>
	
	
	
	
	
	
	
	
	
</body>
</html>