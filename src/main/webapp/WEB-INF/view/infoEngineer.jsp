<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Информация о регионе</h1>


	<form:form action="saveEngineer" modelAttribute="engineer">
		<form:hidden path="id" />

		Выберите регион <form:select path="region">

		<c:forEach  items="${region}" var ="region">
        	<form:option value="${region}" label="${region.name}"/>
        </c:forEach>
		</form:select>
		
		<br><br>
		Выберите сотрудника <form:select path="contingent">

		<c:forEach  items="${contingent}" var ="contingent">
        	<form:option value="${contingent}" label="${contingent.surname} ${contingent.name} ${contingent.patronymic}"/>
        </c:forEach>
		</form:select>
		
		
		<br><br>


		<br><br>
		<input type="submit" value="Сохранить">
	</form:form>


</body>
</html>