//Identificando a posição de caracteres ou substrings em uma String
package Manipulacao_texto;

public class exemplos8 {

	public static void main(String[] args) {
		String str = "Hello Word Wordl2";
		int pos = str.indexOf("l");
		System.out.println(pos);
		//retorna o índice da primeira ocorrência de “l”.
		
		int pos1 = str.lastIndexOf("l");
		System.out.println(pos1);
		//retorna o índice da última ocorrência de ”l”.

	}

}
