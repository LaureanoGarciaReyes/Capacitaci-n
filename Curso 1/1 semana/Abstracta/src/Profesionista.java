
public abstract class Profesionista {// Indicar que esuna clase

	String nombre;
	String app;
	int edad;
	String cedula;
	int experincia;
	String universidad;
	
	
	//Metoodo no abstracto
	
	public void cobrar(String trabajo, double costo) {
		System.out.println("trabajo como " + trabajo + "y me pagan un cposto" +costo);
		
	}

	//metodo abstracto
	
      public abstract void trabajar(); 
      
      
	// no lleva stringto
	public Profesionista() {

	}
	/*
	//Sobrecarga de metodos
	public void Profesionista(String Nombre) {
		System.out.println("El profesionista esta trabajando" +nombre+"Esta descansando");
	}
	public void Profesionista(String Nombre, int eddad) {
		System.out.println("El profesionista esta trabajando" +nombre+"Esta descansando");
		
	}
	public void Profesionista(int edad, String Nombre) {
		System.out.println("El profesionista esta trabajando" +nombre+"Esta descansando");
	}*/

	public Profesionista(String nombre, String app, int edad, String cedula, int experincia, String universidad) {

		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.cedula = cedula;
		this.experincia = experincia;
		this.universidad = universidad;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getExperincia() {
		return experincia;
	}

	public void setExperincia(int experincia) {
		this.experincia = experincia;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

}
