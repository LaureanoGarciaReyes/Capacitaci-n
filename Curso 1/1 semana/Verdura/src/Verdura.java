
public class Verdura {
	String nombre;
	String color;
	double peso;
	
	public Verdura() {
	}

	public Verdura(String nombre, String color, double peso) {
		this.nombre = nombre;
		this.color = color;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Verdura [nombre=" + nombre + ", color=" + color + ", peso=" + peso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	

}
