package Metodos;

public class Metodo_Teste {

	public static void main(String[] args) {
		SomarMetodos obj1 = new SomarMetodos();
		int soma = obj1.somar(8, 9);
		int soma1 = obj1.somar(23, 8, 10);
		double media = obj1.media(8.9, 5.0);
		double media1 = obj1.media(7.5, 8.5, 9.0);
		
		System.out.println(soma);
		System.out.println(soma1);
		System.out.println(media);
		System.out.println(media1);
		
		SomarMetodos aluno = new SomarMetodos();
		System.out.printf("A soma do aluno %d", aluno.somar(5,6));
	}
	

}
