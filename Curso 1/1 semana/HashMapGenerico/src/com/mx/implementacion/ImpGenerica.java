package com.mx.implementacion;

import java.util.HashMap;

import com.mx.principal.Metodos;

public class ImpGenerica implements Metodos {

	HashMap<Object, Object> hash = new HashMap<Object, Object>();

	@Override
	public void guardar(Object key, Object obj) {
		// TODO Auto-generated method stub
		hash.put(key, obj);

	}

	@Override
	public void editar(Object key, Object obj) {
		// TODO Auto-generated method stub
		hash.put(key, obj);

	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		hash.remove(key);
	}

	@Override
	public Object guardar(Object key) {
		// TODO Auto-generated method stub
		return hash.get(key);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);

	}

	public void Libro() {
		System.out.println("Estos son algunos libros mas comprados");
	}

	public void estudiante() {
		System.out.println("Los estudiantes estudian mucho para obtener buenas noctas");
	}

	public void Canciones() {
		System.out.println("Las canciones son de la epoca de los 80");
	}

}
