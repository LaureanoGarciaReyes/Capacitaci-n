import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		String nombre;
		String marca;
		String color;
		double precio;
		Refreco ver = null;
		int menu;
		Scanner lec= null;
		
		do {
			System.out.println("Bienvenido a la refrequera ");
			System.out.println("****MENU*** ");
			System.out.println("1 alta");
			System.out.println("2 editar color");
			System.out.println("3 mostrar");
			System.out.println("4 sali");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			
			case 1:
				System.out.println("Opcion de alta de Refreco");
				
				System.out.println("Escribe el nombre del Refresco");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				System.out.println("Escribe la marca del Refresco");
				lec = new Scanner(System.in);
				marca = lec.nextLine();
				
				System.out.println("Escribe el color del refresco");
				lec = new Scanner(System.in);
				color = lec.nextLine();
				
				System.out.println("Escribe el Precio del Refresco");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				
				ver = new Refreco(nombre, marca, color, precio);
				System.out.println("sedio de alta el refresco" +ver.getNombre()+"correctamente");
				
				break;
				
			case 2:
				System.out.println("Opcion editar");
				
				System.out.println("Escribe el nuevo color del refresco");
				lec = new Scanner(System.in);
				color = lec.nextLine();
				System.out.println("Se edito el refresco"+ver);
						
				break;
				
			case 3:
				System.out.println("datos del Refresco"+ver);
				break;
				
			case 4:
				System.out.println("gracias por su visita");
				break;
				
			
			
			}
			
			
		}while(menu<4);
	}

}
