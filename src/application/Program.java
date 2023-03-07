package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dolar;
import entities.Euro;
import entities.Moeda;
import entities.Real;
import service.Cofrinho;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Cofrinho cofrinho = new Cofrinho();
		Moeda dolar; // usando o conceito de polimorfismo para dolar, euro e real
		Moeda euro;
		Moeda real;

		System.out.println("COFRINHO DE MOEDAS");
		System.out.println();

		int opcao = 0;
		while (opcao != 5) {
			System.out.print("Digite a opção desejada:\n" + "1 - Adicionar \n" + "2 - Remover \n"
					+ "3 - Listar todas as moedas \n" + "4 - Valor total em Real \n" + "5 - Encerrar o Sistema \n");

			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.print("Informe o tipo de Moeda: \n" + "1 - Dólar: \n" + "2 - Euro: \n" + "3 - Real: \n");

				int tipoMoeda = sc.nextInt();

				if (tipoMoeda == 1) {
					System.out.print("Digite o Valor:");
					double valor = sc.nextDouble();
					dolar = new Dolar(valor);
					cofrinho.adicionar(dolar);
				}

				if (tipoMoeda == 2) {
					System.out.print("Digite o valor:");
					double valor = sc.nextDouble();
					euro = new Euro(valor);
					cofrinho.adicionar(euro);
				}

				if (tipoMoeda == 3) {
					System.out.print("Digite o valor:");
					double valor = sc.nextDouble();
					real = new Real(valor);
					cofrinho.adicionar(real);
				}

			}
			if (opcao == 2) {
				System.out.print("Informe o tipo de Moeda: \n" + "1 - Dólar: \n" + "2 - Euro: \n" + "3 - Real: \n");

				int tipoMoeda = sc.nextInt();

				if (tipoMoeda == 1) {
					System.out.print("Digite o valor:");
					double valor = sc.nextDouble();
					cofrinho.remover(new Dolar(valor));
				}
				if (tipoMoeda == 2) {
					System.out.print("Digite o valor:");
					double valor = sc.nextDouble();
					cofrinho.remover(new Euro(valor));
				}
				if (tipoMoeda == 3) {
					System.out.print("Digite o valor:");
					double valor = sc.nextDouble();
					cofrinho.remover(new Real(valor));
				}
			}
			if (opcao == 3) {
				cofrinho.listarMoedas();
			}

			if (opcao == 4) {
				System.out.println(cofrinho.totalConvertido());
			}
		}
		System.out.println("Sistema Encerrado");
		sc.close();
	}

}
