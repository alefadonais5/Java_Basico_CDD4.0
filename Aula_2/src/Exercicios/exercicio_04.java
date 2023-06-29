/*Programa em Java que mostra os números 
pares e ímpares 
Escreva um aplicativo em Java que recebe 
inteiro e mostra os números pares e ímpares 
(separados), de 1 até esse inteiro.*/

package Exercicios;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		int cont = 0;
		while (cont<num) {
			if (cont%2!=0) {
				System.out.print(cont + " ");}
			cont ++;}
		
		System.out.println();
		
		int cont1 = 0;
		while (cont1<num) {
			if (cont1%2==0) {
				System.out.print(cont1+ " ");
			}
			cont1++;
		}
	}
}
