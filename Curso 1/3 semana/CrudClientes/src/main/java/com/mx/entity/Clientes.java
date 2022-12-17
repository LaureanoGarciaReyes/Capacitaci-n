package com.mx.entity;

public class Clientes {
	
	/*
	 * CREATE TABLE CLIENTES_XIIF(
 ID NUMBER PRIMARY KEY NOT NULL,
 NOMBRE NVARCHAR2(100),
 APP NVARCHAR2(100),
 APM NVARCHAR2(100),
 TELEFONO NUMBER,
 CORREO NVARCHAR2(100),
 ESTATUS NUMBER   -- 1 ESTA ACTIVO 2 INACTIVO 3 BURO
);

	 * 
	 * */
	
	// variables o atributos 
	int id;
	String nombre;
	String app;
	String apm;
	long telefono;
	String correo;
	int estatus;
	// contructor vacio --> instacias --> en un metodo especial 
	public Clientes() {
		
	}
	// contructor con la llave --> pk
	public Clientes(int id) {
	
		this.id = id;
	}
	// contructor con parametros 
	public Clientes(int id, String nombre, String app, String apm, long telefono, String correo, int estatus) {
		
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.telefono = telefono;
		this.correo = correo;
		this.estatus = estatus;
	}
	
	// permite convertir a cadena cualquier objeto en java --> poder visualizar el compotamiento de mi objeto 
	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", telefono=" + telefono
				+ ", correo=" + correo + ", estatus=" + estatus + "]\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getApm() {
		return apm;
	}
	public void setApm(String apm) {
		this.apm = apm;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
	
	// encapsulamiento --> para tener un mejor control de mi clase 
	

}
