
public class IngSistemas extends Profesionista {
    //atributos      //textencion del padre
	String lenguaje;
	String frawework;

	// Constructor vacio
	public IngSistemas() {

	}

	// herencia con el consatuctor completo
	public IngSistemas(String nombre, String app, int edad, String cedula, int experincia, String universidad,
			String lenguaje, String frawework) {
		super(nombre, app, edad, cedula, experincia, universidad);
		this.lenguaje = lenguaje;
		this.frawework = frawework;
	}

	// ToString
	@Override
	public String toString() {
		return "IngSistemas [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", cedula=" + cedula
				+ ", experincia=" + experincia + ", universidad=" + universidad + ", lenguaje=" + lenguaje
				+ ", frawework=" + frawework + "]\n";
	}

	// Geters

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getFrawework() {
		return frawework;
	}

	public void setFrawework(String frawework) {
		this.frawework = frawework;
	}

	@Override
	public void trabajar() {
		System.out.println("Ocupado con un equipo");
		// TODO Auto-generated method stub
		
	}

}
