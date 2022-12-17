
public class Tipo {
	
    //Atributos
	String nombre;
	int precio;
	String forma;

	// Constructores
	public Tipo() {
	}

	public Tipo(String nombre, int precio, String forma) {
		this.nombre = nombre;
		this.precio = precio;
		this.forma = forma;
	}

	@Override
	public String toString() {
		return "Tipo [nombre=" + nombre + ", precio=" + precio + ", forma=" + forma + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	

}