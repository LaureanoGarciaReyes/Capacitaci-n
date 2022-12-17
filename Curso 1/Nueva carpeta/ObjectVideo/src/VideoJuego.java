
public class VideoJuego {
	int clave; // key
	String nombre;
	String genero;
	double precio;

	public VideoJuego() {
	}

	public VideoJuego(int clave) {
		this.clave = clave;
	}

	public VideoJuego(int clave, String nombre, String genero, double precio) {
		this.clave = clave;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "VideoJuego [clave=" + clave + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio
				+ "]\n";
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
