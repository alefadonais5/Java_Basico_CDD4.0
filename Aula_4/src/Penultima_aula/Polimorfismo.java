package Penultima_aula;

public class Polimorfismo {
	
	int a;
	int b;
	int c;
	
	public Polimorfismo() {
		
	}
	
	public Polimorfismo(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public Polimorfismo(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	int somar(int a, int b) {
		return a+b;
	}
	int somar (int a, int b, int c) {
		return a+b+c;
	}
	
}
