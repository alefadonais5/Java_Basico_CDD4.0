/*2.Programa em Java que mostra os números 
ímpares.
Escreva um aplicativo em Java mostra todos 
os números ímpares de 1 até 100*/

package Exercicios;

public class exercicio_02 {

	public static void main(String[] args) {
		int cont = 0;
		while (cont<100) {
			if (cont%2!=0) {
				System.out.println(cont);}
			cont ++;}
	}
}