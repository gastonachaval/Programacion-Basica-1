package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Persona {
	//Atributos
		private String nombre = "";
		private String genero = "";
		private long dni = 0;
		private double peso = 0.0;
		private double altura = 0.0;
		private int edad = 0;
		private boolean viva = true;
		
		private final int MAYORIA_DE_EDAD = 18; 

		private final int PESO_IDEAL = 0;
		private final int BAJO_PESO = -1;
		private final int SOBREPESO = 1;
		private final double VALOR_CRiTICO_MINIMO = 18.5;
		private final int VALOR_CRITICO_MAXIMO = 25;
			
		//Constructores
		public Persona(String nombre, String genero, long dni, short edad, double peso, double altura) {
			this.nombre = nombre;
			this.genero = genero;
			this.dni = dni;
			this.edad = edad;
			this.peso = peso;
			this.altura = altura;
		}
		
		//Métodos
		public String toString() {
			return nombre + " es " + genero + ", y su DNI es "+ dni + ", pesa " + peso + " Kg " + " y mide " + altura + " m" + ", tiene " + edad+ " años.";
		}
		
		public void alimentar(double kilos) {
			peso = peso + kilos;
		}

		public void crecer(double metros) {
			altura = altura + metros;
		}
		
		public void cumplirAnos() {
			edad++;
		}
		
		public boolean morir() {
			boolean murio = false;
			if(viva == true) {
				murio = false;
			}
			else {
				murio = true;
			}
			return murio;
		}
		
		public double pesar() {
			return peso;
		}
		
		public boolean esMayorDeEdad() {
			boolean mayorDeEdad = false;
			if(edad>=MAYORIA_DE_EDAD) {
				mayorDeEdad = true;
			}
			else {
				mayorDeEdad = false;
			}
			return mayorDeEdad;
		}

		public double calcularIMC() { 
			int imcActual = 0;
			double valorIMC = peso/(altura*altura);
			
			if(valorIMC < VALOR_CRiTICO_MINIMO) 
			{
				imcActual = BAJO_PESO;
			}
			else 
			{
				if(valorIMC<=VALOR_CRITICO_MAXIMO)
				{
					imcActual = PESO_IDEAL;
				}
				else
				{
						imcActual = SOBREPESO;
				}
			}
			return imcActual;
		}
	}

