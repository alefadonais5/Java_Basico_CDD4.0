/*1. Programa em Java que calcula a média das 
notas de uma turma Escreva um programa 
que pergunte ao usuário quantos alunos tem 
na sala dele.
 Em seguida, através de um laço while, pede 
ao usuário para que entre com as notas de 
todos os alunos da sala, um por vez.
Por fim, o programa mostra a média, 
aritmética, da turma.*/


package Exercicios;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na turma? ");
		int qtd_alunos = entrada.nextInt();
		
		double media = 0;
		int i = 0;
		double soma = 0;
		
		while (i<qtd_alunos) {
			System.out.print("Digite a nota do aluno?  ");
			double nota = entrada.nextDouble();
			soma = soma + nota;
			i++;}
		media = soma/qtd_alunos;
		System.out.println(media);

	}
}


/*package Exercicios;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na turma? ");
		int qtd_alunos = entrada.nextInt();
		
		int T_alunos = qtd_alunos;
		double media = 0;
		double soma = 0;
		
		while (qtd_alunos>0) {
			System.out.print("Digite a nota do aluno?  ");
			double nota = entrada.nextDouble();
			soma = soma + nota;
			qtd_alunos --;}
		media = soma/T_alunos;
		System.out.println(media);

	}
}*/