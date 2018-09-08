package com.rvssoft.helloword.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/navegador")
public class sv7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Responder al cliente con información del navegador que esta utilizando
		// Como saber HTTP ServerRequest cual es el navegador del usuario o cliente

// Podemos hacer peticiones de cabecera al navegador
//		http://172.16.2.69:8080/helloworld/navegador
		String browserDetails = request.getHeader("User-Agent");

		System.out.println("Navegador : " + browserDetails);

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("User-Agent:  : " + browserDetails);

		out.close();

	}

}
