//2. Faça um programa que leia três números, verifique (usando if e else) e mostre o maior e o menor deles;

package Exercicio;

	import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
		
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Digite o segundo número: ");
		double num2 = entrada1.nextDouble();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Digite o terceiro número: ");
		double num3 = entrada2.nextDouble();
		
		if (num1>num2 && num1>num3)  {
			if (num3<num1 && num3<num2) {
				System.out.println("O número maior é "+ num1);
				System.out.println("O número menor é " + num3);}
			else {
				System.out.println("O número maior é " + num1);
				System.out.println("O número menor é " + num2);}
			}
			
		else if (num2>num1 && num2>num3) {
			if (num3<num1 && num3<num2) {
				System.out.println("O número maior é "+ num2);
				System.out.println("O número menor é " + num3);}
			else {
				System.out.println("O número maior é " + num2);
				System.out.println("O número menor é " + num1);}
			}
		
		else {
			if (num2<num1 && num2<num1) {
				System.out.println("O número maior é "+ num3);
				System.out.println("O número menor é " + num2);}
			else {
				System.out.println("O número maior é " + num3);
				System.out.println("O número menor é " + num1);}
			}	
		}
	}


