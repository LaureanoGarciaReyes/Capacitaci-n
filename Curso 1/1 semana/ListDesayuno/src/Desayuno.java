
public class Desayuno {
	String nombre;
	double costo;
	int porcion;
	String region;

	public Desayuno() {
	}

	public Desayuno(String nombre) {
		this.nombre = nombre;
	}

	public Desayuno(String nombre, double costo, int porcion, String region) {
		this.nombre = nombre;
		this.costo = costo;
		this.porcion = porcion;
		this.region = region;
	}

	@Override
	public String toString() {
		return "Desayuno [nombre=" + nombre + ", costo=" + costo + ", porcion=" + porcion + ", region=" + region
				+ "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getPorcion() {
		return porcion;
	}

	public void setPorcion(int porcion) {
		this.porcion = porcion;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

}
