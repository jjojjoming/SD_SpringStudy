<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test1</title>
</head>
<body>
<h1>test1</h1>

	<!-- ----------------------select----------------------- -->
	
	
<form:form action="result" modelAttribute="dataBean">
	<form:select path="a1">
		<form:option value="data1">항목1</form:option>
		<form:option value="data2">항목2</form:option>
		<form:option value="data3">항목3</form:option>
	</form:select>


<hr />
	<form:select path="a2">
		<form:options items="${requestScope.data_list1 }"/>
	</form:select>
	
<hr />
	<form:select path="a3">
		<form:options items="${requestScope.data_list2 }"/>
	</form:select>

<hr />
	<form:select path="a4">
		<form:options items="${requestScope.data_list3 }" itemLabel="Key" itemValue="Value"/>
	</form:select>
	
	<!-- ----------------------checkbox----------------------- -->
	
<hr />   
   <!--  data1, data3에만 체크됨 -->
   <form:checkbox path="a5" value="data1"/>항목1
   <form:checkbox path="a5" value="data2"/>항목2
   <form:checkbox path="a5" value="data3"/>항목3
   
   <!-- String 배열 -->
 <hr /> <!-- data_list1에 data1,data2,data3가 저장되어 있고 그중에서 a6에 기억되어 있는 data1,data3만 선택 -->
 	<form:checkboxes path="a6" items="${requestScope.data_list1 }"/>  
 	
 	<!-- ArrayList 배열 -->
 <hr />
 	<form:checkboxes path="a7" items="${requestScope.data_list2 }"/> 
 	<!-- KeyValueBean 배열 -->
 <hr />
 	<form:checkboxes path="a8" items="${requestScope.data_list3 }" itemLabel="Key" itemValue="Value"/> 
	
	<!-- ----------------------radiobutton----------------------- -->
 <hr />	
	<form:radiobutton path="a9" value="data1"/>항목1
	<form:radiobutton path="a9" value="data2"/>항목2
	<form:radiobutton path="a9" value="data3"/>항목3
	
	<!-- String 배열 -->
 <hr /> <!-- data_list1에 data1,data2,data3가 저장되어 있고 그중에서 a6에 기억되어 있는 data1,data3만 선택 -->
 	<form:radiobuttons path="a10" items="${requestScope.data_list1 }"/>  
 	
 	<!-- ArrayList 배열 -->
 <hr />
 	<form:radiobuttons path="a11" items="${requestScope.data_list2 }"/> 
 	<!-- KeyValueBean 배열 -->
 <hr />
 	<form:radiobuttons path="a2" items="${requestScope.data_list3 }" itemLabel="Key" itemValue="Value"/> 
	
	
 <hr />	
</form:form>
</body>
</html>