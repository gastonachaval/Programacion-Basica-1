package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Scanner;

import ar.edu.unlam.pb1.trabajopractico09.dominio.Sistema;
import ar.edu.unlam.pb1.trabajopractico09.dominio.Usuario;

public class PruebaSistema {
	
	static Scanner teclado = new Scanner(System.in);
	static Sistema sistemaPrueba;
	
	static int opcionSeleccionada;
	
	public static void main(String[] args) {
		System.out.println("*************************************");
		System.out.println();
		System.out.println("Bienvenido al sistema de usuarios de pepito");
		System.out.println();
		System.out.println("*************************************");		
		System.out.println("Ingrese la cantidad de usuarios que hay que bancar");
		sistemaPrueba=new Sistema(teclado.nextInt());
		System.out.println("*************************************");
		do {
			mostrarMenu();
			opcionSeleccionada=teclado.nextInt();
			switchOpciones(opcionSeleccionada);
		} while (opcionSeleccionada!=9);

		
		

	}

	private static void switchOpciones(int opcionSeleccionada) {
		switch (opcionSeleccionada) {
		case 1:
			System.out.println("Ingrese el nombre del sistema");
			sistemaPrueba.setNombreSistema(teclado.next());
			System.out.println("El nuevo nombre del sistema es: "+sistemaPrueba.getNombreSistema());
			System.out.println("*************************************");
			break;

		case 2:
			if (sistemaPrueba.meterUsuarioNuevoEnBaseDeDatos(instaciacionNuevoUser())==true) {
				System.out.println("EL usuario se ingreso correctamente");
				System.out.println("*************************************");
			}
			else {
				System.out.println("Hubo un problema en la carga del usuario");
				System.out.println("*************************************");
			}
			break;
			
		case 3:
			System.out.println("Bienvenido al sistema "+sistemaPrueba.getNombreSistema()+" .");
			String usuarioALoguear;
			String contrasenaIngresada;
			do {
				System.out.println("Ingrese su usuario:");
				usuarioALoguear=teclado.next();
			} while (sistemaPrueba.buscarUsuario(usuarioALoguear)==false);
			do {
				System.out.println("Ingrese su contraseña:");
				contrasenaIngresada=teclado.next();
			} while (sistemaPrueba.loguearConContrasena(usuarioALoguear, contrasenaIngresada)==false);
		
		case 9:
			System.out.println("Nos vemos !");
			break;
			
		default:
			System.out.println("Opcion invalida");
			System.out.println("*************************************");
			break;
		}
		
			
		
		
	}


	private static Usuario instaciacionNuevoUser() {
		System.out.println("Ingrese el nombre del usuario a cargar");
		String nombreUsuarioACrear=teclado.next();
		System.out.println("*************************************");
		System.out.println("Ingrese contrasena del usuario "+nombreUsuarioACrear.toUpperCase());
		String contrasena=teclado.next();
		Usuario usuarioAAgregar=new Usuario(nombreUsuarioACrear, contrasena);
		return usuarioAAgregar;
	}


	private static void mostrarMenu() {
		System.out.println("1.Ingresar el nombre del Sistema ");
		System.out.println("2.Agregar usuarios al Sistema ");
		System.out.println("3.Loguearse en el Sistema");
		System.out.println("9.Salir");
		
	}

}
