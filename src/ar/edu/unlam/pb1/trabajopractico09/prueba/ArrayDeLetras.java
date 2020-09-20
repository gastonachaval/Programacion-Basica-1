package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Scanner;

public class ArrayDeLetras {
	static Scanner teclado = new Scanner(System.in);
	static int numeroDeLetraIngresado;

	public static void main(String[] args){

		final int PRIMER_LETRA=0;
		final int ULTIMA_LETRA=26;
		String cadenaEscrita="";
		
		char vectorChars[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
 
			do {
				prompt();
				if (numeroDeLetraIngresado>=PRIMER_LETRA&&numeroDeLetraIngresado<=ULTIMA_LETRA) {
					cadenaEscrita+=vectorChars[numeroDeLetraIngresado];
				}
					else if(numeroDeLetraIngresado!=-1) {
						System.out.println("Ingrese una numero valido !");
						System.out.println("");
						System.out.println("...........................");
						System.out.println("");
					}
				}				
			 while (numeroDeLetraIngresado!=-1);
			
			System.out.println("La palabra escrita es:"+cadenaEscrita);
	}
	public static void prompt() {
		System.out.println("Ingrese un numero de letra");
		numeroDeLetraIngresado=teclado.nextInt();
	}

}
