import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {// main
		// codigo duro
		Torta t1 = new Torta("Milaneza", 30, "Puebla", 1);
		Torta t2 = new Torta("Hawaiana", 50, "Neza", 2);
		Torta t3 = new Torta("Cubana", 70, "Tlaxcala", 1);
		Torta t4 = new Torta("Pierna", 65, "Oaxaca", 1);
		Torta t5 = new Torta("Salchicha", 20, "Pachuca", 1);
		Torta tc = null; // Comodin

		List<Torta> lista = new ArrayList<Torta>();

		// Agregar
		/* 0 */lista.add(t1);
		/* 1 */lista.add(t2);
		/* 2 */lista.add(t3);
		/* 3 */lista.add(t4);
		/* 4 */lista.add(t5);

		// Listar
		System.out.println("Lista " + lista);

		// Buscar
		tc = lista.get(3);
		System.out.println("torta encontrada " + tc);

		// para editar primero hay que buscar
		tc = lista.get(1);
		tc.setPrecio(120);
		lista.set(1, tc);
		System.out.println("Lista " + lista);// syso

		// Eliminar
		tc = lista.get(0);
		lista.remove(0);
		System.out.println("La torta eliminada es " + tc);
		System.out.println("Lista " + lista);

		// Empieza torta Menu
		String nombre;
		double precio;
		String region;
		int porcion;
		Torta torta = null;
		Scanner lec = null;
		int menu = 0, indice = 0;
		lista = new ArrayList<Torta>();
        
		try {
		do {
			//Agregado
			//try {
			System.out.println("Bienvenidos a su tortilleria JAVEROS");
			System.out.println("*************Menu*******************");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 buscar");
			System.out.println("5 mostar");
			System.out.println("6 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {// contol + shif + f
			case 1:
				System.out.println("Opcion de tortas");

				System.out.println("Escribe el nombre de la torta");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el precio de la torta");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				System.out.println("Escribe la region de la torta");
				lec = new Scanner(System.in);
				region = lec.nextLine();

				System.out.println("Escribe la porcion de la torta");
				lec = new Scanner(System.in);
				porcion = lec.nextInt();

				torta = new Torta(nombre, precio, region, porcion);
				lista.add(torta);
				System.out.println("Se aguardo la torta " + torta.getNombre());

				break;

			case 2:// antes de editar hay que buscar
				System.out.println("Escribe el indice a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				torta = lista.get(indice);

				System.out.println("Escrie eel precio de la torta");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				torta.setPrecio(precio);
				lista.set(indice, torta);
				System.out.println("Se edito la torta " + torta);

				break;

			case 3:
				System.out.println("Escribe el indice a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				torta = lista.get(indice);
				System.out.println("Se elimino la torta " + torta);
				break;

			case 4:
				System.out.println("Escribe el indice a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				torta = lista.get(indice);//lista de indializan con el 0 simpre
				System.out.println("Torta enontrada " + torta);
				break;

			case 5:
				System.out.println("Datos de la torta"+torta);
				break;

			case 6:
				System.out.println("Adios");
				break;
			}
			//Agregado
			/*}catch(Exception e) {
				System.out.println("Error vuelva a ingresar correctamente los datos "+e);
			}*/

		} while (menu < 6);
	}catch(Exception e) {
		System.out.println("Error vuelva a ingresar correctamente los datos "+e);
	}
	}// cierra main

}// Cierra principal
