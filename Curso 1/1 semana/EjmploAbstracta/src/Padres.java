
public abstract class Padres {
	
	String nombre;
	String app;
	int edad;
	String estudios;
	
	
	
	public abstract void trabajar(); 
	
	//Constructor vacio
	public Padres() {
		
	}
	
	public void cobrar(double costo) {
		System.out.println("me pagan mensualmente  " +costo);
	}

	public Padres(String nombre, String app, int edad, String estudios) {
		super();
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.estudios = estudios;
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

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	
	

}
