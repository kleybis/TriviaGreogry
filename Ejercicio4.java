package tema3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner teclado=new Scanner(System.in);
		
		int uni;
		System.out.println("Introduce el  numero de unidades");
		uni=teclado.nextInt();
		float precio;
		System.out.println(" Introduce el precio");
	    precio=teclado.nextFloat();
		float preciot;

		preciot=uni*precio;
	
		if (uni>100) {
		preciot=(float) (preciot * 0.60);
		System.out.println("EL descuentos de  de 40%");
		
		
	}	
		else
			if (uni>=25 && uni<=100) {
				preciot=(float) (preciot * 0.80);
				System.out.println("el descuento es del  20%");
			}
			else
				if (uni>=10 && uni<25) {
					preciot=(float) (preciot*0.90);
					System.out.println("el descuento es de 10%");
				}
		System.out.println("el precio es de " + preciot);
	}
}

