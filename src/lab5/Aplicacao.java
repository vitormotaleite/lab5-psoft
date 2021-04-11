package lab5;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MeiosDeTransporte strategy = null;
		Cliente cliente = new Cliente(strategy);
		String escolha = "S";
		
		while(escolha.equals("S")) {
			
			System.out.print(cliente.imprimeCabecalho());
			int transporte = sc.nextInt();
			
			if(strategy == null) {
				System.out.println(cliente.defineMeioDeTransporte(strategy, transporte));
				System.out.println(cliente.getMeiosDeTransporte().calculaRota() + "\n");
			}
			
			System.out.println(cliente.alterar());
			escolha = sc.next();
		}
		System.out.println(cliente.Resultado());
	}
}
