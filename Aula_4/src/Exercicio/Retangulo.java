package Exercicio;

public class Retangulo {
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
	
	public Retangulo() {
		
	}
	
	

	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setArea () {
		this.area=this.base*this.altura;
	}
	
	public void setPerimetro() {
		this.perimetro=2*(this.base+this.altura);
	}
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	
	
	

	//public void setArea(int base, int altura) {
		//this.base=base;
		//this.altura=altura;
		
		//double area = //base*altura;
		
//	}
	
	
	
	
	
	
	
	

}
