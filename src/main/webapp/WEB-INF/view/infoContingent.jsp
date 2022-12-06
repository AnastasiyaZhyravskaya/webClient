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
<h1>Информация о сотруднике</h1>


<form:form action="saveContingent" modelAttribute="contingent">

	<form:hidden path="id"/>

	Имя <form:input path = "name"/>
	<br><br>
	Фамилия <form:input path = "surname"/>
	<br><br>
	Отчество <form:input path = "patronymic"/>
	<br><br>
	<input type="submit" value="Сохранить">
</form:form>


</body>
</html>