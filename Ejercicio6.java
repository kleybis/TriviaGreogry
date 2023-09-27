package tema3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado=new Scanner(System.in);
			int  mes;
			int años;
			int numDias;
			System.out.println("Introduce el mes ");
			mes=teclado.nextInt();
			
			System.out.println("introduce el año");
			años=teclado.nextInt();
			
				if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ) {
					numDias=31;
				}
				else
					if (mes==4 || mes==6 || mes==9 || mes==11)
						numDias=30;
					else if(mes==2) {
						if(años%4==0 && ((años%100!=0) || años%400==0))
							numDias=29;
						else numDias=28;
					}
					else numDias=-1;
				if (numDias!=-1) {
					
				System.out.println("el numero de dias del mes es " + mes + numDias);}
				else 
					System.out.println("el valor introducido es incorrecto");
	}

}





















