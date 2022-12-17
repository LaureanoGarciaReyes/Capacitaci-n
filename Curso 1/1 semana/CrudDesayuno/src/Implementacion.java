import java.util.HashMap;

public class Implementacion implements Metodos{
	
	HashMap<String, Desayuno> hash = new HashMap<String, Desayuno>();

	@Override
	public void guardar(Desayuno desayuno) {
		// TODO Auto-generated method stub
		hash.put(desayuno.getNombre(), desayuno);
		
	}

	@Override
	public void editar(Desayuno desayuno) {
		// TODO Auto-generated method stub
		hash.put(desayuno.getNombre(), desayuno);
		
	}

	@Override
	public void eliminar(Desayuno desayuno) {
		// TODO Auto-generated method stub
		hash.remove(desayuno.getNombre());
		
	}

	@Override
	public Desayuno buscar(Desayuno desayuno) {
		// TODO Auto-generated method stub
		desayuno = hash.get(desayuno.getNombre());
		return desayuno;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
		
	}
	
	public void eliminarTodo() {
		hash.clear();
		System.out.println("Se eliminaron todos los registros");
	}
	
	public void contador() {
		int con = hash.size();
		System.out.println("La hash tiene " + con + " Desayunos");
	}
	
	public void vacio() {
		int ac = hash.size();
		if (ac == 0) {//si si esta vacio
			System.out.println("La hash si esta vacia ");
		}else {//no esta vacio
			System.out.println("La hash no esta vacia ");
		}
		
	}

}
