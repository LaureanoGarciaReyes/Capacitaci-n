
public class Moneda {
	int codigo;
	String moneda;
	String descripcion;
	double valor;

	public Moneda() {

	}

	public Moneda(int codigo, String moneda, String descripcion, double valor) {
		super();
		this.codigo = codigo;
		this.moneda = moneda;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Moneda [codigo=" + codigo + ", moneda=" + moneda + ", descripcion=" + descripcion + ", valor=" + valor
				+ "]\n";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
