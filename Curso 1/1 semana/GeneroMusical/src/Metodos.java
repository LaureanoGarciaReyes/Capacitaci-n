
public interface Metodos {
	// guardar editar eliminar mostrar buscar

	public void guardar(GeneroMusica gm);

	public void editar(int indice, GeneroMusica gm);

	public void eliminar(int indice);

	public GeneroMusica buscar(int indice);

	public void mostrar();

}
