package entities;

public class Real extends Moeda { // classe real herdando a classe moeda

	public Real(double valor) {
		super(valor);
	}

	@Override
	public double converter() { // implementando o m�todo converter da super classe
		return getValor();

	}

}
