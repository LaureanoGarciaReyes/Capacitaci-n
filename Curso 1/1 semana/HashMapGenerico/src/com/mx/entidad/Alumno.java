package com.mx.entidad;

public class Alumno {

	// ATributos

	String matricula;
	String nombre;
	int edad;
	String grado;

	public Alumno() {

	}

	public Alumno(String matricula, String nombre, int edad, String grado) {

		this.matricula = matricula;
		this.nombre = nombre;
		this.edad = edad;
		this.grado = grado;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", edad=" + edad + ", grado=" + grado + "]\n";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

}
