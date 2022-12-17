import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Moneda> lista = new ArrayList<>();

		lista.add(new Moneda(1, "Bitcon", "BTC", 44554));
		lista.add(new Moneda(2, "Ethereun", "ETH", 5032));
		lista.add(new Moneda(3, "Cardana", "ADA", 100));

		lista.forEach(ll -> System.out.println("moneda " + ll.getMoneda()));
		
		//Comparacion
		
		lista.stream().filter(val ->val.getValor() >59900).forEach(lis -> System.out.println("Moneda "+lis.getMoneda()));

	}

}
