package Exercicio2;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, boolean titular, float saldo) {
		super(numero, titular, saldo);
	}

	public double rendimento() {
		return saldo * 0.05;
	}
} 
