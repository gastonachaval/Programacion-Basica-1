package ar.edu.unlam.pb1.trabajopractico05.dominio;

public class Persona {
	
	private String nombre="";
	private String genero="";
	private int dni=0;
	private double altura=0.0;
	private double peso=0.0;
	private int edad=0;
	private boolean viva=false;
	private final int VERY_FLACO=-1;
	private final int FLACO=0;
	private final int GORDITO=1;
	private final int MIN_VALUE=20;
	private final int MAX_VALUE=25;
	
	public Persona(String nombre,String genero,int dni,double altura,double peso){
		this.nombre = nombre;
		this.genero = genero;
		this.dni= dni;
		this.altura = altura;
		this.peso= peso;
		viva=true;
	}
	public Persona(String nombre,String genero,int dni,double altura,double peso,int edad){
		this.nombre = nombre;
		this.genero = genero;
		this.dni= dni;
		this.altura = altura;
		this.peso= peso;
		this.edad=edad;
		viva=true;
	}

	public String toString(){
		return nombre+"-"+genero+"-"+dni+"-"+altura+"-"+peso+"-"+edad;
	}
	public void alimentar(double morfi){
		peso = peso+morfi;
	}
	public void crecer(double metrosDeDios){
		altura=altura+metrosDeDios;
	}
	public void cumplirAnos(){
		this.edad=++edad;
	}
	public void morir(){
		viva=false;
	}
	public double pesar(){
		return peso;
	}
	public boolean estoyVivo(){
		return viva;
	}
	public boolean esMayorDeEdad(){
		if (edad>=18){
			return true;
		}
		else{
			return false;
		}
			}
	public double calcularIMC(){
		double imc=peso/altura*altura;
		if (imc<MIN_VALUE) {
			return VERY_FLACO;
		}
		else if (imc>=MIN_VALUE&&imc<=MAX_VALUE) {
			return FLACO;
		}
		else{
			return GORDITO;
		}
	}
}

