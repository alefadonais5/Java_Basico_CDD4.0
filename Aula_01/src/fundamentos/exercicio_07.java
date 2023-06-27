package fundamentos;

import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número: ");
		double resp = entrada.nextDouble();
		
			if (resp>0)
				{System.out.println("Seu número é posito. " + resp);}
			else
				{System.out.println("Seu número é negativo" + resp);}
	}
}

