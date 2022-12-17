import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		GeneroMusica gm1 = new GeneroMusica("pop", 100, "Usa");
		GeneroMusica gm2 = new GeneroMusica("rock", 200, "Mex");
		GeneroMusica gm3 = new GeneroMusica("Cumbia", 80, "Mex");
		GeneroMusica gm4 = new GeneroMusica("Metal", 200, "Usa");
		GeneroMusica gm5 = new GeneroMusica("Bachata", 150, "Usa");
		GeneroMusica gc = null;

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
		System.out.println("Genero encontrado " + gc);

		// Para editar primero hay que buscar
		gc = imp.buscar(3);
		gc.setAnio(1500);
		imp.editar(3, gc);
		imp.mostrar();

		// Eliminar
		imp.eliminar(4);
		imp.mostrar();

		// contador
		imp.contador();

		// Empieza muenu
		String nombre;
		int anio;
		String pais;
		GeneroMusica gm = null;
		int menu, menuE, indice;
		imp = new Implementacion();
		Scanner lec = null;

		do {
			System.out.println("bienvenido asu registro");
			System.out.println(" 1 alta");
			System.out.println("2 editar");
			System.out.println("3 buscar");
			System.out.println("4 eliminar");
			System.out.println("5 contar");
			System.out.println("6 mostrar");
			System.out.println("7 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Opcion de alta de generos");
				
				System.out.println("Escribe el nombre del genero");
				lec =new Scanner(System.in);
				nombre =lec.nextLine();
				
				System.out.println("Escribe el año del genero");
				lec =new Scanner(System.in);
				anio =lec.nextInt();
				
				System.out.println("Escribe el pais del genero");
				lec =new Scanner(System.in);
				pais =lec.nextLine();
				
				gm = new GeneroMusica(nombre, anio, pais);
				imp.guardar(gm);
				System.out.println("Se aguardo Correctamente"+gm.getNombre());
				
				break;

			case 2:
				System.out.println("Escribe el indice del genero a buscar");
				lec =  new Scanner(System.in);
				indice = lec.nextInt();
				gm = imp.buscar(indice);
				
				do {
					System.out.println("elige la opcion a editar");
					System.out.println("1 años");
					System.out.println("2 pais");
					System.out.println("3 Menu principal");
					
					lec = new Scanner(System.in);
					menuE = lec.nextInt();
					
					switch (menuE) {
					
					
					case 1 :
						System.out.println("Escribe el año del genro de año");
						lec =new Scanner(System.in);
						anio = lec.nextInt();
						gm.setAnio(anio);
						break;
						
					case 2 :
						System.out.println("Escribe el nuevo genero");
						lec =new Scanner(System.in);
						pais = lec.nextLine();
						gm.setPais(pais);
						break;
						
					
					}
					
					
				}while (menuE < 3);
				imp.editar(indice, gm);
				System.out.println("Se edito el genero musical "+ gm);
				break;

			case 3:
				System.out.println("Escribe el indice de genero a abuscar");
				lec =  new Scanner(System.in);
				indice = lec.nextInt();
				gm = imp.buscar(indice);
				System.out.println("Genero encontrado " +gm);

				break;
			case 4:
				System.out.println("Escribe el indice de genero a eliminar");
				lec =  new Scanner(System.in);
				indice = lec.nextInt();
				gm = imp.buscar(indice);
				imp.eliminar(indice);
				System.out.println("Genero eliminado " +gm);

				break;
			case 5:
				imp.contador();

				break;
			case 6:
				imp.mostrar();

				break;
			case 7:
				System.out.println("Gracias por su visita: ");

				break;

			}// Cierra switch

		} while (menu < 7);

	}// Cierra main
}// Cierra principal
