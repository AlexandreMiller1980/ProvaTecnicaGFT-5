package Exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int idade;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();

		if(idade < 18 || idade > 67) {
			System.out.println("Voce nao pode doar sangue!");
		}else if(idade >= 18 && idade <= 67) {
			System.out.println("Voce pode doar sangue!");
		}else {
			System.out.println("Idade invalida");
		}
	}

}
