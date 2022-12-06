<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Region List</title>
  </head>
<body>
    <h1>Список регионов</h1>
   
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>id</th>
          <th>Название региона</th>
        </tr>
        <c:forEach  items="${region}" var ="region">
        <c:url var="updateBatton" value="/updateRegion">
        	<c:param name="regionId" value="${region.id}"/>
        </c:url>
        
        <c:url var="deleteBatton" value="/deleteRegion">
        	<c:param name="regionId" value="${region.id}"/>
        </c:url>
        
        <tr>
          <td>${region.id}</td>
          <td>${region.name}</td>
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
    <input type="button" value="Добавить регион" 
    		onclick="window.location.href = 'infoRegion'"/>
    <br/><br/>
    <input type="button" value="Назад" 
    		onclick="window.location.href = '/'"/>		
    		
    		
  </body>
</html>