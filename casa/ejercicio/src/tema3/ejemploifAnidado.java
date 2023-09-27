package tema3;

import java.util.Scanner;

public class ejemploifAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int edad;
		System.out.println("Introduce la edad");
		edad= teclado.nextInt();
		if (edad>18) {
			System.out.println(" Soy mayor de edad");
			System.out.println("puedo votar");
		}//if
		else 
			if (edad==18)
				System.out.println("acabo de cumplir 18");
		
			
			else 
				if (edad==17)
					System.out.println("Estoy apunto de ser mayor de edad");
			
			else
					{if (edad<17)
						System.out.println("soy menor");
		}
	}

}
