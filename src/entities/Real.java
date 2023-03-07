package entities;

public class Real extends Moeda { // classe real herdando a classe moeda

	public Real(double valor) {
		super(valor);
	}

	@Override
	public double converter() { // implementando o método converter da super classe
		return getValor();

	}

}
