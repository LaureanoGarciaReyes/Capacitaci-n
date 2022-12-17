import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {
	
	//Aciones que se van a ejecutar

	List<Tipo> lista = new ArrayList<Tipo>();

	@Override
	public void guardar(Tipo gm) {
		// TODO Auto-generated method stub
		lista.add(gm);

	}

	@Override
	public void editar(int indice, Tipo gm) {
		// TODO Auto-generated method stub
		lista.set(indice, gm);

	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);

	}

	@Override
	public Tipo buscar(int indice) {
		// TODO Auto-generated method stub
		Tipo gemu = lista.get(indice);
		return gemu;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);

	}

	public void contador() {
		int con = lista.size();
		System.out.println("La lista tiene " + con + " pizzas");
	}

}
