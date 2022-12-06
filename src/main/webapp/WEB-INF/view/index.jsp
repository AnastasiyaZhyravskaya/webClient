<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css"
                href="${pageContext.request.contextPath}/css/style.css"/>
<title>Insert title here</title>
</head>
   <body>
      <h1>Welcome</h1>
      <h2>${message}</h2>
      
    
        
      <a href="${pageContext.request.contextPath}/regionList">Регионы</a> 
      <br></br> 
      <a href="${pageContext.request.contextPath}/contingentList">Контингент</a> 
      <br></br>
      <a href="${pageContext.request.contextPath}/engineerList">Инженеры</a> 
      <br></br>
      <a href="${pageContext.request.contextPath}/companyList">Компании</a> 
      <br></br>
      <a href="${pageContext.request.contextPath}/applicationList">Заявки</a> 
   </body>
</html>