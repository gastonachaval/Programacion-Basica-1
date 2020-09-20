package ar.edu.unlam.pb1.trabajopractico10.dominio;

import java.util.Scanner;

public class Sudoku {
	
	static Scanner teclado = new Scanner(System.in);
	static int [][] facil=new int[9][9];

	public static void main(String[] args) {
		System.out.println("*************************************");
		System.out.println("SUDOKU !");
		System.out.println("*************************************");

	}
	static private String mapa2d() {

		String mapa = "";
		for (int i = 0; i < facil.length; i++) {	
			for (int j = 0; j < facil[i].length; j++) {
				if (facil[i][j] == 0) {
					mapa += ("L" + "\t"); //EN ESPACIOS LIBRES (NULL) INGRESA UNA "L"
				} else {
					mapa += ("O" + "\t"); //EN ESPACIOS OCUPADOS (!=NULL) INGRESA UNA "O"
				}
			}
			mapa += "\n";
		}
		return mapa;
	}

}
