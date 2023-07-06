/*dado o Array a seguir, {"a", "vida", "é", "bela"}
faça um programa que crie um string o com texto
retirado do Array e imprima. no seguinte formato.
A VIDA É BELA*/

package Manipulacao_texto;

public class Exercicio6 {

	public static void main(String[] args) {
		String Array [] = {"a", "vida", "é", "bela"};
		
		String texto="";
		for (int x = 0; x<3; x++) {
			
			texto = (" " + Array[x]);
			System.out.print(texto);
		
			
		
	}
		for (String v:Array) {
			System.out.print(v.toUpperCase());
		}
	
}
}
