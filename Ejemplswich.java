package tema3;

import java.util.Scanner;

public class Ejemplswich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
int valor;
System.out.println("Introduce un numero del 1 a 10");
		valor=teclado.nextInt();
		
		switch (valor) {
		case 1:System.out.println("uno");
		break;
		case 2:System.out.println("dos");
		break;
		case 3:System.out.println("tres");
		break;
		case 4:System.out.println("cuatro");
		break;
		default:System.out.println("Valor incorrecto2");
		}
	}

}
