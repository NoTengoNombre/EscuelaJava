package com.rvssoft.helloword.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Siempre habra una instancia del Singleton
 * 
 *
 */
@WebServlet("/frase")
public class Sv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Variable de instancia de Servlets 
	 * Solo tendra una unica instancia 
	 * 
	 * Si el Servlets no fuera un Singleton - se inyectaria un Singleton
	 */
	
	/**
	 * private static GeneradorFrase generadorFrases = new GeneradorFrase();
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Aqui NO ! Instanciamos un objeto para cada request
		// GeneradorFrase generador
		
		String mensaje = request.getParameter("n");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		int ultimocaracter = mensaje.length();

		char caracter = mensaje.charAt(ultimocaracter - 1);

		out.println("Caracter : " + caracter);

		switch (caracter) {
		case '0':
			out.println("Con " + caracter + " eres un cerrojero ");
			break;
		case '1':
			out.println("Con " + caracter + " eres un viejuno");
			break;
		case '2':
			out.println("Con " + caracter + " ");
			break;
		case '3':
			out.println("Caracter : " + caracter);
			break;
		case '4':
			out.println("Caracter : " + caracter);
			break;
		case '5':
			out.println("Caracter : " + caracter);
			break;
		case '6':
			out.println("Caracter : " + caracter);
			break;
		case '7':
			out.println("Caracter : " + caracter);
			break;
		case '8':
			out.println("Caracter : " + caracter);
			break;
		case '9':
			out.println("Caracter : " + caracter);
			break;
		default:
			out.print("Esta cadena no es valida");
		}

		out.close();
	}

}


//  
//  String strNumero = request.getParameter("n");
//  char ultimaCifra = strNumero.charAt(strNumero.length()-1);
// 
//  System.out.println("Cifra : " + ultimaCifra);
//  
//  response.setContentType("text/html");
//  
//  PrintWrite out = response.getWriter();
// 
//  out.println(GeneradorFrase.getFrase(ultimaCifra);
//  out.clase();
