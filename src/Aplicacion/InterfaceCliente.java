package Aplicacion;

import java.util.Scanner;

import Cadastro.Cliente;

public class InterfaceCliente {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastro de novo cliente: ");
		System.out.println();
		
		System.out.print("Digite o n�mero da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o nome do cliente: ");
		String nome = sc.nextLine();
		
		System.out.println("Gostaria de realizar um deposito inicial? (s/n)");
		char resp = sc.next().charAt(0);
		double deposito;
		if (resp == 's') {
			System.out.println("Digite a quantidade a ser depositada: ");
			deposito = sc.nextDouble();
		} else {
			deposito = 0;
		}
		//Criar cadastro
		Cliente usuarioN1 = new Cliente(numeroConta, nome, deposito);
		//Criar 'puxador de saldo'
		double saldo = usuarioN1.getSaldo();
		
		usuarioN1.dadosCliente(numeroConta, nome, saldo);
		
		System.out.print("Entre com um valor para depositar: ");
		deposito = sc.nextDouble();
		usuarioN1.depositar(deposito);
		
		usuarioN1.dadosCliente(numeroConta, nome, saldo);
		
		System.out.print("Entre com um valor para saque, com taxa de $5: ");
		double saque = sc.nextDouble();
		usuarioN1.saque(saque);
		
		usuarioN1.dadosCliente(numeroConta, nome, saldo);
		
		sc.close();
	}

}
