package ar.edu.unlam.pb1.trabajopractico06.prueba;

import ar.edu.unlam.pb1.trabajopractico06.dominio.Destornillador;
import ar.edu.unlam.pb1.trabajopractico06.dominio.Tarugo;
import ar.edu.unlam.pb1.trabajopractico06.dominio.Tornillo;

public class PruebaTornillo {

	public static void main(String[] args) {
		Tarugo tarugo=new Tarugo(8);
		Tornillo tornilloPhillips=new Tornillo('P',10,10);
		Destornillador destornilladorPhillips=new Destornillador('P');
		destornilladorPhillips.atornillar(tornilloPhillips);
		System.out.println(tornilloPhillips.getPosicionActual());
		destornilladorPhillips.desatornillar(tornilloPhillips);
		System.out.println(tornilloPhillips.getPosicionActual());
		destornilladorPhillips.atornillar(tornilloPhillips,tarugo);
		System.out.println(tornilloPhillips.getPosicionActual());
		destornilladorPhillips.desatornillar(tornilloPhillips,tarugo);
		System.out.println(tornilloPhillips.getPosicionActual());
		
		
		
	}

}
