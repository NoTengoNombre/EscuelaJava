package com.rvssoft.helloword.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redireccion")
public class Sv8 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		System.out.println("Redireccionando...");
		
		// Vamos a redireccionar a otro sitio...
		
		// ESTE TIENE QUE EMITIR UNA RESPUTA 
		System.out.println("Dentro del Sv8");
		// QUE LE INDIQUE AL CLIENTE DONDE TIENE QUE DIRIGIRSE
		response.sendRedirect("https://www.w3schools.com/default.asp");
		
	}

}
