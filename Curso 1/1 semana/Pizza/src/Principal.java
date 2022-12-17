import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		//Codigo duro

		Tipo gm1 = new Tipo("Pizza cuatro estaciones", 600, "Cuadrada");
		Tipo gm2 = new Tipo("Pizza con champiñones", 400, "Redonda");
		Tipo gm3 = new Tipo("Pizza hawaiana", 800, "rectangula");
		Tipo gm4 = new Tipo("Pizza napolitana", 500, "exagonal");
		Tipo gm5 = new Tipo("Pizza fugazza", 200, "cuadrada");

		Tipo gc = null;

		Implementacion imp = new Implementacion();

		// guardar

		imp.guardar(gm1);
		imp.guardar(gm2);
		imp.guardar(gm3);
		imp.guardar(gm4);
		imp.guardar(gm5);

		// Mostar

		imp.mostrar();

		// buscar
		gc = imp.buscar(2);
		System.out.println("Se encontro la pizza " + gc);

		// Para editar primero hay que buscar
		gc = imp.buscar(3);
		gc.setPrecio(1500);
		imp.editar(3, gc);
		imp.mostrar();

		// Eliminar
		imp.eliminar(4);
		imp.mostrar();

		// contador
		imp.contador();

		// Empieza muenu de la pizerria
		String nombre;
		int precio;
		String forma;
		Tipo gm = null;
		int menu, menuE, indice;
		imp = new Implementacion();
		Scanner lec = null;

		do {
			System.out.println("bienvenido a su registro");
			System.out.println(" 1 alta");
			System.out.println(" 2 editar");
			System.out.println(" 3 buscar");
			System.out.println(" 4 eliminar");
			System.out.println(" 5 contar");
			System.out.println(" 6 mostrar");
			System.out.println(" 7 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Opcion de alta de Pizza");

				System.out.println("Escribe el nombre de la pizza");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el precio de la pizza");
				lec = new Scanner(System.in);
				precio = lec.nextInt();

				System.out.println("Escribe la forma de la pizza");
				lec = new Scanner(System.in);
				forma = lec.nextLine();

				gm = new Tipo(nombre, precio, forma);
				imp.guardar(gm);
				System.out.println("Se aguardo Correctamente" + gm.getNombre());

				break;

			case 2:
				System.out.println("Escribe el indice de la pizza que desea  buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				gm = imp.buscar(indice);

				do {
					System.out.println("elige la opcion a editar");
					System.out.println("1 Precio");
					System.out.println("2 Forma");
					System.out.println("3 Menu principal");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {

					case 1:
						System.out.println("Escribe el Precio de la pizza");
						lec = new Scanner(System.in);
						precio = lec.nextInt();
						gm.setPrecio(precio);
						break;

					case 2:
						System.out.println("Escribe la forma de la pizza");
						lec = new Scanner(System.in);
						forma = lec.nextLine();
						gm.setForma(forma);
						break;

					}

				} while (menuE < 3);
				imp.editar(indice, gm);
				System.out.println("Se edito corectamente la pizza " + gm);
				break;

			case 3:
				System.out.println("Escribe el indice de la pizza");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				gm = imp.buscar(indice);
				System.out.println("Se a encontrado  la pizza " + gm);

				break;
			case 4:
				System.out.println("Escribe el indice de la pizza a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				gm = imp.buscar(indice);
				imp.eliminar(indice);
				System.out.println("Pizza eliminada " + gm);

				break;
			case 5:
				imp.contador();

				break;
			case 6:
				imp.mostrar();

				break;
			case 7:
				System.out.println("Gracias por su visita Regrese pronto ");

				break;

			}// Cierra switch

		} while (menu < 7);

	}// Cierra main
}// Cierra principal
