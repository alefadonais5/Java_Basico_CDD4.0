//3 – Faça um Programa que leia um número e exiba o dia correspondente da semana. (1- Domingo , 2- Segunda, etc.) se
//digitar outro valor deve aparecer “valor inválido)

package Exercicio;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número : ");
		int numero = entrada.nextInt();
		
		switch (numero) {
		
		case 1:
			System.out.println("Domingo");
			break;
		
		case 2:
			System.out.println("Segunda");
			break;
		
		case 3:
			System.out.println("Terça");
		
		case 4:
			System.out.println("Quarta");
			break;
		
		case 5:
			System.out.println("Quinta");
			break;
		
		case 6:
			System.out.println("Sexta");
		
		case 7:
			System.out.println("Sábado");
		
		default:
			System.out.println("O número escolhido é inválido");
			
		}
	}
}
