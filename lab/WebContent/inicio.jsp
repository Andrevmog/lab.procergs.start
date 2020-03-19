<! DOCTYPE html>
    <%@page import="com.procergs.starter.domain.Offer" %>
    <%@page import="com.procergs.starter.db.OfferDao" %>
    <%@page import="com.procergs.starter.web.controllers.OfferController" %>
    <%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="teste">
		<input type="submit" value="Lista">
	</form>
	
	
<%
List<Offer> lista = (List<Offer>)request.getAttribute("lista");

for(Offer offer : lista) {
	out.println(offer.getId()+" "+
			offer.getProcurementNumber()+" "+
			offer.getProcurementYear()+" "+
			offer.getIdCompany()+" "+
			offer.getCoordinator()+"<br/>");					
}

%>
</body>
</html>