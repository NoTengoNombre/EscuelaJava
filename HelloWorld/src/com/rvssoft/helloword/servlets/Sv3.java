package com.rvssoft.helloword.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rvssoft.helloword.servicios.GeneradorServidor;

 
@WebServlet("/fraseprofe")
public class Sv3 extends HttpServlet {
	
	// Aparato para generar las frases
	private GeneradorServidor generadorFrase = new GeneradorServidor();
	
	private static final long serialVersionUID = 1L;

// private static void int
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//	 String strNumero = request.getParameter("n");
//	 char ultimaCifra = strNumero.charAt(strNumero.length() -1 );
//	 
//	 System.out.println("cifra : " + ultimaCifra);
//	 
//	 response.setContentType("text/html");
//	 
//	 PrintWriter out = response.getWriter();
//	 
//	 out.println(Frase.get);
	}

}
