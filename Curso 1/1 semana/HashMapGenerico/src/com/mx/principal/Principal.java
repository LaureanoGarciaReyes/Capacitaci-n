package com.mx.principal;

import com.mx.entidad.Alumno;
import com.mx.entidad.Cancion;
import com.mx.entidad.Libro;
import com.mx.implementacion.ImpAlumno;
import com.mx.implementacion.ImpCancion;
import com.mx.implementacion.ImpLibro;

public class Principal {
	public static void main(String[] args) {

		// atributos

		Alumno a1 = new Alumno("m01", "Jode Perez", 24, "Primero");
		Alumno a2 = new Alumno("m02", "Jode gutierrez", 26, "Tercero");

		Cancion ca = new Cancion("llora", "Temerarios", 4, "Romanticas");
		Cancion ca1 = new Cancion("viento", "Acostas", 6, "Romanticas");

		Libro l1 = new Libro("L17789", "La vida es un sueño", "Abrosio Beltran");
		Libro l2 = new Libro("L177790178", "Un dia mas", "PaulaH.");

		
		// implementación
		// Cambiar la i
		ImpAlumno impA = new ImpAlumno();
		// comodin
		Alumno ac = null;
		Cancion ci = null;
		Libro lb = null;

		impA.guardar(a1.getMatricula(), a1);
		impA.guardar(a2.getMatricula(), a2);
		impA.mostrar();

		// Editar
		
		

		

		// Canciones

		ImpCancion impc = new ImpCancion();
		impc.guardar(ca.getNombre(), ca);
		impc.guardar(ca1.getNombre(), ca1);
		impc.mostrar();

		// buscar

		// Lbros
		ImpLibro impl = new ImpLibro();
		impl.guardar(l1.getAutor(), l1);
		impl.guardar(l2.getAutor(), l2);
		impl.mostrar();
		
		
		//Mensajes personalizados
		impl.Libro();
		impA.estudiante();
		impc.Canciones();
		
		
		

	}// ciera main

}// cierra principal

