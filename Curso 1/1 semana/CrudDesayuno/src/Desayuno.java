
public class Desayuno {
	
	String nombre;// LLave
	double costro;
	int porcion;
	String region;

	public Desayuno() {
	}
	

	public Desayuno(String nombre) {
		this.nombre = nombre;
	}


	public Desayuno(String nombre, double costro, int porcion, String region) {
		this.nombre = nombre;
		this.costro = costro;
		this.porcion = porcion;
		this.region = region;
	}

	@Override
	public String toString() {
		return "Desayuno [nombre=" + nombre + ", costro=" + costro + ", porcion=" + porcion + ", region=" + region
				+ "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCostro() {
		return costro;
	}

	public void setCostro(double costro) {
		this.costro = costro;
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
