package tema3;

import java.util.Scanner;

public class Ejercicio6swich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado=new Scanner(System.in);
	 int mes;
	 int año;
	 int nDias;
	 
	 System.out.println(" introduce el mes con numeros de 1 al 12 ");
	 mes=teclado.nextInt();
	 System.out.println(" Introduce un año");
	 año=teclado.nextInt();
	 
	 nDias= switch (mes) {
	 case 1-> {System.out.println("1");
		yield 31;
	 }
	 case 2-> {System.out.println("2");
	 yield nDias=29;
	 }
	 case 3-> {System.out.println("3");
		yield 31;
	 }	 
	 case 4-> {System.out.println("4");
		yield 31;
	 }	 
	 case 5-> {System.out.println("5");
		yield 31;
	 }	 
	 case 6-> {System.out.println("6");
		yield 31;
	 }	 
	 case 7-> {System.out.println("7");
		yield 31;
	 }	 
	 case 8-> {System.out.println("8");
		yield 31;
	 }	 
	 case 9-> {System.out.println("9");
		yield 31;
	 }
	 case 10-> {System.out.println("10");
		yield 31;
	 }	 
	 case 11-> {System.out.println("11");
		yield 31;
	 }	 
	 case 12-> {System.out.println("12");
		yield 31;
	 }
	 default->{System.out.println("valor incorrecto");
	 yield 31;
	 }
	 
	 
	 
	 };
		System.out.println("el numero de dias del mes introducido es " + nDias);
		
	 }

	}


