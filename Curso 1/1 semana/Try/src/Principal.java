
public class Principal {
	public static void main(String[] args) {
		
		String p = null;
		
		try {
		if(p.equals("Hola")) {
			System.out.println("Hola amigo");
		} else {
			System.out.println("Adios amigo");
		}
		}catch(Exception e) {
			System.out.println("Red no disponible "+e);
		}
	}// cierra main

}// cierra principal
