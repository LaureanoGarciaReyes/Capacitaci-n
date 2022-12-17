import java.util.HashMap;

public class Implementacion implements Metodos {
	
	HashMap<Integer, VideoJuego> hash = new HashMap<Integer, VideoJuego>();
	VideoJuego vj = null;

	@Override
	public void guardar(Object obj) {
		vj = (VideoJuego) obj;
		hash.put(vj.getClave(), vj);
		
	}

	@Override
	public void editar(Object obj) {
		vj = (VideoJuego) obj;
		hash.put(vj.getClave(), vj);
		
	}

	@Override
	public void eliminar(Object obj) {
		vj = (VideoJuego) obj;
		hash.remove(vj.getClave());
		
	}

	@Override
	public Object buscar(Object obj) {
		vj = (VideoJuego) obj;
		vj = hash.get(vj.getClave());
		return vj;
	}

	@Override
	public void mostrar() {
		System.out.println(hash);
		
	}
	
	public void contar() {
		System.out.println(" El Hash tiene "+hash.size() + "vjs");
	}

}
