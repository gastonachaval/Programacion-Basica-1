package ar.edu.unlam.pb1.trabajopractico08.dominio;

public class TragamonedasGaston {
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public TragamonedasGaston() {
		tambor1= new Tambor();
		tambor2= new Tambor();
		tambor3= new Tambor();
	}

	public void girar() {
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();		
	}
	
	public boolean winSituation(){
		boolean gano=false;
		if (tambor1.getPosicion()==tambor2.getPosicion()&&tambor1.getPosicion()==tambor3.getPosicion()) {
			gano=true;
		}
		return gano;
	}
	public int getPosicion(Tambor tamborDeseado) {
		return tamborDeseado.getPosicion();
	}
	public int getPosicionTambor2() {
		return tambor2.getPosicion();
	}
	public int getPosicionTambor3() {
		return tambor3.getPosicion();
	}
	public String toString() {
		return "La posicion del tragamonedas es: "+getPosicion(tambor1)+"-"+getPosicion(tambor2)+"-"+getPosicion(tambor3);
	}

	
}
