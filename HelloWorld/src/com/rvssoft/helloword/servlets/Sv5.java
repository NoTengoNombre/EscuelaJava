package com.rvssoft.helloword.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// URL Mapping - para realizar peticiones
@WebServlet("/obtener")
public class Sv5 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handleRequest(request, response);

	}

	public void handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {

		// ULR Mapping = obtener

		PrintWriter out = res.getWriter();
		res.setContentType("text/plain");

		Enumeration<String> parameterNames = req.getParameterNames();

		while (parameterNames.hasMoreElements()) {

			String paramName = parameterNames.nextElement();
			out.write(paramName);
			out.write("n");
			String[] paramValues = req.getParameterValues(paramName);
			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
				out.write("t" + paramValue);
				out.write("n");

			}

		}
		out.close();
	}

}

/**
 * Map<K,V>request.getParameterMap(); 
 *
*/