package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Automovil {
	//atts
	private double velocidad = 0.0;
	private double horas = 0.0;
	private final double CONVERSOR_VELOCIDAD = 3.6;
	private final double CONVERSOR_TIEMPO = 60;
	private final double CONVERSOR_KILOMETROS = 1000;
	private int aceleracion;
	private double velocidadMaxima;

	//bob

	public Automovil(double velocidad,double horas){
		this.velocidad = velocidad/CONVERSOR_VELOCIDAD;
		this.horas = horas/CONVERSOR_TIEMPO;
	}
	public Automovil(int aceleracion,double velocidadMaxima){
		this.aceleracion = aceleracion;
		this.velocidadMaxima = velocidadMaxima/CONVERSOR_VELOCIDAD;
	}

	//metodos
	public double getDistanciaRecorridaEnMetros(){
		return (velocidad*CONVERSOR_VELOCIDAD*horas)*CONVERSOR_KILOMETROS;
	}

	public double getKilometrosPorHora(){
		return velocidad*CONVERSOR_VELOCIDAD;
	}

	public double getDistanciaRecorridaEnKilometros(){
		return velocidad*CONVERSOR_VELOCIDAD*horas;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public double getHoras() {
		return horas;
	}
	public String alcanzarVelocidadMaxima() {
		return "El tiempo que se necesito para alcanzar la velocidad maxima fue de: "+velocidadMaxima/aceleracion+" segundos.";
	}
}

