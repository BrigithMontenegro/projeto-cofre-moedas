package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.Dolar;
import entities.Euro;
import entities.Moeda;

public class Cofrinho {

	List<Moeda> listaMoedas = new ArrayList<Moeda>();

	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}

	public void remover(Moeda moeda) {
		Iterator<Moeda> it = listaMoedas.iterator();
		while (it.hasNext()) {
			Moeda m = it.next();
			if (m.getClass() == moeda.getClass()) {
				if (m.getValor() == moeda.getValor()) {
					it.remove();
				}
			}
		}
	}

	public void listarMoedas() {
		int dolar = 0;
		int euro = 0;
		int real = 0;
		for (Moeda moeda : listaMoedas) {
			if (moeda instanceof Dolar) {
				dolar += moeda.getValor();
			} else if (moeda instanceof Euro) {
				euro += moeda.getValor();
			} else {
				real += moeda.getValor();
			}
		}
		System.out.println("Listando todas as Moedas dentro do Cofrinho");
		System.out.print(dolar + " Dólares \n" + euro + " Euros \n" + real + " Reais \n");
	}

	public String totalConvertido() {
		double sum = 0;
		for (Moeda moeda : listaMoedas) {
			if (moeda instanceof Dolar) {
				double dolarParaReal = moeda.converter();
				sum += dolarParaReal;
			} else if (moeda instanceof Euro) {
				double euroParaReal = moeda.converter();
				sum += euroParaReal;
			} else {
				sum += moeda.converter();
			}
		}
		return String.format("O valor total em Real é: R$ %.2f ", sum);
	}

}
