import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {
	List<Desayuno> lista = new ArrayList<Desayuno>();

	@Override
	public void guardar(Desayuno desayuno) {
		lista.add(desayuno);
		
	}

	@Override
	public void editar(int indice, Desayuno desayuno) {
		lista.set(indice, desayuno);
		
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
		
	}

	@Override
	public Desayuno buscar(int indice) {
		Desayuno d = lista.get(indice);
		return d;
	}

	@Override
	public void mostrar() {
		System.out.println(lista);
		
	}
	
	public void contar() {
		int contador = lista.size();
		System.out.println("La lista tiene " +contador+ "Desayuno");
	}
	
	public void vacio() {
		if(lista.isEmpty()) {
			System.out.println("la lista esta vacia");
		} else {
			System.out.println("La lista no esta vacia tiene "+lista.size()+ "desayuno");
		}
	}
	
	public void eliminarTodo() {
		lista.clear();
		System.out.println("Se eliminaron todos los desayunos");
	}
	
	public void buscarPorNombre(Desayuno desayuno) {
		for (Desayuno d : lista) {
			if(d.getNombre().equals(desayuno.getNombre())) {
				System.out.println("Desayuno encontrado"+d);
				break;
			}
		}
	}

}
