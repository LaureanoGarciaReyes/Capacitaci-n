
public class Principal {
	
	public static void main(String[] args) {
		//Instanciar objeto
		Pais pais1 = new Pais();
		
		//seter del objeto
		pais1.setNombre("México");
		pais1.setCapital("Cuidad de Mexico");
		pais1.setExtencion(11.964);
		pais1.setHabitantes(130);
		
		//Declarar los get los valores
		
		System.out.println("Datos del est1");
		System.out.println("Nombre: "+pais1.getNombre());
		System.out.println("Capital: "+pais1.getCapital());
		System.out.println("Extencion: "+pais1.getExtencion());
		System.out.println("Habitantes: "+pais1.getHabitantes());
		
		//Constructor
		Pais pais2 = new Pais("España " , "Madrid ", 504.642, 47);
		System.out.println("Datos del est2 " +pais2);


    }
}
