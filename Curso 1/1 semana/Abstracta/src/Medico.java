
public class Medico extends Profesionista {
	// Atributos

	String colorBata;
	String especialidad;

	public Medico() {

	}

	public Medico(String nombre, String app, int edad, String cedula, int experincia, String universidad,
			String colorBata, String especialidad) {
		super(nombre, app, edad, cedula, experincia, universidad);
		this.colorBata = colorBata;
		this.especialidad = especialidad;
	}
     ///sOBRE ESCRITURA
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", cedula=" + cedula + ", experincia="
				+ experincia + ", universidad=" + universidad + ", colorBata=" + colorBata + ", especialidad="
				+ especialidad + "]\n";
	}

	public String getColorBata() {
		return colorBata;
	}

	public void setColorBata(String colorBata) {
		this.colorBata = colorBata;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Ocupado con un paciente");

	}

}
