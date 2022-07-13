package Exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String tipoVeiculo = "";	
		Scanner sc = new Scanner(System.in);

		System.out.println("Esportivo ou Caminhao?");
		tipoVeiculo = sc.nextLine();

		Esportivo esportivo = new Esportivo(tipoVeiculo);
		Caminhao caminhao = new Caminhao(tipoVeiculo);

		if(tipoVeiculo.equals("Esportivo")) {
			System.out.println("Combustivel utilizado: "+ esportivo.retornaCombustivel());
		}else if(tipoVeiculo.equals("Caminhao")) {
			System.out.println("Combustivel utilizado: "+ caminhao.retornaCombustivel());
		}
	}
} 
