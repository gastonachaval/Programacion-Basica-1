package ar.edu.unlam.pb1.trabajopractico06.prueba;

import ar.edu.unlam.pb1.trabajopractico06.dominio.Ascensor;

public class PruebaAscensor {
	public static void main(String[] args) {
		Ascensor prueba=new Ascensor(0,10,0);
		prueba.irAlPiso(10);
		System.out.println(prueba.getPisoActual());
		prueba.irAlPiso(0);
		System.out.println(prueba.getPisoActual());
	}
}
