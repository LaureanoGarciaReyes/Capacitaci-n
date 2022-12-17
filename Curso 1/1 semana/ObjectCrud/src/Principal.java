import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		VideoJuegos vj1 = new VideoJuegos(1, "Metal Slom", "Aventura", 100);
		VideoJuegos vj2 = new VideoJuegos(2, "kof", "Arcade", 150);
		VideoJuegos vj3 = new VideoJuegos(3, "Mario Bros", "Aventura", 98);
		VideoJuegos vc = null;
		Implementacion imp = new Implementacion();

		// guardar
		imp.guardar(vj1);
		imp.guardar(vj2);
		imp.guardar(vj3);

		// mostrar
		imp.mostrar();

		// buscar
		vc = new VideoJuegos(2);
		vc = (VideoJuegos) imp.buscar(vc);
		System.out.println("videojuego encontrado " + vc);

		// editar
		vc = new VideoJuegos(1);
		vc = (VideoJuegos) imp.buscar(vc);
		vc.setPrecio(200);
		imp.editar(vc);
		imp.mostrar();

		// eliminar
		vc = new VideoJuegos(3);
		imp.eliminar(vc);
		imp.mostrar();

		///////////////////////////////////////////////////////
		int clave;// key
		String nombre;
		String genero;
		double precio;
		VideoJuegos vj = null;
		Scanner lec = null;
		int menu, menuE;
		imp = new Implementacion();
		do {
			System.out.println("********* Bienvenidos a registro de VideoJuegos ***********");
			System.out.println("menu");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 buscar por clave");
			System.out.println("5 contar");
			System.out.println("6 eliminar todo");
			System.out.println("7 vacio");
			System.out.println("8 buscar por genero");
			System.out.println("9 mostrar");
			System.out.println("10 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("OPCIÓN ALTA DE VIDEOJUEGOS");

				System.out.println("Escribe la clave del VideoJuego");
				lec = new Scanner(System.in);
				clave = lec.nextInt();

				System.out.println("Escribe el nombre del VideoJuego");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el genero del VideoJuego");
				lec = new Scanner(System.in);
				genero = lec.nextLine();

				System.out.println("Escribe el precio del VideoJuego");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				vj = new VideoJuegos(clave, nombre, genero, precio);
				imp.guardar(vj);
				System.out.println("Se guardo el videojuego " + vj.getNombre());
				break;
			case 2:
				break;
			case 3:
				System.out.println("Escribe la clave del VideoJuego a eliminar");
				lec = new Scanner(System.in);
				clave = lec.nextInt();
				vj = new VideoJuegos(clave);
				vj = (VideoJuegos) imp.buscar(vj);
				imp.eliminar(vj);
				System.out.println("Se elimno el videojuego " + vj);
				
	
				
				break;
			case 4:
				System.out.println("Escribe la clave del VideoJuego a buscar");
				lec = new Scanner(System.in);
				clave = lec.nextInt();
				vj = new VideoJuegos(clave);
				vj = (VideoJuegos) imp.buscar(vj);
				System.out.println("Se encontro el videojuego " + vj);
				break;
			case 5:
				imp.contar();
				break;
			case 6:
				imp.eliminarTodo();
				break;
			case 7:
				imp.vacio();
				break;
			case 8:
				System.out.println("Escribe el genero del VideoJuego a buscar");
				lec = new Scanner(System.in);
				genero = lec.nextLine();
				vj = new VideoJuegos(genero);
				imp.buscarByGenero(vj);
				break;
			case 9:
				imp.mostrar();
				break;
			case 10:
				System.out.println("adios");
				break;
			}// cierra swith
		} while (menu < 10);
	}// cierra main
}// cierra principal
