$(document).ready(function(){
	
	$("#request-link").click(function(e){
		e.preventDefault();
		$.post(ctx + "/resources/", $("form").serialize(), function(data){
			alert(data);
		});
		return false;
	});
});