
public class Padre {
	// Atributos
	String nombre;
	String app;
	int edad;
	String nacionalidad;
	
	public void trabajar() {
		System.out.println("Trabajando ando");
	}
	
	public void pelear() {
		System.out.println("Estoy Pelendo por el trabajo");
	}

	public Padre() {
		
	}

	public Padre(String nombre) {
		
		this.nombre = nombre;
	}

	public Padre(String nombre, String app, int edad, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Principal [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", nacionalidad=" + nacionalidad
				+ "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

}
