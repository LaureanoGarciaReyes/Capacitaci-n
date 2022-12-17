
public class Principal {
	public static void main(String[] args) {
		//Instanciar objeto
		Estado est1 = new Estado();
		
		//seter del objeto
		est1.setNombre("Puebla");
		est1.setCapital("Puebla");
		est1.setExtencion(100);
		est1.setHabitantes(90);
		
		//Declarar los get los valores
		
		System.out.println("Datos del est1");
		System.out.println("Nombre: "+est1.getNombre());
		System.out.println("Capital: "+est1.getCapital());
		System.out.println("Extencion: "+est1.getExtencion());
		System.out.println("Habitantes: "+est1.getHabitantes());
		
		//Constructor
		Estado est2 = new Estado("Chiapas " , "Tuxtlan ", 70, 99);
		System.out.println("Datos del est2 " +est2);
		
	}//cierra main

}//principal
