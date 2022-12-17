
public class Avion extends Areupuerto {
	// Atributos

	String tamaño;
	String color;
	int capacidad;

	// Constructor vacio
	public Avion() {

	}

	// Constructor compartido

	public Avion(String nombre, String destino, int matricula, String tamaño, String color, int capacidad) {
		super(nombre, destino, matricula);
		this.tamaño = tamaño;
		this.color = color;
		this.capacidad = capacidad;
	}

	// toString

	@Override
	public String toString() {
		return "Avion [nombre=" + nombre + ", destino=" + destino + ", Matricula=" + Matricula + ", tamaño=" + tamaño
				+ ", color=" + color + ", capacidad=" + capacidad + "]\n";
	}

	// Geters

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	// metodo personalizado
	public void llegar() {
		System.out.println("Haz llegado atu destino");

	}

}
