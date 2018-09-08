package com.rvssoft.helloword.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/frase")
public class Sv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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
