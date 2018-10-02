package com.rvssoft.helloword.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sv9 AUNQUE CORRESPONDE AL sv7 deL PROFESOR
 */
@WebServlet("/Sv9")
public class Sv9 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		System.out.println("Dentro de doGet() sv9");
		
		// EL apararto PARA SALTAR A OTRO SERVLET o RECURSO
		
		// Sin Instanciarlo , lo da un objeto request : Sv8 es el nombre de la URL Mapping "el que tenga creado"
		// -! NO podemos hacer out , ni nada , solo syso
		RequestDispatcher rd = request.getRequestDispatcher("/redireccion");
// Le pasamos ambas bolitas
		rd.forward(request, response);
	}
}
