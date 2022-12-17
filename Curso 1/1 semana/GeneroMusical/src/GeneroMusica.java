
public class GeneroMusica {
	String nombre;
	int anio;
	String pais;

	public GeneroMusica() {
	}

	public GeneroMusica(String nombre, int anio, String pais) {
		this.nombre = nombre;
		this.anio = anio;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "GeneroMusica [nombre=" + nombre + ", anio=" + anio + ", pais=" + pais + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
