package Exercicio;

public class aplicacao {
	
	public static void main(String[] args) {
		Retangulo obj1 = new Retangulo ();
		obj1.setAltura(8.5);
		obj1.setBase(7.5);
		obj1.setArea();
		
		double area = obj1.getArea();
		System.out.println("Area do retangulo: " + area);
		
		
		obj1.setPerimetro();
		double perimetro = obj1.getPerimetro();
		System.out.println("Perímetro do Retangulo: " + perimetro);
		
	}

}
