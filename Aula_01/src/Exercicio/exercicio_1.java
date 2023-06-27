package Exercicio;
//1. Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		double resp = entrada.nextDouble();
		if (resp>0) {
			System.out.println(resp + " é um número posito");
		}
		else {
			System.out.println(resp + " é um número negativo.");
		}
	}
}