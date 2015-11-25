$(document).ready(function() {
	$(".btn").click(function() {
		var linha = $(this).attr('x');
		var coluna = $(this).attr('y');
		$("#txtcoluna").val(coluna);
		$("#txtlinha").val(linha);
	})
})