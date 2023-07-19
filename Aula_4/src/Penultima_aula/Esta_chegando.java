package Penultima_aula;

public class Esta_chegando {
	public static void main(String[] args) {
		Polimorfismo alunos = new Polimorfismo();
		Polimorfismo alunos1 = new Polimorfismo();
		int notas1=alunos.somar(8, 9);
		int notas2=alunos1.somar(5, 6, 8);
		
		
		System.out.println(notas1);
		System.out.println(notas2);
	}

}

