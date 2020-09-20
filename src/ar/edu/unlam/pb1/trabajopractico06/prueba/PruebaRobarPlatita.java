package ar.edu.unlam.pb1.trabajopractico06.prueba;

import ar.edu.unlam.pb1.trabajopractico08.dominio.Cuenta;

public class PruebaRobarPlatita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta gaston= new Cuenta("Gaston",8000.0);
		System.out.println(gaston.getSaldo());
		gaston.robarPlatita();
		System.out.println(gaston.getSaldo());
	}

}
