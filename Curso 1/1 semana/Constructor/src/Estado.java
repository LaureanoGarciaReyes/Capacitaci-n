
public class Estado {
	String nombre;
	String capital;
	double extencion;
	int habitantes;
	
	//constructor
	
	public Estado() {
	}
	
	//Inician nuestros get y set
	public String getNombre() {
		return nombre;
	}
	public Estado(String nombre, String capital, double extencion, int habitantes) {
		this.nombre = nombre;
		this.capital = capital;
		this.extencion = extencion;
		this.habitantes = habitantes;
	}//constructor
	
	
	
	@Override
	public String toString() {
		return "Estado [nombre=" + nombre + ", capital=" + capital + ", extencion=" + extencion + ", habitantes="
				+ habitantes + "]\n";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getExtencion() {
		return extencion;
	}
	public void setExtencion(double extencion) {
		this.extencion = extencion;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	
	
	

}
