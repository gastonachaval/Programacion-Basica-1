package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Mozo {

	private static int contadorMozos = 0;
	private String nombre = "";
	private int numeroEmpleado;
	private double facturacionDiaria;

	public Mozo(String nombreDelMozo) {
		this.nombre = nombreDelMozo;
		this.numeroEmpleado = contadorMozos++;
		this.facturacionDiaria = 0.0;
	}

	public Mozo() {
		this.nombre = "Vacio";
		this.numeroEmpleado = 0;
		this.facturacionDiaria = 0.0;
	}

	public String toString() {
		return "Mozo " + numeroEmpleado + " : " + nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public double getFacturacionDiaria() {
		return facturacionDiaria;
	}

	public void sumarPlatitaAFacturacionDiariaDelMozo(double facturacionMesa) {
		facturacionDiaria += facturacionMesa;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

}