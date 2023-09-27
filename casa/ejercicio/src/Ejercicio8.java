
public class Ejercicio8 {

	public static void main(String[] args) {
	
		int Iniciales=4000;
		double ganancias;
		double importefinal;
		final int interes=7;
			
			ganancias=(Iniciales*interes)/100;
			importefinal=Iniciales+ganancias;
			System.out.println("Las ganancias han sido de " + ganancias);
			System.out.println("El importe final es de " + importefinal);
	}

}
