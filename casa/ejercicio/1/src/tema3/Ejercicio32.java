package tema3;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);

		int numero;
		System.out.println("Introduce el numero");
		numero= teclado.nextInt();
		
		if (numero!=0) {
			// es par
			if (numero%2==0) 
				System.out.println("El numero es par");
			
			else 
			System.out.println("El numero es inpar ");
			}
	


	
		}

	}
