
public class Refreco {
	
	String nombre;
	String marca;
	String color;
	double precio;
	
	public Refreco() {
	}

	public Refreco(String nombre, String marca, String color, double precio) {
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	
	

	@Override
	public String toString() {
		return "Refreco [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	

}
