package entities;

public class Euro extends Moeda { // classe euro herdando a classe moeda

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public double converter() { // implementando o método converter da super classe
		return getValor() * 5.26;
	}

}

