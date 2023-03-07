package entities;

public class Dolar extends Moeda { // classe dolar herdando a classe moeda

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public double converter() { // implementando o método converter da super classe
		return getValor() * 5.16;
	}

}


