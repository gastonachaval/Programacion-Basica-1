package ar.edu.unlam.pb1.trabajopractico08.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajopractico08.dominio.Cuenta;

public class CajeroAutomatico {
	
	static Scanner teclado = new Scanner(System.in);
	static Cuenta miCuenta= new Cuenta ("Gaston",1000.0);
	static final String DEPOSITAR="DEPOSITAR";
	static final String EXTRAER="EXTRAER";
	static final String CONSULTAR="CONSULTAR";
	static final String SALIR="SALIR";
	static final String YES="Y";
	static String opcionIngresada;
	static String yesOrNo;
	
	public static void main(String[] args) {
		System.out.println("Bienvenido al cajero de E Corp");
		System.out.println("Ingrese una opcion:");
		System.out.println(DEPOSITAR);
		System.out.println(EXTRAER);
		System.out.println(CONSULTAR);
		System.out.println(SALIR);
		opcionIngresada=teclado.next();
		if (opcionIngresada.equalsIgnoreCase(DEPOSITAR)) {
			System.out.println("Su saldo es de "+miCuenta.getSaldo());
			System.out.println("Ingrese el importe a depositar:");
			miCuenta.depositar(teclado.nextDouble());
			System.out.println("Su nuevo saldo es de "+miCuenta.getSaldo());
			System.out.println("Desea realizar otra operacion? Y/N");
			yesOrNo=teclado.next();
			while (yesOrNo.equalsIgnoreCase(YES)==true) {
				CajeroAutomatico.main(args); 
			}
			System.out.println("Nos vemoooo");
			}
		else if (opcionIngresada.equalsIgnoreCase(EXTRAER)) {
			System.out.println("Su saldo es de "+miCuenta.getSaldo());
			System.out.println("Ingrese el importe a extraer:");
			miCuenta.retirar(teclado.nextDouble());
			System.out.println("Su nuevo saldo es de "+miCuenta.getSaldo());
			System.out.println("Desea realizar otra operacion? Y/N");
			yesOrNo=teclado.next();
			while (yesOrNo.equalsIgnoreCase(YES)==true) {
				CajeroAutomatico.main(args);
			}
			System.out.println("Nos vemoooo");
						
		}
		else if (opcionIngresada.equalsIgnoreCase(CONSULTAR)) {
			System.out.println("Su saldo es de "+miCuenta.getSaldo());
			System.out.println("Desea realizar otra operacion? Y/N");
			yesOrNo=teclado.next();
			while (yesOrNo.equalsIgnoreCase(YES)==true) {
				CajeroAutomatico.main(args);
			}
			System.out.println("Nos vemoooo");
		}
		else if (opcionIngresada.equalsIgnoreCase(SALIR)) {
			System.out.println("Nos vemoooo");
		}
		else {
			System.out.println("Ingresa una opcion valida !");
			CajeroAutomatico.main(args);
		}

		
		
		
	}
}
