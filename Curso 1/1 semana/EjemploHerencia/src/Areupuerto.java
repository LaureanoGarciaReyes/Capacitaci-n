
public class Areupuerto {
	// Aributos
	String nombre;
	String destino;
	int Matricula;

	// Constructor vacio
	public Areupuerto() {

	}
	// Constructor por nombre

	public Areupuerto(String nombre) {
		this.nombre = nombre;
	}

	// Constructor completo
	public Areupuerto(String nombre, String destino, int matricula) {
		super();
		this.nombre = nombre;
		this.destino = destino;
		Matricula = matricula;
	}
	// ToString

	@Override
	public String toString() {
		return "Areupuerto [nombre=" + nombre + ", destino=" + destino + ", Matricula=" + Matricula + "]\n";
	}

	// Geters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	// Metodo personalizado

	public void gracias() {
		System.out.println("Gracias por eligir volar con nosotros");

	}

}
