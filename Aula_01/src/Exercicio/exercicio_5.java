//5 –Faça um programa que verifique (usando if e else) se uma letra digitada é “F” ou “M”.
//Conforme a letra escrever: F –Feminino, M- Masculino.

package Exercicio;

import java.util.Scanner;

public class exercicio_5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite uma letra: ");
		String letra = entrada.next();
		
		if (letra.equals("F") || letra.equals("M")) {
			
			if (letra.equals("F")) {
				System.out.println("Feminino");
			}
			
			else {
				System.out.println("Masculino");
			}
		}
		else {
			System.out.println("Letra inválida");
		}
	}
}
