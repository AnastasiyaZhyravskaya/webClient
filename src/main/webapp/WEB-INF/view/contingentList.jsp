<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Contingent List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
<body>
    <h1>Сотрудники</h1>
   
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>id</th>
          <th>Имя</th>
          <th>Фамилия</th>
          <th>Отчество</th>
        </tr>
        <c:forEach  items="${contingent}" var ="contingent">
        <c:url var="updateBatton" value="/updateContingent">
        	<c:param name="contingentId" value="${contingent.id}"/>
        </c:url>
        
        <c:url var="deleteBatton" value="/deleteContingent">
        	<c:param name="contingentId" value="${contingent.id}"/>
        </c:url>
        
        <tr>
          <td>${contingent.id}</td>
          <td>${contingent.name}</td>
          <td>${contingent.surname}</td>
          <td>${contingent.patronymic}</td>
          <td>
			<input type="button" value="Oбновить" 
    		onclick="window.location.href = '${updateBatton}'"/>	
			<input type="button" value="Удалить" 
    		onclick="window.location.href = '${deleteBatton}'"/>	
			</td>
        </tr>
        </c:forEach>
      </table>
    </div>
    <br/><br/>
    <input type="button" value="Добавить сотрудника" 
    		onclick="window.location.href = 'infoContingent'"/>
    <br/><br/>
    <input type="button" value="Назад" 
    		onclick="window.location.href = '/'"/>		
    		
    		
  </body>
</html>