package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Scanner;

public class DobleArray {
	static Scanner teclado = new Scanner(System.in);
	final static float APROBADO=4.0f;
	final static float PROMOCIONADO=7.0f;
	public static void main(String[] args) {
		
		System.out.println("Ingrese la cantidad de alumnes:");
		int cantidadDeAlumnes=teclado.nextInt();
		
		String vectorString[]=new String[cantidadDeAlumnes];
		for (int i = 0; i < vectorString.length; i++) {
			vectorString[i]="";
		}
		
		float vectorFloat[]=new float[vectorString.length];
		for (int i = 0; i < vectorString.length; i++) {
			vectorFloat[i]=(float) 0.0;
		}
		
		for (int i = 0; i < vectorString.length; i++) {
			System.out.println("Ingresar nombre:");
			vectorString[i]=teclado.next();
			System.out.println("Ingresar nota:");
			vectorFloat[i]=teclado.nextFloat();
		}
		for (int i = 0; i < vectorFloat.length; i++) {
			System.out.println(".............................");
			System.out.println("El alumno "+vectorString[i]+" obtuvo un resultado de "+vectorFloat[i]+" en el examen.");
			if (vectorFloat[i]<APROBADO) {
				System.out.println("El estado del examen es REPROBADO");
			}
			else if (vectorFloat[i]>=APROBADO&&vectorFloat[i]<PROMOCIONADO) {
				System.out.println("El estado del examen es APROBADO");
			}
			else if (vectorFloat[i]>=PROMOCIONADO) {
				System.out.println("El estado del examen es PROMOCIONADO");
			}
			System.out.println(".............................");
		}

	}

}
