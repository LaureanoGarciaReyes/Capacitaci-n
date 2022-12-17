
public class Pais {
	String nombre;
	String capital;
	double extencion;
	int habitantes;
	
	
	
	
	
	public Pais() {
	}
	
	
	
	public Pais(String nombre, String capital, double extencion, int habitantes) {
		this.nombre = nombre;
		this.capital = capital;
		this.extencion = extencion;
		this.habitantes = habitantes;
	}//Constructor



	@Override
	public String toString() {
		return "Pais [nombre=" + nombre + ", capital=" + capital + ", extencion=" + extencion + ", habitantes="
				+ habitantes + "]";
	}



	public String getNombre() {
		return nombre;
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
