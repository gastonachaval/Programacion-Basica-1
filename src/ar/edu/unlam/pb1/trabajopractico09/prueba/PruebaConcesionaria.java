package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajopractico09.dominio.Coche;
import ar.edu.unlam.pb1.trabajopractico09.dominio.Concesionaria;

public class PruebaConcesionaria {

	static Scanner teclado = new Scanner(System.in);
	static int opcionSeleccionada;
	static Concesionaria automundo=new Concesionaria();

	public static void main(String[] args) {
		System.out.println("*************************************");
		System.out.println("Bienvenido al sistema de gestion de automoviles");
		System.out.println("*************************************");

		do {
			mostrarOpciones();
			opcionSeleccionada = teclado.nextInt();
			seleccionOpcion(opcionSeleccionada);
		} while (opcionSeleccionada != 9);

	}

	private static void seleccionOpcion(int opcion) {
		switch (opcion) {
		case 1:
			System.out.println("*************************************");
			System.out.println("Ingrese la marca del vehiculo");
			String marcaDelVehiculoAIngresar = teclado.next();
			System.out.println("Ingrese el modelo del vehiculo");
			String modeloDelVehiculoAIngresar = teclado.next();
			System.out.println("Ingrese el precio del vehiculo");
			int precioDelVehiculoAIngresar=teclado.nextInt();
			Coche vehiculoAIngresar = new Coche(marcaDelVehiculoAIngresar, modeloDelVehiculoAIngresar, precioDelVehiculoAIngresar);
			automundo.agregarCoche(vehiculoAIngresar);
			System.out.println("*************************************");
			break;
			
		case 2:
			System.out.println("*************************************");
			System.out.println(automundo.getFlota());
			System.out.println("*************************************");
			break;
			
		case 3:
			System.out.println("*************************************");
			System.out.println("Ingrese el codigo del coche a buscar");
			System.out.println(automundo.getVehiculoPorCodigo(teclado.nextByte()));
			System.out.println("*************************************");
			break;
			
		case 4:
			System.out.println("*************************************");
			System.out.println("Ingrese el precio minimo de vehiculos a buscar");
			int precioMinimo=teclado.nextInt();
			System.out.println("Ingrese el precio maximo de vehiculos a buscar");
			int precioMaximo=teclado.nextInt();
			System.out.println("*************************************");
			System.out.println(automundo.buscarVehiculosEnUnRangoDePrecio(precioMinimo,precioMaximo));
			System.out.println("*************************************");
			break;
		
		case 5:
			System.out.println("*************************************");
			System.out.println("Ingrese la marca del vehiculo a buscar");
			System.out.println(automundo.buscarVehiculosPorMarca(teclado.next()));
			System.out.println("*************************************");
			break;
			
		case 6:
			System.out.println("*************************************");
			System.out.println("Ingrese el modelo de vehiculo a buscar");
			System.out.println(automundo.buscarVehiculosPorModelo(teclado.next()));
			System.out.println("*************************************");
			break;

		case 9:
			System.out.println("*************************************");
			System.out.println("Nos vemos");		
			System.out.println("*************************************");
			break;
		default:
			System.out.println("Opcion Invalida");
			System.out.println("*************************************");
			break;
		}

	}

	private static void mostrarOpciones() {
		System.out.println("*************************************");
		System.out.println("Seleccione una opcion");
		System.out.println("*************************************");
		System.out.println("1.Ingresar nuevo vehiculo");
		System.out.println("2.Mostrar Listado de vehiculos");
		System.out.println("3.Buscar vehiculos por codigo");
		System.out.println("4.Buscar vehiculos en un rango de precio");
		System.out.println("5.Buscar vehiculos por marca");
		System.out.println("6.Buscar vehiculos por modelo");
		System.out.println("9.Salir");

	}

}
