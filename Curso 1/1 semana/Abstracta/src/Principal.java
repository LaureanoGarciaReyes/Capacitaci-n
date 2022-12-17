
public class Principal {

	public static void main(String[] args) {

		Medico m = new Medico("Gregory", "Hose", 50, "ced1", 20, "buap", "no usa", "Diagnosta");

		System.out.println("Medico " + m);

		m.trabajar();
		
		m.cobrar("Dianosta", 10000);

		IngSistemas ing = new IngSistemas("Mark", "Zuquenbert", 50, "ce02", 30, "Harvard", "PHP", "Sin framework");
		
		System.out.println("Ing sistemas " + ing);

		// Metodo abstracto
		ing.trabajar();

		// nmetodo no abstracto

		ing.cobrar("Programador", 5680);

		// Nose instancia

	}// Ciera main

}// Cierra principal
