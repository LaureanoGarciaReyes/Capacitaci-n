
public class Torta {
	String nombre;
	double precio;
	String region;
	int porcion;
	
	
	public Torta() {
	}


	public Torta(String nombre, double precio, String region, int porcion) {
		this.nombre = nombre;
		this.precio = precio;
		this.region = region;
		this.porcion = porcion;
	}
	


	@Override
	public String toString() {
		return "Torta [nombre=" + nombre + ", precio=" + precio + ", region=" + region + ", porcion=" + porcion + "]\n";
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


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public int getPorcion() {
		return porcion;
	}


	public void setPorcion(int porcion) {
		this.porcion = porcion;
	}
	
	

}
