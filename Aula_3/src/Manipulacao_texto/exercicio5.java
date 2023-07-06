/*Faça um programa que receba de um usuário,
um texto e exiba esse texto em letras
maiúsculas.*/

package Manipulacao_texto;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o texto: ");
		String texto = entrada.nextLine();
		
		String resultado = texto.toUpperCase();
		System.out.println(resultado);
	}

}
