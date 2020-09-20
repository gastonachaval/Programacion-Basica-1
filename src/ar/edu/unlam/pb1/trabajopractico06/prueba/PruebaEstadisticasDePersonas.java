package ar.edu.unlam.pb1.trabajopractico06.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajoPractico03.dominio.Persona;

public class PruebaEstadisticasDePersonas {

	private static int opcionDeseada;
	static ar.edu.unlam.pb1.trabajopractico06.dominio.Persona personaUno;
	
	private static int cantidadDePersonas;
	private static double pesoTotal;
	
	private static int cantidadPersonasConBajoPeso;
	private static int cantidadPersonasConPesoNormal;
	private static int cantidadDePersonasConSobrepeso;
	private static int valorImc;
	private static short totalEdadPersonasBajoPeso;
	private static short totalEdadPersonasSobrepeso;
	
	public static void main(String[] args) {
		//Variables
		 opcionDeseada = 0;
		String nombre = "";
		String genero = "";
		long dni = 0;
		short edad;
		double peso = 0.0;
		double altura = 0.0;
		
		final int TOTAL_PERSONAS = 4;
		int i = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		//Validación de la opcion ingresada: 
		while(opcionDeseada != 9) {//Si se ingresa un 9, el while no se realiza (Es salir)
			do {
				mostrarElMenu();
				System.out.println("Ingresá la opción deseada: ");
				opcionDeseada = teclado.nextInt();
				
				switch(opcionDeseada) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
					System.out.println("La opción seleccionada es: " + getOpcionDeseada());
					System.out.println();
					break;
				case 9:
					System.out.println("Saliendo del menú...");
					break;
				default:
					System.out.println("La opción seleccionada es inválida. Elija una nueva opción.");
					System.out.println();
					break;
				}
			}while((opcionDeseada<1 || opcionDeseada>7) && opcionDeseada != 9);
		
			
			//Una vez recibida la opción, se ejecutará la función correspondiente:
			switch(opcionDeseada) {
			case 1:
				//Registro de una nueva persona
				do {
				System.out.println("Ingresá los datos: ");
				System.out.println("Nombre: ");
				nombre = teclado.next();
				System.out.println("Genero: ");
				genero = teclado.next();
				System.out.println("DNI: ");
				dni = teclado.nextLong();
				System.out.println("Edad: ");
				edad = teclado.nextShort();
				System.out.println("Peso: ");
				peso = teclado.nextDouble();
				System.out.println("Altura: ");
				altura = teclado.nextDouble();
				registrarPersona(nombre, genero, dni, edad, peso, altura);
				i++;
				}while(i<TOTAL_PERSONAS);
				
				System.out.println();
				System.out.println("Registro de personas completado. A continuación elija una nueva opción.");
				System.out.println();
				break;
			case 2: //Informar el peso promedio
				//System.out.println("El peso total es: " + pesoTotal());
				//System.out.println("total de personas: "+ cantidadPersonas());
				System.out.println("El peso promedio de la muestra de personas es: " + pesoPromedio());
				System.out.println();
				break;
			case 3: //Cantidad de personas con bajo peso
				System.out.println("La cantidad de personas con bajo peso es: " + getCantidadDePersonasConBajoPeso());
				System.out.println();
				break;
			case 4: //Cantidad de personas con peso normal
				System.out.println("La cantidad de personas con peso normal es: " + getCantidadDePersonasConPesoNormal());
				System.out.println();
				break;
			case 5: //Cantidad de personas con sobrepeso
				System.out.println("La cantidad de personas con sobrepeso es: " + getCantidadDePersonasConSobrepeso());
				System.out.println();
				break;
			case 6: //Promedio de edad de las personas con bajo peso 
				System.out.println("El promedio de edad de las personas con bajo peso es: " + getPromedioDeEdadPersonasConBajoPeso());
				System.out.println();
				break;
			case 7: //Promedio de edad de las personas con sobrepeso
				System.out.println("El promedio de edad de las personas con sobre peso es: " + getPromedioDeEdadPersonasConSobrepeso());
				System.out.println();
				break;
			}
		}
	}
	
	private static void mostrarElMenu() {
		System.out.println("Bienvenido al INDEC");
		System.out.println("Menú de opciones");
		System.out.println("******************");
		System.out.println("1) Registrar nueva persona");
		System.out.println("2) Informar el peso promedio de la muestra");
		System.out.println("3) Informar la cantidad de personas con bajo peso");
		System.out.println("4) Informar la cantidad de personas con peso normal");
		System.out.println("5) Informar la cantidad de personas con sobrepeso");
		System.out.println("6) Promedio de edad de las personas con bajo peso");
		System.out.println("7) Promedio de edad de las personas con sobrepeso");
		System.out.println("9) Salir");
		System.out.println("******************");
		
	}
	
	public static int getOpcionDeseada() {
		return opcionDeseada;
	}
	
	public static void registrarPersona(String nombre, String genero, long dni, short edad, double peso, double altura) {
		
		personaUno = new Persona(nombre, genero, dni, edad, peso, altura);
		
		cantidadDePersonas++;
		pesoTotal = pesoTotal + peso;
		
		
		valorImc = personaUno.calcularIMC();
		
		switch(valorImc) {
		case -1:
			cantidadPersonasConBajoPeso++;
			totalEdadPersonasBajoPeso+= edad;
			break;
		case 0:
			cantidadPersonasConPesoNormal++;
			break;
		case 1:
			cantidadDePersonasConSobrepeso++;
			totalEdadPersonasSobrepeso+= edad;
			break;
		}	
	}
	
	
	public static double pesoTotal() {
		return pesoTotal;
	}
	public static int cantidadPersonas() {
		return cantidadDePersonas;
	}
	public static double pesoPromedio() {
		return (pesoTotal/cantidadDePersonas);
	}
	//Método para mostrar la cantidad de personas con bajo peso:
	public static int getCantidadDePersonasConBajoPeso() {
		return cantidadPersonasConBajoPeso;
	}
	
	//Método para mostrar la cantidad de personas con peso normal:
	public static int getCantidadDePersonasConPesoNormal() {
		return cantidadPersonasConPesoNormal;
	}
	
	//Método para mostrar la cantidad de personas con sobrepeso:
	public static int getCantidadDePersonasConSobrepeso() {
		return cantidadDePersonasConSobrepeso;
	}
	
	//Método para mostrar el promedio de edad de personas con peso bajo:
	public static double getPromedioDeEdadPersonasConBajoPeso() {
		return (totalEdadPersonasBajoPeso/(double)cantidadPersonasConBajoPeso);
	}
	
	//Método para mostrar el promedio de edad de personas con sobre peso:
	public static double getPromedioDeEdadPersonasConSobrepeso() {
		return (totalEdadPersonasSobrepeso/(double)cantidadDePersonasConSobrepeso);
	}
	

}
