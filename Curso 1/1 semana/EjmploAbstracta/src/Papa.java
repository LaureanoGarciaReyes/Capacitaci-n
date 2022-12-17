
public class Papa extends Padres {

	String vestir;
	String ocupacion;
	
	
	public Papa() {
		
	}


	public Papa(String nombre, String app, int edad, String estudios, String vestir, String ocupacion) {
		super(nombre, app, edad, estudios);
		this.vestir = vestir;
		this.ocupacion = ocupacion;
	}


	@Override
	public String toString() {
		return "Papa [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", estudios=" + estudios + ", vestir="
				+ vestir + ", ocupacion=" + ocupacion + "]\n";
	}


	public String getVestir() {
		return vestir;
	}


	public void setVestir(String vestir) {
		this.vestir = vestir;
	}


	public String getOcupacion() {
		return ocupacion;
	}


	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}


	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Actualmenta trabaja");
		
	}

  
	

	
	
	
	
}
