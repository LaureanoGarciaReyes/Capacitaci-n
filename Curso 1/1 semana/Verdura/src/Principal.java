import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String nombre;
		String color;
		double peso;
		Verdura ver = null;
		int menu;
		Scanner lec= null;
		do {
			System.out.println("Bienvenido a su verduleria Java ");
			System.out.println("****MENU*** ");
			System.out.println("1 alta");
			System.out.println("1 editar color");
			System.out.println("1 mostrar");
			System.out.println("4 sali");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Opcion de alta de verdura");
				
				System.out.println("Escribe el nombre de la verdura");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				
				System.out.println("Escribe el color de la verdura");
				lec = new Scanner(System.in);
				color = lec.nextLine();
				
				System.out.println("Escribe el peso de la verdura");
				lec = new Scanner(System.in);
				peso = lec.nextDouble();
				
				ver = new Verdura(nombre, color, peso);
						System.out.println("sedio de alta la Verdura" +ver.getNombre()+"correctamente");
				
				break;
				
			case 2:
				System.out.println("Opcion editar");
				
				System.out.println("Escribe el nuevo color de la verdura");
				lec = new Scanner(System.in);
				color = lec.nextLine();
				System.out.println("Se edito la verdura"+ver);
						
				break;
				
			case 3:
				System.out.println("datos de la Verdura"+ver);
				break;
				
			case 4:
				System.out.println("gracias por su visita");
				break;
				
			
			}//Cierra switch
			
			
		}while(menu<4);
		
		
	}//Cierra main


}//Cierra principal
