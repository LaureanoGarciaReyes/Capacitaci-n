
public class Celular {
	String nombre;
	int precio;
	String color;
	double tamaño;

	// Constructor vacio
	public Celular() {
	}

	// Constructores con datos
	public Celular(String nombre, int precio, String color, double tamaño) {
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.tamaño = tamaño;
	}

	// string
	@Override
	public String toString() {
		return "Celular [nombre=" + nombre + ", precio=" + precio + ", color=" + color + ", tamaño=" + tamaño + "]\n";
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

}
