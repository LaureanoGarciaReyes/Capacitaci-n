package com.mx.entidad;

public class Cancion {

	String nombre;
	String cantante;
	double duracion;
	String genero;

	public Cancion() {

	}

	public Cancion(String nombre, String cantante, double duracion, String genero) {
		super();
		this.nombre = nombre;
		this.cantante = cantante;
		this.duracion = duracion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + ", cantante=" + cantante + ", duracion=" + duracion + ", genero=" + genero
				+ "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
