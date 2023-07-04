package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int Array_A [] = new int [10];
		int Array_B [] = new int [10];
		int Array_C [] = new int [10];
		int Array_D [] = new int [10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Digite valor do Array_A: ");
			Array_A[i] = entrada.nextInt();}
		
		for (int x=0; x<10; x++) {	
			System.out.println("Digite o valor do Array_B: ");
			Array_B[x] = entrada.nextInt();}
		
		for (int y=0; y<10; y++) {	
			System.out.println("Digite o valor do Array_C: ");
			Array_C[y] = entrada.nextInt();}
		
		for (int q=0; q<10; q++) {	
			System.out.println("Digite o valor do Array_D: ");
			Array_B[q] = entrada.nextInt();}
			
		
		for (int h=0; h<10; h++) {
			System.out.print(Array_A[h]);}
		
		for (int v=0; v<10; v++) {
			System.out.print(Array_B[v]);}
		
		for (int z=0; z<10; z++) {
			System.out.print(Array_C[z]);}
				
		for (int l=0; l<10; l++) {
			System.out.print(Array_D[l]);}
	}
		
}


