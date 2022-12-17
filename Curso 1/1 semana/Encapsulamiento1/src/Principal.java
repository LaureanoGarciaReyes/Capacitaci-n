
public class Principal {
	public static void main(String[] args) {
		System.out.println("Bienvenidos ");
		
		///Instancia los valores al objeto
				Gato gatoLau = new Gato();
				
				//Seters valores del objeto
				gatoLau.setNombre("Mono");
				gatoLau.setColor("Blanco");
				gatoLau.setEdad(1);
				gatoLau.setAltura(20);
				gatoLau.setGenero("Macho");
				gatoLau.setVacuna(2);
				
				
				//Get Recuperar los valores
				System.out.println("Las caracteristicas de mi mascota son:");
				System.out.println("Nombre: " +gatoLau.getNombre());
				System.out.println("Color: " +gatoLau.getColor());
				System.out.println("Edad: " +gatoLau.getEdad());
				System.out.println("Altura: " +gatoLau.getAltura());
				System.out.println("Genero: " +gatoLau.getGenero());
				System.out.println("Vacuna: " +gatoLau.getVacuna());
				
		
	}//Cierra main
}//Cierra Principal
