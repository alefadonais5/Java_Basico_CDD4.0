 /* 6 –Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são: 
“Telefonou para a vítima? “
“Esteve no local do crime?”
“Mora perto da vítima? “
“Devia para a vítima? “
“Já trabalhou com a vítima? “
O programa deve no final emitir uma
classificação sobre a participação da pessoa no
crime. Se a pessoa responder positivamente a 2
questões ela deve ser classificada como
“Suspeita”, entre 3 e 4 como “Cúmplice” e 5
como “Assassino“. Caso contrário, ele será
classificado como “Inocente“. */

package Exercicio;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Telefonou para a vítima? ");
		String pergunta1 = entrada1.next();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Esteve no local do crime? ");
		String pergunta2 = entrada2.next();
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Mora perto da vítima? ");
		String pergunta3 = entrada3.next();
		
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Devia para a vítima? ");
		String pergunta4 = entrada4.next();
		
		Scanner entrada5 = new Scanner(System.in);
		System.out.println("Já trabalhou com a vítima? ");
		String pergunta5 = entrada4.next();
		
		
		if (pergunta2.equals("Sim") || pergunta3.equals("Sim") || pergunta4.equals("Sim") || pergunta5.equals("Sim"))
		{
			if (pergunta5.equals("Sim")) {
				System.out.println("Assassino");
				}
			
			else if (pergunta3.equals("Sim") || pergunta4.equals("Sim")){
				System.out.println("Cúmplice");
				}
			else {
				System.out.println("Suspeito");
			}	
			
		}
		
		else {
			System.out.println("Inocente");
			}
	}
}
			
		
		