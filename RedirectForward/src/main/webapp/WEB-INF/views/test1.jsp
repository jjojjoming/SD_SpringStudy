<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>test1</h1>
<form:form modelAttribute="dataBean" action="result">
   <form:select path="a1">
      <form:option value="data1">항목1</form:option>
      <form:option value="data2">항목2</form:option> <!-- 항목2가 selected 된 것과 같음 -->
      <form:option value="data3">항목3</form:option>
   </form:select>
   
   <hr />
   <form:select path="a2"><!-- 항목2가 selected 된 것과 같음 -->
      <form:options items="${requestScope.data_list1 }"/>
   </form:select>
   
   <hr />
   <form:select path="a3"><!-- 항목2가 selected 된 것과 같음 -->
      <form:options items="${requestScope.data_list2 }"/>
   </form:select>
   
   <hr />
   <form:select path="a4"><!-- 항목2가 selected 된 것과 같음 -->
      <form:options items="${requestScope.data_list3 }" itemLabel="key" itemValue="value"/>
   </form:select>
   
   
   <!-- checkBox -->
   <hr/>
   <form:checkbox path="a5" value="data1"/>항목1
   <form:checkbox path="a5" value="data2"/>항목2
   <form:checkbox path="a5" value="data3"/>항목3
   
   <hr/>
   <form:options items="${requestScope.data_list1}"/>
   
   <form:options items="${requestScope.data_list2}"/>
   
   <form:options items="${requestScope.data_list3}"/>
   
	<!-- String배열의 checkBox -->
	<form:checkboxes items="${requestScope.data_list1 }" path="a6"/>
	
	<hr />
	
	<!-- ArrayList 배열의 checkBox -->
	<form:checkboxes items="${requestScope.data_list2 }" path="a7"/>
	
	<hr />
	
	<form:checkboxes items="${requestScope.data_list3 }" path="a8" itemLabel="key" itemValue="value"/>
   
   <!-- -------------------------radiobutton------------------------ -->
   <hr/>
   <form:radiobutton path="a9" value="data1"/>항목1
   <form:radiobutton path="a9" value="data2"/>항목2
   <form:radiobutton path="a9" value="data3"/>항목3
   
   <!-- String 배열의 radiobutton -->
   <form:radiobuttons items="${requestScope.data_list1}" path="a10"/>
   
   <!-- ArrayList 배열의 radiobutton -->
   <form:radiobuttons items="${requestScope.data_list2}" path="a11"/>
   
   <!-- MAP 배열의 radiobutton -->
   <form:radiobuttons items="${requestScope.data_list3}" path="a12" itemLabel="key" itemValue="value"/>
   
      
</form:form>
</body>
</html>