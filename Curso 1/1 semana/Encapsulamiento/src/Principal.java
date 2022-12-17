
public class Principal {
	public static void main(String[] args) {
		System.out.println("hola amigos");
		
		///Instancia los valores al objeto
		Perro perroJose = new Perro();
		
		//Seters valores del objeto
		perroJose.setNombre("Manchas");
		perroJose.setRaza("Pastos belga malinois");
		perroJose.setEdad(1);
		perroJose.setAltura(45);
		perroJose.setGenero("Hembra");
		
		//Get Recuperar los valores
		System.out.println("El perro de Jose tiene lo siguiente");
		System.out.println("Nombre " +perroJose.getNombre());
		System.out.println("Raza " +perroJose.getRaza());
		System.out.println("Edad " +perroJose.getEdad());
		System.out.println("Altura " +perroJose.getAltura());
		System.out.println("Genero " +perroJose.getGenero());
		
		
	}//Cierra main

}//Cierra Principal
