package Manipulacao_texto;

public class Exercicios_1 {
	public static void main(String[] args) {
		String str = "O rato roeu a roupa do rei de roma";
		int resultado = str.length();
		System.out.println(resultado);
		String novo_str = str.replace(" ","");
		int resultado_novo = novo_str.length();
		System.out.println(novo_str);
		System.out.println(resultado_novo);
		
	}	
}
