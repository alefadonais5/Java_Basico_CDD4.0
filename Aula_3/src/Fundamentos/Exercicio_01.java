package Fundamentos;

public class Exercicio_01 {

	public static void main(String[] args) {
		int soma = 0;
		int soma1 = 0;
		for (int i = 0; i <=20; i= i=i+1) {
			if (i%3==0) {
			System.out.println(i);
				soma = soma+i;
			
			}
			
			if (i%5==0) {
				System.out.println(i);
				soma1 = soma1+i;	
			}
		}
		System.out.printf("%s,%d,%s,%d", "A soma dos multiplos de 3: ", soma, "\nA soma dos multiplos de 5 : ", soma1);
		int total = soma+soma1;
		System.out.println("\nTotal: " + total);
		

	}

}
