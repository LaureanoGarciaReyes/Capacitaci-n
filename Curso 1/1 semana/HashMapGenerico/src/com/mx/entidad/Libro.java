package com.mx.entidad;

public class Libro {

	String clave;
	String nombre;
	String autor;

	public Libro() {

	}

	public Libro(String clave, String nombre, String autor) {
		this.clave = clave;
		this.nombre = nombre;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [clave=" + clave + ", nombre=" + nombre + ", autor=" + autor + "]\n";
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	



}
