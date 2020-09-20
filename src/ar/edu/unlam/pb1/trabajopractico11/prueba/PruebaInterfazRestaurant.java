package ar.edu.unlam.pb1.trabajopractico11.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajopractico11.dominio.Restaurante;

public class PruebaInterfazRestaurant {
	public static void main(String[] args) {
		String mozo1 = "Gaston";
		String mozo2 = "Scarlet";
		String mozo3 = "Benjamin";
		pancheriaCheta.darAltaAUnMozo(mozo1);
		pancheriaCheta.darAltaAUnMozo(mozo2);
		pancheriaCheta.darAltaAUnMozo(mozo3);
		System.out.println(pancheriaCheta.mostrarStaff());
		System.out.println(pancheriaCheta.recorrerMesasYChequarSiEstanOcupadas());
		int codigoDeMozo = 1;
		int numeroDeMesa = 1;
		int cantidadDeComensales = 2;
		pancheriaCheta.asignarMozoALaMesa(codigoDeMozo, numeroDeMesa);
		pancheriaCheta.sentarComensales(numeroDeMesa, cantidadDeComensales);
		System.out.println(pancheriaCheta.recorrerMesasYChequarSiEstanOcupadas());
		pancheriaCheta.cargarPedidoAMesa(numeroDeMesa);
		opcion5();
		opcion6();

	}

	static Restaurante pancheriaCheta = new Restaurante();
	static Scanner teclado = new Scanner(System.in);

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
			}
			System.out.println("Ingrese la cantidad de comensales a sentar:");
			int cantidadDeComensales = teclado.nextInt();
			pancheriaCheta.sentarComensales(numeroDeMesa, cantidadDeComensales);
			System.out.println("***********************************");
		} else {
			System.out.println("No hay mozos disponibles para atender las mesas");
			System.out.println("***********************************");
		}

	}

	private static void opcion4() {
		System.out.println("Ingrese el numero de mesa:");
		int numeroDeMesa = teclado.nextInt();
		opcion7();
		pancheriaCheta.cargarPedidoAMesa(numeroDeMesa);
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