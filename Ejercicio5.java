package tema3;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int salario;
		System.out.println("introduce el salrio bruto");
		salario=teclado.nextInt();
		int hijos;
		System.out.println("introduce el numero de  hijos");
		hijos=teclado.nextInt();
		float retencion;
		float salarioN;
		
		if (hijos<2) {
			salarioN=(float) (salario*0.8);
			retencion=(float) (salario*0.20);
			System.out.println("la retencion es de" + retencion);
			System.out.println("El salrio es de " + salarioN + "La retencion es del 20%");
		}
		
		else 
			if(hijos>2 && hijos<=5) {
				salarioN=(float)(salario*0.85);
				retencion=(float) (salario*0.15);
				System.out.println("la retencion es de" + retencion);
				System.out.println("El salario es de " + salarioN + " y LA RETENCION ES DE 15%");
			}
		

			else 
				if(hijos>4 && hijos<=7) {
					salarioN=(float)(salario*0.9);
					retencion=(float) (salario*0.10);
					System.out.println("la retencion es de" + retencion);
					System.out.println("El salario es de " + salarioN + " y LA RETENCION ES DE 10%");
				}
		
				else 
					if(hijos>6 && hijos<=9) {
						salarioN=(float)(salario*0.95);
						retencion=(float) (salario*0.05);
						System.out.println("la retencion es de" + retencion);
						System.out.println("El salario es de " + salarioN + " y LA RETENCION ES DE 5%");
					}
		
					else 
						if(hijos>10) {
							salarioN=(float)(salario*1);
							retencion=0;
							System.out.println("la retencion es de" + retencion);
							System.out.println("El salario es de " + salarioN + " y LA RETENCION ES DE 0%");
						}

		
	}

}
