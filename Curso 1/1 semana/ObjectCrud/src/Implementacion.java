import java.util.HashMap;

public class Implementacion implements Metodos {

	HashMap<Integer, VideoJuegos> hash = new HashMap<Integer, VideoJuegos>();
	VideoJuegos vj = null;
	
	@Override
	public void guardar(Object obj) {
		vj = (VideoJuegos) obj;
		hash.put(vj.getClave(), vj);
	}

	@Override
	public void editar(Object obj) {
		vj = (VideoJuegos) obj;
		hash.put(vj.getClave(), vj);
	}

	@Override
	public void eliminar(Object obj) {
		vj = (VideoJuegos) obj;
		hash.remove(vj.getClave());
	}

	@Override
	public Object buscar(Object obj) {
		vj = (VideoJuegos) obj;
		vj = hash.get(vj.getClave());
		return vj;
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
	}

	public void contar() {
		System.out.println("El hash tiene " + hash.size() + " vjs");
	}

	public void eliminarTodo() {
		hash.clear();
		System.out.println("Se elimino todo");
	}

	public void vacio() {
		if (hash.isEmpty())
			System.out.println("Vacio el hash");
		else
			System.out.println("El hash no esta vacio, tiene " + hash.size() + " vjs");
	}

	public void buscarByGenero(Object obj) {
		vj = (VideoJuegos) obj;
		for (VideoJuegos v : hash.values()) {
			if (v.getGenero().equals(vj.getGenero())) {
				System.out.println("videojuego encontrado " + v);
			}
		}
	}

}
