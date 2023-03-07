package entities;

public abstract class Moeda {

	private double valor;

	public Moeda(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public abstract double converter();

}


