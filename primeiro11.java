package aula07042020;

import java.util.Scanner;
public class primeiro11 {
	

	public static void main(String[] args) {
		String nome;
		int idade;
		String cidade;
		
		
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		nome = leitor.next();
		System.out.println("Bem vindo,"+nome);
	
		
		System.out.println("Digite a sua idade: ");
		idade = leitor.nextInt();
		System.out.println("");
		System.out.println("Digite sua cidade: ");
		cidade = leitor.next();
		
		System.out.println("Bem vindo," +nome+", "+idade+ "anos, que mora em "+cidade);
		
		

	}

}
