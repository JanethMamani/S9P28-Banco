package Cadastro;

public class Cliente {
	
	private int numeroDaConta;
	private String cliente;
	private double saldo;
	//private double deposito;
	//private double saque;
	
	public Cliente(int numero, String cliente, double deposito) {
		numeroDaConta = numero;
		this.cliente = cliente;
		saldo = deposito;
	}
	
	public Cliente(int numero, String cliente) {
		numeroDaConta = numero;
		this.cliente = cliente;
		saldo = 0;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String nomeDoCliente) {
		cliente = nomeDoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.00; //Isso vai subtrair o valor de 5, pois temos o -=
	}
	
	public void dadosCliente(int numeroConta, String nomeCliente, double valor) {
		System.out.println("Dados da conta:");
		System.out.println("Conta " 
							+ numeroDaConta
							+ ", Propriet�rio: "
							+ cliente
							+ ", Saldo total: $ "
							+ String.format("%.2f", saldo));
	}
		
}
