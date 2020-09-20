package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Scanner;

public class ArrayEnterosAleatorios {
	static Scanner teclado = new Scanner(System.in);
	static int numerosSumados;

	public static void main(String[] args) {
		System.out.println("Ingrese el tamaño del array");
		int tamanioDelArray=teclado.nextInt();
		int vectorEnteros[]=new int[tamanioDelArray];
		for (int i = 0; i < vectorEnteros.length; i++) {
			vectorEnteros[i]=0;
		}
		for (int i = 0; i < vectorEnteros.length; i++) {
			double random=Math.random()*1000;
			vectorEnteros[i]=(int)random;
		}
		for (int i = 0; i < vectorEnteros.length; i++) {
			int indiceVector=i;
			int numeroAlmacenadoEnVector=vectorEnteros[i];
			System.out.println("El numero almacenado en el indice:"+indiceVector+" es "+numeroAlmacenadoEnVector);
		}
		for (int i = 0; i < vectorEnteros.length; i++) {
			numerosSumados+=vectorEnteros[i];
		}
		System.out.println("El promedio de todos los numero ingresados es: "+numerosSumados/vectorEnteros.length);
	}
}
