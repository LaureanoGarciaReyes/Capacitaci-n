package com.mx.principal;
import com.mx.entidad.Alumno;
import com.mx.entidad.Cancion;
import com.mx.implemetacion.impAlumno;
import com.mx.implemetacion.impCancion;

public class Principal {
	public static void main(String[] args) {

		Alumno a1 = new Alumno("m01", "Jode Perez", 24, "Primero");
		Alumno a2 = new Alumno("m02", "Jode gutierrez", 26, "Tercero");
		
		Cancion ca = new Cancion("Amrte duele", "diego" , 4 ,"pop");
		
		//comodin
		Alumno ac = null;
		//implementación
		//Cambiar la i
		impAlumno impA = new impAlumno();
		
		impCancion impC = new impCancion();
		
		impC.guardar(ca);
		impC.mostrar();
		
		//guardar
		impA.guardar(a1);
		impA.guardar(a2);
		
		impA.mostrar();
		
		
		

	}// Ciera main

}// cierra principal
