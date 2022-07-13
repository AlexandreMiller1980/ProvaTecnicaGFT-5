package Exercicio2;

public class ContaCorrente extends Conta{

	public ContaCorrente(int numero, boolean titular, float saldo) {
		super(numero, titular, saldo);
	}

	public double rendimento() {
		return saldo * 0.03;
	}
} 
