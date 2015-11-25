<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.7.min.js"></script>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Jogo</title>
</head>
<link rel="stylesheet" type="text/css" href="formatacao/style.css">
<body>
	<h1>
			Nome: <c:out value="${jogadorService.nome}"/><br>
			Pontos: <c:out value="${jogadorService.pontos}"/><br>
	</h1>
	<form action="Jogada.do">
		<c:forEach var = "i" begin ="1" end="${fn:length(configService.tabuleiro)-1}">
					<c:forEach var = "j" begin ="1" end="${fn:length(configService.tabuleiro[i])-1}">
					
							<td><button type="submit" x="${i}" y="${j}" name="btnJogo" id="bt" class='btn'>${configService.tabuleiro[i][j]}</button></td>
					
					</c:forEach>
					<br>
				</c:forEach>
			<br/>
		<p>
					<input type="text" id="txtlinha" name="clickLinha">
					<input type="text" id="txtcoluna" name="clickColuna">
	</form>
	
</body>
<script src="scripts/jogo.js"></script>
</html>