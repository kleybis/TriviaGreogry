package tema3;

import java.util.Scanner;

public class Ejemploswich3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int valor;
		int numDias;
		System.out.println(" introduce un numero del uno al cuatro");
		valor = teclado.nextInt();
		
		numDias= switch (valor) {
			case 1-> {System.out.println("mes uno");
				yield 31;
					}
			case 2-> {System.out.println("mes dos ");
				yield 28;
					}
			case 3-> { System.out.println("mes tres");
				yield 31;
					}
			case 4-> { System.out.println("mes cuatro");
			yield 30;
			
			}
			default->{System.out.println("valor incorrecto");
			yield -1;
					}
		};
		System.out.println("el numero de dias del mes introducido " + numDias);
		
	}

}
