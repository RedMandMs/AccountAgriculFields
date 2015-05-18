<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri=”http://java.sun.com/jsp/jstl/core” prefix=”c” %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="passportService" class="ru.lenoblgis.trenning.agrocultural.buisnessTier.services.PassportService"
	   scope="session"/>
	<table>
	  <c:forEach var="info" items="${passportService.reviewAllPassport()}">
		  <tr>
		    <td>${info.get("id")}</td>
		    <td>${info.get("id_organization")}</td>
		    <td>${info.get("region")}</td>
		    <td>${info.get("cadastr_number")}</td>
		    <td>${info.get("area")"}</td>
		    <td>${info.get("type_field")}</td>
		    <td>${info.get("comment")}</td>
		  </tr>
	  </c:forEach>
	</table>
</body>
</html>