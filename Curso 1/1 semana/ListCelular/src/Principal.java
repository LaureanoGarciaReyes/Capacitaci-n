import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// codigo duro

		Celular c1 = new Celular("Motorola", 5000, "negro", 64);
		Celular c2 = new Celular("Lg", 3000, "rojo", 32);
		Celular c3 = new Celular("Zte", 1000, "azul", 120);
		Celular c4 = new Celular("Sansung", 8000, "cafe", 64);
		Celular c5 = new Celular("Iphone", 10000, "blanco", 124);
		Celular tc = null; // Comodin

		List<Celular> lista = new ArrayList<Celular>();

		// Agregar
		/* 0 */lista.add(c1);
		/* 1 */lista.add(c2);
		/* 2 */lista.add(c3);
		/* 3 */lista.add(c4);
		/* 4 */lista.add(c5);

		// Listar
		System.out.println("Celulares " + lista);

		// Buscar
		tc = lista.get(3);
		System.out.println("celular encontrado " + c1);

		// para editar primero hay que buscar
		tc = lista.get(1);
		tc.setPrecio(120);
		lista.set(1, c1);
		System.out.println("Celulares " + lista);// syso

		// Eliminar
		tc = lista.get(0);
		lista.remove(0);
		System.out.println("El celular eliminado es " + tc);
		System.out.println("Lista " + lista);

		// Empieza torta Menu
		String nombre;
		int precio;
		String color;
		double tamaño;
		Celular celular = null;
		Scanner lec = null;
		int menu = 0, indice = 0;
		lista = new ArrayList<Celular>();

		do {
			System.out.println("Bienvenidos a la tienda de celulares JAVEROS");
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
				System.out.println("Opcion de Celulares");

				System.out.println("Escribe el nombre del Celular");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el precio del Celular");
				lec = new Scanner(System.in);
				precio = lec.nextInt();

				System.out.println("Escribe el color del celular");
				lec = new Scanner(System.in);
				color = lec.nextLine();

				System.out.println("Escribe el tamaño de almacenamiento");
				lec = new Scanner(System.in);
				tamaño = lec.nextInt();

				celular = new Celular(nombre, precio, color, tamaño);
				lista.add(celular);
				System.out.println("Se aguardo el celular " + celular.getNombre());

				break;

			case 2:// antes de editar hay que buscar
				System.out.println("Escribe el indice a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				celular = lista.get(indice);

				System.out.println("Escrie eel precio del celular");
				lec = new Scanner(System.in);
				precio = lec.nextInt();

				celular.setPrecio(precio);
				lista.set(indice, celular);
				System.out.println("Se edito el celular " +celular);

				break;

			case 3:
				System.out.println("Escribe el indice a eliminar del celular");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				celular = lista.get(indice);
				System.out.println("Se elimino el celular" +celular);
				break;

			case 4:
				System.out.println("Escribe el indice a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				celular= lista.get(indice);// lista de indializan con el 0 simpre
				System.out.println("Celular encontrado " + celular);
				break;

			case 5:
				System.out.println("Datos ddel celular" +celular);
				break;

			case 6:
				System.out.println("Hasta pronto");
				break;
			}

		} while (menu < 6);

	}

}
