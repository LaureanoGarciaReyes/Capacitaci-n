
public interface Metodos {
	// guardar editar eliminar mostrar buscar

	public void guardar(Tipo gm);

	public void editar(int indice, Tipo gm);

	public void eliminar(int indice);

	public Tipo buscar(int indice);

	public void mostrar();

}
