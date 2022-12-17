
public class Alumno {

	String matricula; // key,
	String nombre;
	String app;
	int edad;

	// Constructor vacio
	public Alumno() {

	}

    // key
	public Alumno(String matricula) {
		this.matricula = matricula;

	}

	// Constructor completo
	public Alumno(String matricula, String nombre, String app, int edad) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
	}
	///TOstrin
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", app=" + app + ", edad=" + edad + "]\n";
	}
	

	///TOstrin
	

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	
}
