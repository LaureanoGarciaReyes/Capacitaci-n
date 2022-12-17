
public class Principal {

	public static void main(String[] args) {

		Fruta f1 = new Fruta();
		f1.setNombre("mango");
		System.out.println("Nombre  "+f1.getNombre());
		
		Fruta.color = "Rojo";
		System.out.println("color "+Fruta.color);
		
		Fruta.caerse();
		
		System.out.println("La fruta pesa "+Fruta.PESO);

	}// Cierra main

}// cierra principal
