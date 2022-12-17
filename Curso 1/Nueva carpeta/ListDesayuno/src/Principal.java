import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String nombre;
		double costo;
		int porcion;
		String region;
		Desayuno desayuno = null;
		int menu, menuE, indice;
		Implementacion imp = new Implementacion();
		Scanner lec = null;

		do {
			System.out.println("Bienvenidos a su fondita JAVEROS");
			System.out.println("+++++MENU+++++++");
			System.out.println("1 alta");
			System.out.println("2 editar (Costo, Region)");
			System.out.println("3 eliminar");
			System.out.println("4 buscar pór indice ");
			System.out.println("5 contar");
			System.out.println("6 vacio");
			System.out.println("7 eliminar todos los registros");
			System.out.println("8 buscar por nombre");
			System.out.println("9 mostrar");
			System.out.println("10 Salir :)");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Opcion de alta de Desayuno");

				System.out.println("Escribe el nombre del desayuno");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el costo del desayuno");
				lec = new Scanner(System.in);
				costo = lec.nextDouble();

				System.out.println("Escribe la porcion del desayuno");
				lec = new Scanner(System.in);
				porcion = lec.nextInt();

				System.out.println("Escribe la region del desayuno");
				lec = new Scanner(System.in);
				region = lec.nextLine();

				desayuno = new Desayuno(nombre, costo, porcion, region);
				imp.guardar(desayuno);

				break;
			case 2:
				// editar
				imp.mostrar();
				System.out.println("Escribe el indice a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				desayuno = imp.buscar(indice);
				do {
					System.out.println("Menu Editar");
					System.out.println("1 costo");
					System.out.println("2 Region");
					System.out.println("3 Menu Principal");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {
					case 1:
						System.out.println("Escribe el nuevo costo del desayuno");
						lec = new Scanner(System.in);
						costo = lec.nextDouble();
						desayuno.setCosto(costo);
						break;
					case 2:
						System.out.println("Escribe la nueva region del desayuno");
						lec = new Scanner(System.in);
						region = lec.nextLine();
						desayuno.setRegion(region);

						break;

					}// cierra Switch menuE

				} while (menuE < 3);
				imp.editar(indice, desayuno);
				System.out.println("Se edito correctamente el desayuno " + desayuno);
				break;
			case 3:
				System.out.println("Escribe el indice a eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				desayuno = imp.buscar(indice);
				imp.eliminarTodo();
				System.out.println("Se elimino el desayuno" + desayuno);
				break;
			case 4:
				System.out.println("Escribe el indice a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				desayuno = imp.buscar(indice);
				System.out.println("Se emcontro el desayuno" + desayuno);
				break;
			case 5:
				imp.contar();
				break;
			case 6:
				imp.vacio();
				break;
			case 7:
				imp.eliminarTodo();
				break;
			case 8:
				System.out.println("Escribe el desayuno a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				//Forma 1
				//desayuno = new Desayuno();
				//desayuno.setNombre(nombre);
				
				//Forma 2
				//desayuno = new Desayuno(nombre, 0, 0, null);
				
				//Forma 3
				desayuno = new Desayuno(nombre);
				
				//System.out.println("Desayuno encontrado");
				imp.buscarPorNombre(desayuno);
				break;
			case 9:
				imp.mostrar();
				break;
			case 10:
				System.out.println("adios :)");
				break;

			}// cierra switch

		} while (menu < 10);
	}// cierra main

}// cierra principal
