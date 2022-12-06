<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Engineer List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
<body>
    <h1>Инженеры</h1>
   
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>id</th>
          <th>Регион</th>
          <th>Ответственный</th>
        </tr>
        <c:forEach  items="${engineer}" var ="engineer">
        <c:url var="updateBatton" value="/updateEngineer">
        	<c:param name="engineerId" value="${engineer.id}"/>
        </c:url>
        
        <c:url var="deleteBatton" value="/deleteEngineer">
        	<c:param name="engineerId" value="${engineer.id}"/>
        </c:url>
        
        <tr>
          <td>${engineer.id}</td>
          <td>${engineer.region.name}</td>
          <td>${engineer.contingent.name} ${engineer.contingent.surname} ${engineer.contingent.patronymic}</td>
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
    <input type="button" value="Добавить инженера" 
    		onclick="window.location.href = 'infoEngineer'"/>
    <br/><br/>
    <input type="button" value="Назад" 
    		onclick="window.location.href = '/'"/>		
    		
    		
  </body>
</html>