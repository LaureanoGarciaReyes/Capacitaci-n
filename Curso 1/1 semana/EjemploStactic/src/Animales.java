
public class Animales {

	String nombre;
	String tamano;
	static final double PESO = 800;

	public static void vender() {
		System.out.println("el toro tiene un buen peso para venderlo");
	}

	public Animales() {
		super();
	}

	public Animales(String nombre, double peso, String tamano) {
		super();
		this.nombre = nombre;
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", tamano=" + tamano + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

}
