package com.rvssoft.gestionproductos.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rvssoft.gestionproductos.backend.dummydb.DummyDB;
import com.rvssoft.gestionproductos.backend.model.Familia;
import com.rvssoft.gestionproductos.backend.model.Producto;
import com.rvssoft.gestionproductos.backend.services.ProductoServices;

public class ProductoServicesImpl implements ProductoServices{

	private DummyDB dummyDB = new DummyDB();
	
	@Override
	public void create(Producto producto) {
		dummyDB.getMapaProductos().put(producto.getCodigo(),producto);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto read(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	*
	*/
	@Override
	public List<Producto> getAll() {
		return new ArrayList<Producto>(dummyDB.getMapaProductos().values());
	}

	@Override
	public List<Producto> getByFamilia(Familia familia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getByPriceRange(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> getBetweenDates(Date fecha1, Date fecha2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> getNumeroProductosByFamilia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Double> getPrecioMedioByFamilia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int incrementarPrecioToFamilia(double incremento, Familia familia) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int incrementarPrecioToProductList(double incremento, List<Producto> productos) {
		// TODO Auto-generated method stub
		return 0;
	}

}
