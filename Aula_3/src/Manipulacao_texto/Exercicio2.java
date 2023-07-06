package Manipulacao_texto;
/*Faça um programa que, a partir do texto
abaixo, “ texto para retirar espaços no início
e fim ” e imprima o texto removendo os
espaços no inicio e fim do texto. */

public class Exercicio2 {
	public static void main(String[] args) {
	String texto = " texto para retirar espaços no início e fim ";
	String texto_novo = texto.trim();
	System.out.println(texto_novo);
	}
	
}
