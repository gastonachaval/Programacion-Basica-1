package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Scanner;

public class CargaArrayEnteros {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int vectorEnteros[]=new int[10];
		
		for (int i = 0; i < vectorEnteros.length; i++) {
			vectorEnteros[i]=0;
		}
		
		
		for (int i = 0; i < vectorEnteros.length; i++) {
			System.out.println("Ingrese un entero:");
			vectorEnteros[i]=teclado.nextInt();
		}
		
		for (int i = 0; i < vectorEnteros.length; i++) {
			int indiceVector=i;
			int numeroAlmacenadoEnVector=vectorEnteros[i];
			System.out.println("El numero almacenado en el indice:"+indiceVector+" es "+numeroAlmacenadoEnVector);
		}
		

	}

}
