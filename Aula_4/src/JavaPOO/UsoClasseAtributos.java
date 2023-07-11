package JavaPOO;

public class UsoClasseAtributos {

	public static void main(String[] args) {
		AtributosClasses cliente01 = new AtributosClasses();
		System.out.println(cliente01.fnome);
		System.out.println(cliente01.Inome);
		System.out.println(cliente01.Idade);
		System.out.printf("O aluno %s %s tem %d anos", cliente01.fnome, cliente01.Inome, cliente01.Idade);

	}

}
