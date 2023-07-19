package Penultima_aula;

public class Animal {
	
	String nome;
	int idade;
	

	public Animal() {
		
	}
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public void locomover(String nome, int idade){
		System.out.println(nome + " Esta andando.....");
	}
	
	public void EmitorSom(String nome, int idade) {
		System.out.println("Som....");
	}
}