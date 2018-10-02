package com.rvssoft.cajondesastre.model.model5;

public class Perro {

	
	private int codigo;
	private String nombre;
	private int vidaMedia;
	
	public Perro(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Perro [codigo=")
		.append(codigo)
		.append(", nombre=")
		.append(nombre)
		.append(", vidaMedia=")
				.append(vidaMedia).append("]");
		return builder.toString();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVidaMedia() {
		return vidaMedia;
	}

	public void setVidaMedia(int vidaMedia) {
		this.vidaMedia = vidaMedia;
	} 
	
	//Tema : Tipo de dato : vida media - 
	
}
