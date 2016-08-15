<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  
<head>
	<%@ include file="librerias.jsp" %>
	
	<script>
	function message(msg) {
		var title = "<span style='font-size:11px'>ALERTA</span>";
		$( "#message" ).html("<span style='font-size:11px'>"+msg+"</span>");
		$( "#message" ).dialog({
			title: title,
			modal: true,
			width: 400,
			buttons: {
				OK	: function() {
					$( this ).dialog( "close" );
				}
			}
		});
		$( "#message" ).dialog("open");
	}
	
	$(document).ready(function(){

		 $(this).bind("contextmenu", function(e) {
             e.preventDefault();
          });
         
		$.ajax({ 
            type: "POST", 
            url: "ValidarUsuario", 
            dataType:"json", 
            data: {navName : navigator.appName, navVersion:navigator.appVersion, op:0}, 
            async : false, 
            success : function(response){ 
            	if(response.respuesta=='True'){
                    $(location).attr('href',response.mensaje);
				}
            } ,
			error : function(response) {
				message("<span style='font-size:11px'>Se ha producido un error. comuniquese con helpdesk: Tel. 177777</span>");
			},
			complete : function(response) {
			}
		});
		
		$('#login').click(function() { 
			var user = $("#username").val();
			var pwd = $("#password").val();
			$.ajax({ 
	            type: "POST", 
	            url: "ValidarUsuario", 
	            dataType:"json", 
	            data: {navName : navigator.appName, navVersion:navigator.appVersion, op:1, username:user, password:pwd}, 
	            async : false, 
	            success : function(response){ 
	            	if(response.respuesta=='True'){
	                    $(location).attr('href',response.mensaje);
					}else{
						message("<span style='font-size:11px'>"+response.mensaje+"</span>");
	                }
	            } ,
				error : function(response) {
					message("<span style='font-size:11px'>Se ha producido un error. comuniquese con helpdesk: Tel. 177777</span>");
				},
				complete : function(response) {
				}
			});
         }); 
	 });
	</script>
</head>
<body>
		<div id="message"></div>
		<label>User:</label>
		<input id="username" name="username" type="text"  value="" />
		<label>Password:</label>
		<input id="password" name="password" type="password"  value="" />
		<input id="login" name="login" value="Login" type="submit" />
	
</body>
</html>