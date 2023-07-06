package Manipulacao_texto;
/*Faça um programa que, a partir de um texto
digitado pelo usuário, conte o número de
palavras (palavra é definida por qualquer
sequência de caracteres delimitada por espaços
em branco) e exiba o resultado.*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o texto: ");
		String texto = entrada.nextLine();
		
		StringTokenizer exemplo = new StringTokenizer(texto);
		System.out.println(texto);
		System.out.println("O texto tem " + exemplo.countTokens()+ " palavras");
		
	}

}
