<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>test2</h1>
<!-- Request로 주입되어서 넘어오므로 requestScope로 받음 -->
<h3>data1 : ${requestScope.data1 }</h3>
<h3>data2 : ${requestScope.data2 }</h3>


</body>
</html>

<!-- requestScope : 요청정보가 발생하고 그 응답 결과가 브라우저로 전달될때 까지가 생명주기 -->