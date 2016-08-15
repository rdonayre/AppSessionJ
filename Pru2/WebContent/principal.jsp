<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ include file="validaSesion.jsp" %>
<head>
	<%@ include file="librerias.jsp" %>
	<script>
	$(document).ready(function(){

		 $(this).bind("contextmenu", function(e) {
             e.preventDefault();
          });
         
		$('#cerrar').click(function() { 
			$.ajax({ 
	            type: "POST", 
	            url: "ValidarUsuario", 
	            dataType:"json", 
	            data: {navName : navigator.appName, navVersion:navigator.appVersion, op:2}, 
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
         }); 
	 });
	</script>
</head>
<body>
	<span>Bienvenido, <label><%=usuario %>; </label></span> <br />
	<label><a href="" id="cerrar">Cerrar sesión</a></label>
</body>
</html>