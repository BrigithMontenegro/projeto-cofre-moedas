package entities;

public class Euro extends Moeda { // classe euro herdando a classe moeda

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public double converter() { // implementando o m�todo converter da super classe
		return getValor() * 5.26;
	}

}

