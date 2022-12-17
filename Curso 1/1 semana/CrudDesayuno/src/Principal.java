
public class Principal {
	public static void main(String[] args) {
		
		Desayuno des1 = new Desayuno("taquitos", 30, 1, "Puebla");
		Desayuno des2 = new Desayuno("memelas", 20, 2, "CDmx");
		Desayuno des3 = new Desayuno("barbacoa", 300, 5, "Pachuca");
		Desayuno des4 = new Desayuno("hotcakes", 20, 1, "Tlaxcala");
		Desayuno des5 = new Desayuno("quesadillas", 20, 1, "Nezca");
		Desayuno desC = null;
		
		Implementacion imp = new Implementacion();
		
		//Guardar
		imp.guardar(des1);
		imp.guardar(des2);
		imp.guardar(des3);
		imp.guardar(des4);
		imp.guardar(des5);
		
		//Mostar
		imp.mostrar();
		
		//Buscar
		desC = new Desayuno("taquitos");
		desC = imp.buscar(desC);
		System.out.println("Desayuno encontrado"+desC);
		
		//Para editar primero hay que buscar
		desC = new Desayuno("barbacoa");
		desC = imp.buscar(desC);
		desC.setPorcion(105);
		imp.editar(desC);
		imp.mostrar();
		
		//Eliminar
		desC = new Desayuno("hotcakes");
		imp.eliminar(desC);
		imp.mostrar();
		
		
		
		//Eliminar todo
		
		//imp.eliminarTodo();
		//imp.mostrar();
		
		//Contar
		
		imp.contador();
		imp.mostrar();
		
		
		//Vacio
		
		imp.vacio();
		
	}//Cierra main

}//Ciera principal
