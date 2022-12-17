
public class Principal {
	
	public static void main(String[] args) {
		
		Papa pa = new Papa("Paulo", "lopez", 30, "Ing sistemas", "Formal", "Programar");
		System.out.println("Datos del " + pa);
		pa.trabajar();
		pa.cobrar( 30000);
		
		
		Mama ma = new Mama("Daniela", "Perez", 20, "Licenciatura en administracion", "siempre se maquilla", "siempre usa bolsos");
		System.out.println("Datos del " + ma);
		ma.trabajar();
		ma.cobrar( 10000);
	}

}
