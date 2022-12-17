
public class Fruta {
	String nombre;
	double precio;
	static String color;
	static final double PESO = 120;

	public void madurar() {
		System.out.println("Cuando estan buenas");
	}

	public static void caerse() {
		System.out.println("La fruta se callo");
	}

	public Fruta() {

	}

	public Fruta(String nombre, double precio, String color, double peso) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		//this.peso = peso;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", precio=" + precio + ", color=" + color +  "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}*/

}
