package Exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int idade;

		float peso, mediaPrimeiraFaixaEtaria = 0, mediaSegundaFaixaEtaria = 0, mediaTerceiraFaixaEtaria = 0, mediaQuartaFaixaEtaria = 0, 
		somaPesoPrimeiraFaixaEtaria = 0, somaPesoSegundaFaixaEtaria = 0, somaPesoTerceiraFaixaEtaria = 0, somaPesoQuartaFaixaEtaria = 0, 
		qtdPessoasPrimeiraFaixa = 0, qtdPessoasSegundaFaixa = 0, qtdPessoasTerceiraFaixa = 0, qtdPessoasQuartaFaixa = 0;

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 10; i++) {
			System.out.println("Digite seu peso: ");
			peso = sc.nextFloat();

			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();

			if(idade >= 1 && idade <= 10) {
				somaPesoPrimeiraFaixaEtaria = somaPesoPrimeiraFaixaEtaria + peso;
				qtdPessoasPrimeiraFaixa++;
			}else if(idade >= 11 && idade <= 20) {
				somaPesoSegundaFaixaEtaria = somaPesoSegundaFaixaEtaria + peso;
				qtdPessoasSegundaFaixa++;
			}else if(idade >= 21 && idade <= 30) {
				somaPesoTerceiraFaixaEtaria = somaPesoTerceiraFaixaEtaria + peso;
				qtdPessoasTerceiraFaixa++;
			}else if(idade >= 31) {
				somaPesoQuartaFaixaEtaria = somaPesoQuartaFaixaEtaria + peso;
				qtdPessoasQuartaFaixa++;
			}else {
				System.out.println("Idade fora dos padrões exigidos");
			}

		}

		sc.close();

		mediaPrimeiraFaixaEtaria = somaPesoPrimeiraFaixaEtaria / qtdPessoasPrimeiraFaixa;
		mediaSegundaFaixaEtaria = somaPesoSegundaFaixaEtaria / qtdPessoasSegundaFaixa;
		mediaTerceiraFaixaEtaria = somaPesoTerceiraFaixaEtaria / qtdPessoasTerceiraFaixa;
		mediaQuartaFaixaEtaria = somaPesoQuartaFaixaEtaria / qtdPessoasQuartaFaixa;

		System.out.println("Média de pesos de 1 a 10 anos: " + mediaPrimeiraFaixaEtaria);
		System.out.println("Média de pesos de 11 a 20 anos: " + mediaSegundaFaixaEtaria);
		System.out.println("Média de pesos de 21 a 30 anos: " + mediaTerceiraFaixaEtaria);
		System.out.println("Média de pesos a partir de 31 anos: " + mediaQuartaFaixaEtaria);
	}
} 
