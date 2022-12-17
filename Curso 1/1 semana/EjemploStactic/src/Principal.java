
public class Principal {
	public static void main(String[] args) {
		Animales an = new Animales();
		an.setNombre("Negro");
		System.out.println("Nombre del toro es:  "+an.getNombre());
		an.setTamano("Mediano");
		System.out.println("El toro es de tamaño: "+an.tamano);
		
		System.out.println("El peso del toro es: "+Animales.PESO);
		
		
		Animales.vender();
		
	}

}
