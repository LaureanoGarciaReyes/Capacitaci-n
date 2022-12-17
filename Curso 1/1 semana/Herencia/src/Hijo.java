
public class Hijo extends Padre {
	// Atributos
	double altura;
	String complexion;
	String colorCabello;// camel
	
	public void estudiar () {
		System.out.println("Estudiando estoy");
		
	}

	public Hijo() {
	}

	public Hijo(String nombre, String app, int edad, String nacionalidad, double altura, String complexion,
			String colorCabello) {
		super(nombre, app, edad, nacionalidad);
		this.altura = altura;
		this.complexion = complexion;
		this.colorCabello = colorCabello;
	}

	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", nacionalidad=" + nacionalidad
				+ ", altura=" + altura + ", complexion=" + complexion + ", colorCabello=" + colorCabello + "]\n";
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getComplexion() {
		return complexion;
	}

	public void setComplexion(String complexion) {
		this.complexion = complexion;
	}

	public String getColorCabello() {
		return colorCabello;
	}

	public void setColorCabello(String colorCabello) {
		this.colorCabello = colorCabello;
	}

}
