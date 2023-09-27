package Tema2;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
/**
 * . En un hospital existen tres áreas: Ginecología, Pediatría y Traumatología. El
presupuesto anual del hospital se reparte conforme a la siguiente tabla:
Área Porcentaje del presupuesto
Ginecología 40%
Traumatología 30%
Pediatría 30%
Obtener la cantidad de dinero que recibirá cada área, teniendo en cuenta que su
presupuesto es de 120000 euros.

 */
		double ginecologia;
		double pediatria;
		double trumatologia;
			double presupuesto=120000;
			
			ginecologia=presupuesto*0.4;
			trumatologia=presupuesto*0.30;
			pediatria=presupuesto*0.30;
			System.out.println("El presupuesto para Ginecologia es " + ginecologia);
			System.out.println("El presupuesto para Pediatria es " + pediatria);
			System.out.println("El presupuesto pat traumatologia es " + trumatologia);
	}

}
