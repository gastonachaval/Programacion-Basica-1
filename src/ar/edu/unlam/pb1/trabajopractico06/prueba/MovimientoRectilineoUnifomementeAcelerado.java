package ar.edu.unlam.pb1.trabajopractico06.prueba;

import ar.edu.unlam.pb1.trabajopractico06.dominio.Automovil;

public class MovimientoRectilineoUnifomementeAcelerado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil miniCooper=new Automovil(15,200.0);
		System.out.println(miniCooper.alcanzarVelocidadMaxima());
		Automovil ferrari=new Automovil(40,350.0);
		System.out.println(ferrari.alcanzarVelocidadMaxima());
		Automovil fitito=new Automovil(4,90.0);
		System.out.println(fitito.alcanzarVelocidadMaxima());
		
	}

}
