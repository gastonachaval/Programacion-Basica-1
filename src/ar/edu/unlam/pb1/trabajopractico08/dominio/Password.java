package ar.edu.unlam.pb1.trabajopractico08.dominio;

public class Password {
	private byte longitud;
	private String contrasena;
	
	public Password(String contrasena) {
		setLongitud((byte)8);
		if (contrasena.length()==longitud) {
			setContrasena(contrasena);
		}
	}
	
	public Password(byte longitud) {
		final byte CERO_EN_ASCII=48;
		final byte Z_MINUSCULA_EN_ASCII=122;
		setLongitud(longitud);
		
		for (int i = 0; i < longitud; i++) {
			contrasena=contrasena.charAt(i)
		}(Math.random()*(CERO_EN_ASCII-Z_MINUSCULA_EN_ASCII)+Z_MINUSCULA_EN_ASCII);*/
	}
	
	public boolean esFuerte() {
		boolean esFuerte=false;
		char letraSeleccionada;
		short letraConvertidaAShort;
		short contadorDeNumeros=0;
		short contadorDeMinusculas=0;
		short contadorDeMayusculas=0;
		final short MINIMO_MINUSCULAS=97;
		final short MAYOR_MINUSCULAS=122;
		final short MINIMO_MAYUSCULAS=65;
		final short MAYOR_MAYUSCULAS=90;
		final short MINIMO_NUMEROS=48;
		final short MAYOR_NUMEROS=57;
		final byte MAYUSCULAS_SEGURAS=2;
		final byte MINUSCULAS_SEGURAS=1;
		final byte NUMEROS_SEGURO=5;
		for (int i = 0; i < contrasena.length(); i++) {
			letraSeleccionada=(contrasena.charAt(i));
			letraConvertidaAShort=(short)letraSeleccionada;
			if (letraConvertidaAShort>=MINIMO_MINUSCULAS&&letraConvertidaAShort<=MAYOR_MINUSCULAS) {
				++contadorDeMinusculas;
			}
			else if (letraConvertidaAShort>=MINIMO_MAYUSCULAS&&letraConvertidaAShort<=MAYOR_MAYUSCULAS) {
				++contadorDeMayusculas;
			}
			else if (letraConvertidaAShort>=MINIMO_NUMEROS&&letraConvertidaAShort<=MAYOR_NUMEROS) {
				++contadorDeNumeros;
			}
			}
		if (contadorDeMayusculas>MAYUSCULAS_SEGURAS&&contadorDeMinusculas>MINUSCULAS_SEGURAS&&contadorDeNumeros>NUMEROS_SEGURO) {
			esFuerte=true;
		}
		return esFuerte;	
	}
		


	public byte getLongitud() {
		return longitud;
	}

	public void setLongitud(byte longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}
