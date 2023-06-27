//4 –Faça um programa que solicite 2 notas de um aluno e calcule amédia dele e mostre na tela.
package Exercicio;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		float nota1 = entrada.nextFloat();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Digite a segunda nota: ");
		float nota2 = entrada1.nextFloat();
		
		
		float media = (nota1+nota2)/2;
		
		System.out.println("A média do aluno é " + media);
		

	}
}
