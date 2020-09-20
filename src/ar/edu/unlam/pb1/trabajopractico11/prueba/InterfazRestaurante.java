package ar.edu.unlam.pb1.trabajopractico11.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajopractico11.dominio.Mozo;
import ar.edu.unlam.pb1.trabajopractico11.dominio.Restaurante;

public class InterfazRestaurante {

	static Scanner teclado = new Scanner(System.in);
	static Restaurante pancheriaCheta = new Restaurante();

	public static void main(String[] args) {

		char opcionSeleccionada = '\0';

		do {
			mostrarOpciones();
			opcionSeleccionada = (teclado.next()).charAt(0);
			seleccionOpcion(opcionSeleccionada);
		} while (opcionSeleccionada != '9');

	}

	private static void mostrarOpciones() {
		System.out.println("Menu de opciones");
		System.out.println("1 - Alta de mozos");
		System.out.println("2 - Consultar mesas disponibles");
		System.out.println("3 - Ingresar Comensales");
		System.out.println("4 - Agregar pedido a una mesa");
		System.out.println("5 - Cerrar Mesa");
		System.out.println("6 - Cerrar Caja");
		System.out.println("7 - Listado de platos");
		System.out.println("8 - Listado de mozos");
		System.out.println("9 - Salir");
	}

	private static void seleccionOpcion(char opcionSeleccionada) {
		switch (opcionSeleccionada) {
		case '1':
			opcion1();
			break;

		case '2':
			opcion2();
			break;

		case '3':
			opcion3();
			break;

		case '4':
			opcion4();
			break;

		case '5':
			opcion5();
			break;

		case '6':
			opcion6();
			break;

		case '7':
			opcion7();
			break;

		case '8':
			opcion8();
			break;

		case '9':
			System.out.println("Nos vemo !");
			break;

		default:
			opcionInvalida();
			break;
		}
	}

	private static void opcion1() {
		do {
			System.out.println("Ingrese el nombre del mozo");
			String nombreDelMozo = teclado.next();
			pancheriaCheta.darAltaAUnMozo(nombreDelMozo);
			if (pancheriaCheta.isSePudoAgregarMozo() == false) {
				System.out.println("Error en ingreso de mozo");
			}
		} while (pancheriaCheta.isSePudoAgregarMozo() == false);
		System.out.println("El mozo fue ingresado correctamente");
		System.out.println("***********************************");
	}

	private static void opcion2() {
		System.out.println(pancheriaCheta.recorrerMesasYChequarSiEstanOcupadas());
		System.out.println("***********************************");
	}

	private static void opcion3() {
		if (pancheriaCheta.chequearQueHayaMozosDisponibles() == true) {
			System.out.println("Ingrese su codigo de mozo");
			int codigoDeMozo = teclado.nextInt();
			System.out.println("Ingrese el numero de mesa:");
			int numeroDeMesa = teclado.nextInt();
			if (pancheriaCheta.estaDisponibleLaMesa(numeroDeMesa) == true) {
				pancheriaCheta.asignarMozoALaMesa(codigoDeMozo, numeroDeMesa);
			} else {
				System.out.println("Esa mesa esta ocupada");
				System.out.println("***********************************");
				return;
			}
			System.out.println("Ingrese la cantidad de comensales a sentar:");
			int cantidadDeComensales = teclado.nextInt();
			if (pancheriaCheta.sentarComensales(numeroDeMesa, cantidadDeComensales) == true) {
				System.out.println("Los comensales se ingresaron correctamente");
				System.out.println("***********************************");
			} else {
				System.out.println("Los comensales no entran en esta mesa");
				System.out.println("***********************************");
				return;
			}

		} else {
			System.out.println("No hay mozos disponibles para atender las mesas");
			System.out.println("***********************************");
			return;
		}

	}

	private static void opcion4() {
		int numeroDeMesa;
		if (pancheriaCheta.chequearQueHayaMozosDisponibles() == true) {
			System.out.println("Ingrese el numero de mesa:");
			numeroDeMesa = teclado.nextInt();
		} else {
			System.out.println("No hay mozos disponibles para atender las mesas");
			System.out.println("***********************************");
			return;
		}
		if (pancheriaCheta.mesaOcupada(numeroDeMesa) == true) {
			opcion7();
			pancheriaCheta.cargarPedidoAMesa(numeroDeMesa);
		} else {
			System.out.println("No hay nadie en esa mesa");
			System.out.println("***********************************");
			return;
		}
	}

	private static void opcion5() {
		System.out.println("Ingrese el numero de mesa a cerrar");
		int mesaACerrar = teclado.nextInt();
		System.out.println("Mesa " + mesaACerrar + " cerrada. Su consumicion total fue de: "
				+ pancheriaCheta.cerrarMesa(mesaACerrar) + " $");
	}

	private static void opcion6() {
		System.out.println("Closed !");
		System.out.println("***********************************");
		System.out.println("Ranking de comandas:");
		pancheriaCheta.rankearComandas();
		pancheriaCheta.mostrarRankingDeComandas();
		System.out.println("***********************************");
		System.out.println("Ranking de mozos:");
		pancheriaCheta.mostrarRankingDeMozos();
		System.out.println("***********************************");
		System.out.println("FACTURACION TOTAL: " + pancheriaCheta.getFacturacionDiariaRestaurant() + " $");
		System.out.println("Nos vemos !");

	}

	private static void opcion7() {
		System.out.println("Nuestro menu:");
		System.out.println(pancheriaCheta.mostrarCarta());
		System.out.println("***********************************");
	}

	private static void opcion8() {
		System.out.println("Nuestros mozos:");
		System.out.println(pancheriaCheta.mostrarStaff());
		System.out.println("***********************************");
	}

	private static void opcionInvalida() {
		System.out.println("Ingrese una opcion valida !");
		System.out.println("***********************************");
	}

}