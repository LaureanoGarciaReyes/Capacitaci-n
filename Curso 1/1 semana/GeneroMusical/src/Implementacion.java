import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {

	List<GeneroMusica> lista = new ArrayList<GeneroMusica>();

	// se debe importar
	@Override
	public void guardar(GeneroMusica gm) {
		// TODO Auto-generated method stub
		lista.add(gm);
	}

	@Override
	public void editar(int indice, GeneroMusica gm) {
		// TODO Auto-generated method stub
		lista.set(indice, gm);

	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);

	}

	@Override
	public GeneroMusica buscar(int indice) {
		// TODO Auto-generated method stub
		GeneroMusica gemu = lista.get(indice);
		return gemu;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);

	}
	
	public void contador() {
		int con = lista.size();
		System.out.println("La lista tiene"+con+" generos");
	}

}
