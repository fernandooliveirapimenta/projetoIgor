<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vencedor</title>
<link rel="stylesheet" type="text/css" href="formatacao/style.css">
</head>
<body>
 <h1>
	 <c:out value="${jogadorService.nome}" />  Parabéns  Você Venceu!<br>
	 
 </h1>
 <img  alt="winner" src="img/venceu.jpg"><br>
 <h1>Todos os vencedores</h1><br>
 <table border="1px">
 	 <tr>  
	   <td>id</td>  
	   <td>nome</td>
	</tr>
	<c:forEach var="p" items="${configService.vencedores}">
	<tr>  
	   <td><c:out value="${p.id}" /></td>  
	   <td><c:out value="${p.nome}" /></td>    
	</tr> 
	</c:forEach>
 </table>	
	
</body>
</html>