<%@ taglib uri="http://struts.apache.org/tags-html" prefix="s" %>
<s:html> 
	 <head>
	 <title>Configuração</title> 
	 <link rel="stylesheet" type="text/css" href="formatacao/style.css">
	 </head> 
	 <script src="scripts/entrada.js"></script>
	    <body> 
		  <s:form action="/Configura"> 
		 	<div style="color: red;">
				<ol>
					<s:errors/>
				</ol>
			</div>
			<h1>Escolha as configurações</h1>
		 	<label>Nome:</label><input type="text" name="nome" id="nome" pattern="[a-z\s]+$" ><br>
		 	<label>Linhas:</label><input type="text" name="linha" pattern="[0-9]+$" ><br>
		 	<label>Colunas:</label><input type="text" name="coluna" pattern="[0-9]+$" ><br>
		 	<label>Bombas:</label><input type="text" name="bomba" pattern="[0-9]+$" ><br>
		 	<s:submit value="Enviar"/>
		  </s:form> 
	  </body> 
 </s:html>