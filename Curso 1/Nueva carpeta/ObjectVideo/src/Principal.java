
public class Principal {
	public static void main(String[] args) {
		
		VideoJuego vj1 = new VideoJuego(1, "Metal Slun", "Aventura", 400);
		VideoJuego vj2 = new VideoJuego(2, "Mario", "Aventura", 200);
		VideoJuego vj3 = new VideoJuego(3, "Viborita", "accion", 20);
		VideoJuego vj4 = new VideoJuego(4, "Gearsofwar", "Combate", 700);
		VideoJuego vj16 = new VideoJuego(16, "Gearsofwar", "Combate", 700);
	
		VideoJuego vc = null;
		
		Implementacion imp = new Implementacion();
		
		//guardar
		imp.guardar(vj1);
		imp.guardar(vj2);
		imp.guardar(vj3);
		imp.guardar(vj4);
		imp.guardar(vj16);
		
		//mostrar
		imp.mostrar();
		
		//buscar
		vc = new VideoJuego(2);
		vc = (VideoJuego) imp.buscar(vc);
		System.out.println("Video juego encontrado "+vc);
		
		//editar
		vc = new VideoJuego(1);
		vc = (VideoJuego) imp.buscar(vc);
		vc.setPrecio(950);
		imp.editar(vc);
		imp.mostrar();
		
		//eliminar
		vc = new VideoJuego(3);
		imp.eliminar(vc);
		imp.mostrar();
		
		
		
	}//cierra main

}//cierra principal
