package com.rvssoft.cajondesastre.client;

import java.util.List;

import com.rvssoft.cajondesastre.model.model6.Familia;
import com.rvssoft.cajondesastre.model.model6.Producto;
import com.rvssoft.cajondesastre.services.ProductoServices;
import com.rvssoft.cajondesastre.services.impl.ProductoServicesImpl;

/**
 * Esta clase esta acomplada a una determinada implementacion
 * Lo ideal es que no importara esa clase
 * @author Formacion
 * 
 * Spring : inyeccion de dependencias : coge la implementación que quiero usar
 *  
 * - Patch Panel , a una clase le metodo la implementación que quiera aunque 
 * no este instancia el objeto
 *
 */
public class TestClass {

	/**
	 * Objeto que se usa para hacer una persistencia : para guardarlo en BD
	 */
	private ProductoServices productoServices = new ProductoServicesImpl();
	
	/**
	 * Lanzar aplicacion
	 * 
	 * Estamos programando contra una Interfaces , da igual la implementación
	 * 
	 */
	private void run() {
	
		// Este producto lo creamos a partir de informacion
		// obtenida a traves de un formulario
		Producto p = new Producto();
		
		// Para crear la persistencia , creamos un objeto productosServices y le añadimos p
		productoServices.create(p);
		
		// El formulario necesita 'pintar' una tabla de todos los productos
		 
		List<Producto> productos = productoServices.getAll();
		
		// El formulario necesita 'pintar' una tabla de consumibles
		
		List<Producto> consumibles = productoServices.getByFamilia(Familia.CONSUMIBLE);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String [] args) {
		new TestClass().run();
 	}
}
