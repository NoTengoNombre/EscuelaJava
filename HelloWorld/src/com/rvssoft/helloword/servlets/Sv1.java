package com.rvssoft.helloword.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/Sv1", "/randomnumber" })
public class Sv1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

/**
 * Por cada request se habre un hilo d ejecucion	
 * Para request le llega otro hilo de ejecucion
 * En paralelo , se dan cuotas de cpu
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int numero = (int) (Math.random() * (1 + 10) + 1);
		
		System.out.println(numero);
		
		// se habre otro hilo de ejecucion
		response.setContentType("text/html");
		// Escribe la respuesta en el navegador
		PrintWriter out = response.getWriter();
		// otro hilo : request
		out.println("numero aleatorio : " + numero);
		
		out.close();
		
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
