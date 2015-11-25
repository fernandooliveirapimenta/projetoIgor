function validaCampo(){
	if(document.querySelector('#nome').value == ' '){
		alert("nenhum campo pode ficar em branco");
		return false;
	}
}