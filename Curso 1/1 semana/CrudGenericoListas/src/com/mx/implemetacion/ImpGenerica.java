package com.mx.implemetacion;

import java.util.ArrayList;
import java.util.List;

import com.mx.principal.Metodos;

public class ImpGenerica implements Metodos {

	List<Object> lista = new ArrayList<Object>();

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		lista.add(obj);

	}

	@Override
	public void editar(Object indice, Object obj) {
		// TODO Auto-generated method stub
		lista.set((int) indice, obj);

	}

	@Override
	public void eliminar(Object indice) {
		// TODO Auto-generated method stub
		lista.remove((int) indice);

	}

	@Override
	public Object buscar(Object indice) {
		// TODO Auto-generated method stub
		return lista.get((int) indice);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);

	}

}
