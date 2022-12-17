
public class Principal {
	
	public static void main(String[] args) {
		Hijo h = new Hijo("Gohan", "Son", 15, "Japones", 1.6, "Delgada", "Negro");
		System.out.println("hijo "+h);
		
		//set Edadd padre
		h.setEdad(25);
		
		
		//set de clase hijo
		h.setAltura(2.0);
		System.out.println("hijo "+h);
		
		h.trabajar();
		h.estudiar();
		h.pelear();
		
	}//cierra main
}//cierra principal
