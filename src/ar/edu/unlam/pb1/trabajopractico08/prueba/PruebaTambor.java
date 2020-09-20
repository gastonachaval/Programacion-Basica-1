package ar.edu.unlam.pb1.trabajopractico08.prueba;

import ar.edu.unlam.pb1.trabajopractico08.dominio.TragamonedasGaston;
import ar.edu.unlam.pb1.trabajopractico08.dominio.Tambor;

public class PruebaTambor {

	public static void main(String[] args) {
		TragamonedasGaston fiesta=new TragamonedasGaston();
		fiesta.girar();
		System.out.println(fiesta.toString());
		/*System.out.println("La posicion del tambor 1 es: "+fiesta.getPosicionTambor1());
		System.out.println("La posicion del tambor 2 es: "+fiesta.getPosicionTambor2());
		System.out.println("La posicion del tambor 3 es: "+fiesta.getPosicionTambor3());*/
		if (fiesta.winSituation()==true) {
			System.out.println("Ganaste");	
		}
		else {
			System.out.println("Segui Participando");
		}

	}
}
