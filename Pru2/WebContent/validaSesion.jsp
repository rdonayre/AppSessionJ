<%	
	String usuario = (String) session.getAttribute("user");
	boolean procesar = true;
	
	//CONTROLA SESSION
	if ( ( usuario == null || usuario.equalsIgnoreCase("") ) ) {
		System.out.println("usuario mal");
		procesar = false;
    }

    if ( !procesar ) { 
    	response.sendRedirect("index.jsp");
    } 
    
%>