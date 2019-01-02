function hola(event){
	alert("hola");
	event.preventDefault();
}

function register(event){
	console.log("entro al register");
	var user = $("input[name='user']").val();
	console.log(user);
	//$.post('profile?user='+user+'',user, function(response){
	//$.post('profile/'+user+'',user, function(response){
	$.post('profile',user, function(response){
		console.log("entro al post");
	});
	event.preventDefault();
}