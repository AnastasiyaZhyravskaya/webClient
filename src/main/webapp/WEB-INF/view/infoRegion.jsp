<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Информация о регионе</h1>


<form:form action="saveRegion" modelAttribute="region">

	<form:hidden path="id"/>

	Название <form:input path = "name"/>
	<br><br>
	<input type="submit" value="Сохранить">
</form:form>


</body>
</html>