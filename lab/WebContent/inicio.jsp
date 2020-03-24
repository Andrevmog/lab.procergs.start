<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
	
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<! DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Início</title>
</head>
<body>	
<c:forEach items="${offers}" var="item">
  <c:out value="${item.id}"/>
  <c:out value="${item.procurementNumber}"/>
  <c:out value="${item.procurementYear}"/>
  <c:out value="${item.idCompany}"/>
  <c:out value="${item.coordinator}"/>
</c:forEach>	
</body>
</html>