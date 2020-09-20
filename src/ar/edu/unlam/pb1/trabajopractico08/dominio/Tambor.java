package ar.edu.unlam.pb1.trabajopractico08.dominio;

public class Tambor {
 private final int POSICION_MINIMA=1;
 private final int POSICION_MAXIMA=8;
 private int posicion=1;
 
 
public void girar() {
	posicion=(int) (Math.random()*(POSICION_MINIMA-POSICION_MAXIMA)+POSICION_MAXIMA);
}

public int getPosicion() {
	return posicion;
}
 
 
}
