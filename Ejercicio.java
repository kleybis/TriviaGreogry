package tema3;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
	byte nota;
	System.out.println("Introduce la nota");
	nota=teclado.nextByte();
	if ((nota<0) || (nota>10)) {
		System.out.println("la nota indorucidad es incorrecta");
	}
	else
		if(nota<5)
		
		System.out.println("Suspenso");
		else
			System.out.println("Aprobado");
	}
	
	
					
		
	
	 

	
	
	

}
