package Manipulacao_texto;

import java.util.StringTokenizer;

public class exemplos11 {

	public static void main(String[] args) {
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mais o mesmo mas não iremos desistir nunca");
		System.out.println(exemplo.countTokens());

	}

}
//A classe StringTokenizer divide uma String em partes, chamadas Tokens, que são separadas por espaços em branco, vírgula, - , : .