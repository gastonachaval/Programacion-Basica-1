package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Tornillo {

	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;
	
	public Tornillo(char tipoDeCabeza,int longitud,int cantidadDeRosca) {
		this.TIPO_DE_CABEZA=tipoDeCabeza;
		this.LONGITUD=longitud;
		this.CANTIDAD_DE_ROSCA=cantidadDeRosca;
		posicionActual=0;
	}

	public char getTIPO_DE_CABEZA() {
		return TIPO_DE_CABEZA;
	}

	public int getLONGITUD() {
		return LONGITUD;
	}
	public boolean girar(char sentido) { 
		boolean sePuedeGirar=false;
		final char SENTIDO_HORARIO='H';
		final char SENTIDO_ANTIHORARIO='A';
		if (sentido==SENTIDO_ANTIHORARIO) {
			posicionActual--;
			sePuedeGirar=true;
			
	}
		if (sentido==SENTIDO_HORARIO) {
			posicionActual++;
			sePuedeGirar=true;
	}
			return sePuedeGirar;
}

	public int getPosicionActual() {   //metodo extra
		return posicionActual;
	}

	public int getCANTIDAD_DE_ROSCA() {  //metodo extra
		return CANTIDAD_DE_ROSCA;
	}
}
