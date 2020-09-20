package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Scanner;

public class Capicua {
	static Scanner teclado=new Scanner(System.in);

	public static void main(String[] args) {
		
		String numeroAlReves="";
		
		System.out.println("Ingrese un numero");
		
		String numeroIngresado=teclado.next();
		
		int arrayEnteros[]=new int [numeroIngresado.length()];
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i]=0;
		}
		
		boolean arrayBooleanos[]=new boolean[arrayEnteros.length];
		
		for (int i = 0; i < arrayBooleanos.length; i++) {
			arrayBooleanos[i]=false;
		}
		
		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i]=Character.getNumericValue(numeroIngresado.charAt(i));
		}
		for (int i = arrayEnteros.length-1; i >= 0; i--) {
			numeroAlReves+=arrayEnteros[i];
		}
		for (int i = 0; i < numeroAlReves.length(); i++) {
			for (int j = arrayEnteros.length-1; j >=0; j--) {
				if (arrayEnteros[j]==(int)numeroAlReves.charAt(i)) {
					arrayBooleanos[j]=true;
				}
				break;
			}
		}
		
		
		

	}

}
