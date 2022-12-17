
public class Principal {

	public static void main(String[] args) {
		Avion a = new Avion("volaris", "EUA", 8789, "Mediano", "Blanco", 3000);

		System.out.println("avion " + a);

		// Moficicara

		a.setCapacidad(2000);
		a.setTamaño("chico");
		a.setDestino("España");

		// Imprecion
		System.out.println("avion " + a);

		// Mensaje Avion
		a.llegar();

		// Areupuerto

		a.gracias();

	}// Cierra main

}// Cierra principal
