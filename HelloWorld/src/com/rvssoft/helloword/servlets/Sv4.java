package com.rvssoft.helloword.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rvssoft.helloword.servicios.NumberFormatter;

@WebServlet("/number")
public class Sv4 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private NumberFormatter numberFormatter = new NumberFormatter();

	/**
	 * Recoger un parametro y convertirlo en un objeto para manejarlos
	 * Servlets recogidas y validación de parametros.
	 * Espero parametro number 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//URL Mapping es : number
				
		// Zona de Recogida de parametros y validacion 
		
		String strNumero = request.getParameter("n");
		
		
		String respuesta = "";
		
		//Analizar el parametro para poner una respuesta mejor
		try {
			respuesta = numberFormatter.convert(strNumero);
		}catch(Exception e) {
			respuesta = "El parametro suministrado no corresponde a un numero en el rango [0..9999]";
		}
		
		// Zona de Emision de parametros y validacion ( LA RESPUESTA )
		
		response.setContentType("text/html");
		// Esta linea se queda aquí
		PrintWriter out = response.getWriter();

		out.println("Valor obtenido : " + respuesta);

		out.close();
 
	}

}
/**
* Servlet tiene como objetivo coger los datos de una base de datos 
* por ejemplo las fechas , tenemos que parsearlo , validarlo
* Recoger parametros y validar
* - Struct - para validar
* SplitNVC - para validar
* 
* En lo casos de error , crear otro hilo para mandar una respuesta , el servlets controla la situación
* el Servlet controla , maneja las respuestas como un guardia y envia , reparte las acciones
* Controlador es el servlets - controlas peticiones
* Modelo - los Pojos o Datos y los servicios 'productos'
* - Server no sabe la tecnologia que se usa - usa los servicios 
* - Servlet usa un objeto para acceder a los datos 'interfaces' y por debajo usará un framework de persistencia
* 
*  - http://localhost:8080/HelloWorld/number?n=444
*  
*  Scanner -> metodo que coge por teclado datos de la consola y que para la ejecución del programa
*  
*  HTTP Request - Respuesta de todos los valores o parametros que recibe 
*/