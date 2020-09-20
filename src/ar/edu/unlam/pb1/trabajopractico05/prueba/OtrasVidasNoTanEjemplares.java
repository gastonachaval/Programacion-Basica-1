package ar.edu.unlam.pb1.trabajopractico05.prueba;

import ar.edu.unlam.pb1.trabajopractico05.dominio.Persona;

public class OtrasVidasNoTanEjemplares {

	public static void main(String[] args) {
		Persona mauricio= new Persona("Mauricio","Hombre",33999776,1.70,70);
		for (int i = 0; i<50; i++) {
			mauricio.cumplirAnos();
		}
		System.out.println(mauricio.toString());
		
		Persona marcos=new Persona("Marcos","Hombre",2315321,1.75,80);
		for (int i = 0; i < 30; i++) {
			marcos.cumplirAnos();
		}
		System.out.println(marcos.toString());
		
		Persona eugenia=new Persona("Eugenia","Mujer",2154215,1.69,60);
		for (int i = 0; i < 40; i++) {
			eugenia.cumplirAnos();
		}
		System.out.println(eugenia.toString());
		
		Persona elisa=new Persona("Elisa","Mujer",63215478,1.60,150);
		for (int i = 0; i < 60; i++) {
			elisa.cumplirAnos();
		}
		System.out.println(elisa.toString());

		mauricio.morir();
		
	}

}
