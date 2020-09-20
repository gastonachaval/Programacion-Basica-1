package ar.edu.unlam.pb1.trabajopractico08.dominio;

public class Tragamonedas {
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	private int posicion;
	private final byte CANTIDAD_DE_TAMBORES=3;
	
	public Tragamonedas() {
		tambor1= new Tambor();
		tambor2= new Tambor();
		tambor3= new Tambor();
	}
	
	public int getPosicionTragamonedas() {
		return posicion;
	}

	public void girar() {
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
		posicion=(tambor1.getPosicion()+tambor2.getPosicion()+tambor3.getPosicion());
		winSituation();
		
		
	}
	private String winSituation(){
		posicion=(tambor1.getPosicion()+tambor2.getPosicion()+tambor3.getPosicion());
		if (posicion%CANTIDAD_DE_TAMBORES==0) {
			return "Ganaste !";
		}
		else {
			return "Segui participando";
		}
	}
	
}
