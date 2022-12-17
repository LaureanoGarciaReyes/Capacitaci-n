
public class Mama extends Padres{
	
	
	String maquille;
	String bolso;
	
	
	public Mama() {
		
	}


	public Mama(String nombre, String app, int edad, String estudios, String maquille, String bolso) {
		super(nombre, app, edad, estudios);
		this.maquille = maquille;
		this.bolso = bolso;
	}


	@Override
	public String toString() {
		return "Mama [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", estudios=" + estudios + ", maquille="
				+ maquille + ", bolso=" + bolso + "]";
	}


	public String getMaquille() {
		return maquille;
	}


	public void setMaquille(String maquille) {
		this.maquille = maquille;
	}


	public String getBolso() {
		return bolso;
	}


	public void setBolso(String bolso) {
		this.bolso = bolso;
	}


	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Esta de vacaciones");
		
	}
	
	
	
	
	

}
