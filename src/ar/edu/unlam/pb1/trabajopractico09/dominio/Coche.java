package ar.edu.unlam.pb1.trabajopractico09.dominio;

public class Coche {
	private byte codigoDelCoche;
	private String marca;
	private String modelo;
	private int precio;

	public Coche (String marca,String modelo,int precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}
	
	public Coche() {
		this.marca="Vacio";
		this.modelo="Vacio";
		this.codigoDelCoche=-1;
		this.precio=0;
	}

	public void setCodigoDelCoche(byte codigoDelCoche) {
		this.codigoDelCoche = codigoDelCoche;
	}

	@Override
	public String toString() {
		return "Codigo=" + codigoDelCoche + " Marca:" + marca + " Modelo:" + modelo + " Precio: $ " + precio;
	}

	public String getMarca() {
		return marca;
	}

	public int getPrecio() {
		return precio;
	}

	public String getModelo() {
		return modelo;
	}
}
