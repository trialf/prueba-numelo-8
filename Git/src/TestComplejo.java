import java.util.Scanner;
public class TestComplejo {
	



	public static void main(String[] args) {
		Scanner snc= new Scanner(System.in);
		Complejo prueba=new Complejo();
		prueba.seti(10);
		prueba.setj(5);
		prueba.mostrar("El numero complejo es: ", prueba);
		System.out.println("-------------------------");
		
		Complejo pro = new Complejo(2,4);
		//pro.seti(4);
		//pro.setj(4);
		pro.mostrar("El nuevo complejo es: ", pro);
		pro.mostrar("El producto de prueba y pro es:", pro.getproducto(prueba));
		System.out.println("--------------------------");
		Complejo div = new Complejo(1,6);
		div.seti(1);
		div.setj(6);
		div.seti(snc.nextDouble());
		div.mostrar("La division es:", div.getDivision(prueba));
//<<<<<<< HEAD
		//holaaaaaaa
//=======
		System.out.println("esta rama es para el test");
		//Holaaaaa
//>>>>>>> refs/heads/ramasSeparadas
	}
}
