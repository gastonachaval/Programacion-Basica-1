package ar.edu.unlam.pb1.trabajopractico10.dominio;

import java.util.Scanner;

public class AulaDelFuturo {
	
	static Scanner teclado = new Scanner(System.in);
	static boolean[][] escritorios=new boolean [10][10];
	static byte fila;
	static byte columna;
	static final byte recursion=0;
	static String listadoDeAlumnos="";
	

	public static void main(String[] args) {
			do {
				System.out.println("*************************************");
				System.out.println("Bienvenido al aula del futuro");
				System.out.println("*************************************");
				System.out.println(mapa2d());
				System.out.println("*************************************");
				System.out.println(listadoDeAlumnos);
				System.out.println("Ingrese su nombre");
				listadoDeAlumnos+=teclado.next()+"-";
				System.out.println("Ingrese la fila de su asiento");
				fila=teclado.nextByte();
				System.out.println("Ingrese la columna de su asiento");
				columna=teclado.nextByte();
				escritorios[fila-1][columna-1]=true;
				clsScreen();				
			} while (recursion==0);
			
			
			

			
	}
	static private String mapa2d() {

		String mapa = "";
		for (int i = 0; i < escritorios.length; i++) {
			for (int j = 0; j < escritorios[i].length; j++) {
				if (escritorios[i][j] == false) {
					mapa += ("L" + "\t");
				} else {
					mapa += ("O" + "\t");
				}
			}
			mapa += "\n";
		}
		return mapa;
	}
	private static void clsScreen() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("");
		}

	}
}
