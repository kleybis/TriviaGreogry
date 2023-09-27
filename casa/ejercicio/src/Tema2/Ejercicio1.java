package Tema2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1. Un alumno desea saber cuál será su calificación final en el módulo de
Programación. Dicha calificación se compone de los siguientes porcentajes:
a. 65% de la media de sus tres calificaciones parciales.
b. 20% de la calificación del examen final.
c. 15% de la calificación de una práctica
Puedes asignar las calificaciones que creas conveniente (entre 1 y 10).
		 */
		// Notas necesarias para la NOTAFINAL
		double nota1,nota2,nota3;
		nota1=8;
		nota2=7;
		nota3=5;
		double efinal=7;
		double practica=9;
		double media;
		 media=(nota1 + nota2 + nota3)/3;
	//65% de la media de los tres parciales
		 double a;
		 a=media*0.65;
		 // 20% del examen final
		double b;
			b=efinal*0.20;
		double c;
		c=practica*0.15;
		
		double notafinal;
		notafinal=a+b+c;
		 
		System.out.println("La calificacion final es " + notafinal);
		
	}

}
