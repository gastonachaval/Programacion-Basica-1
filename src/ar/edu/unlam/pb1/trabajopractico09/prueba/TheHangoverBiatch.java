package ar.edu.unlam.pb1.trabajopractico09.prueba;

import java.util.Arrays;
import java.util.Scanner;

public class TheHangoverBiatch {
	
	static Scanner teclado= new Scanner (System.in);
	static char[] arrayPalabraJugador1;
	static char[] arrayPalabraJugador2;
	static char[] palabraJugador1ConGuiones;
	static char[] palabraJugador2ConGuiones;

	static byte turnoActual=(byte) (Math.random()*10);
	static byte cantidadDeVidasJugador1=6;
	static byte cantidadDeVidasJugador2=6;
	static byte jugadorGanador=0;
	
	static String nombreJugador1="";
	static String nombreJugador2="";
	
	
		public static void main(String[] args) {
			

			System.out.println("Bienvenido al Ahorcado !");
			System.out.println("*************************************");
			
			System.out.println("Ingrese su nombre jugador 1");
			nombreJugador1=teclado.next();
			
			
			System.out.println("Ingrese su nombre jugador 2");
			nombreJugador2=teclado.next();
			
			System.out.println("Ingrese palabra a adivinar "+nombreJugador1.toUpperCase()+" :");
			arrayPalabraJugador1=teclado.next().toUpperCase().toCharArray();
			clsScreen();

			
			System.out.println("Ingrese palabra a adivinar "+nombreJugador2.toUpperCase()+" :");
			arrayPalabraJugador2=teclado.next().toUpperCase().toCharArray();
			clsScreen();

			
			palabraJugador1ConGuiones=new char[arrayPalabraJugador1.length];
			palabraJugador2ConGuiones=new char[arrayPalabraJugador2.length];
			
			cargarVectorConGuiones(palabraJugador1ConGuiones);
			cargarVectorConGuiones(palabraJugador2ConGuiones);
			
			clsScreen();
		
			
			
			
			if (turnoActual>5) {
				turnoActual=2;
			}
			else {
				turnoActual=1;
			}
			
			do {
				mostrarHorcaAJugador(turnoActual);
			} while (jugadorGanador==0);
			
			switch (jugadorGanador) {
			case 1:
				System.err.println("El ganador es "+nombreJugador1.toUpperCase());
				break;
			case 2:
				System.err.println("El ganador es "+nombreJugador2.toUpperCase());
				break;
			case 3:
				System.err.println("Hubo un empate !");
				break;

			default:
				System.err.println("El ganador es desconocido");
				break;
			}
			
			
			
			
			
			
		}

		private static void clsScreen() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("");				
			}
			
		}

		private static void cargarVectorConGuiones(char[] vectorACargarGuiones) {
			for (int i = 0; i < vectorACargarGuiones.length; i++) {
				vectorACargarGuiones[i]='-';
			}
		}
		
		private static void mostrarHorcaAJugador(int jugador) {
			if (jugador==1) {
				mostrarVidasYPalabraConGuiones(jugador);
				promptOpciones();
				int opcionSeleccionada=teclado.nextInt();
				System.out.println("*************************************");
				if (opcionSeleccionada==1) {
					ingresarLetra(jugador);
				}
				if (opcionSeleccionada==2) {
					arriesgarPalabra(jugador);
				}
				
			}
			if (jugador==2) {
				mostrarVidasYPalabraConGuiones(jugador);
				promptOpciones();
				int opcionSeleccionada=teclado.nextInt();
				System.out.println("*************************************");
				if (opcionSeleccionada==1) {
					ingresarLetra(jugador);
				}
				if (opcionSeleccionada==2) {
					arriesgarPalabra(jugador);
				}
			}
			
		}

		private static void arriesgarPalabra(int jugador) {
			if (jugador==1) {
				System.out.println(nombreJugador1.toUpperCase()+" ingrese la palabra a arriesgar...");
				String palabraArriesgada=teclado.next().toUpperCase();
				if (Arrays.equals(palabraArriesgada.toCharArray(), arrayPalabraJugador2)==true) {
					System.out.println("Correcto !");
					System.out.println("*************************************");
					jugadorGanador=1;
					System.out.println(nombreJugador2.toUpperCase()+" , arriesga una palabra para ver si hay empate !");
					palabraArriesgada=teclado.next().toUpperCase();
					if (Arrays.equals(palabraArriesgada.toCharArray(), arrayPalabraJugador1)==true) {
						System.out.println("Correcto !");
						jugadorGanador=3;				
					}
				}
				else {
					jugadorGanador=2;
				}
			}
			if (jugador==2) {
				System.out.println(nombreJugador2.toUpperCase()+" ingrese la palabra a arriesgar...");
				String palabraArriesgada=teclado.next().toUpperCase();
				if (Arrays.equals(palabraArriesgada.toCharArray(), arrayPalabraJugador1)==true) {
					System.out.println("Correcto !");
					System.out.println("*************************************");
					jugadorGanador=2;
					System.out.println(nombreJugador1.toUpperCase()+" , arriesga una palabra para ver si hay empate !");
					palabraArriesgada=teclado.next().toUpperCase();
					if (Arrays.equals(palabraArriesgada.toCharArray(), arrayPalabraJugador2)==true) {
						System.out.println("Correcto !");
						jugadorGanador=3;				
					}
				}
				else {
					jugadorGanador=1;
				}
			}
			
		}

		private static void ingresarLetra(int jugadorActual) {
			if (jugadorActual==1) {
				System.out.println("Ingrese la letra:");
				if (chequearLetraEnPalabra(jugadorActual,teclado.next().toUpperCase().charAt(0))==false) {
					cantidadDeVidasJugador1--;
					System.out.println(palabraJugador2ConGuiones);
					System.err.println("Incorrecto ! Perdiste una vida...");
				}
				else {
					System.out.println(palabraJugador2ConGuiones);
					System.out.println("Correcto !");
				}
				if (Arrays.equals(arrayPalabraJugador2, palabraJugador2ConGuiones)==true) {
					jugadorGanador=1;
				}
				if (cantidadDeVidasJugador1==0) {
					jugadorGanador=2;
				}
				turnoActual=2;
			}
			if (jugadorActual==2) {
				System.out.println("Ingrese la letra:");
				if (chequearLetraEnPalabra(jugadorActual,teclado.next().toUpperCase().charAt(0))==false) {
					cantidadDeVidasJugador2--;
					System.out.println(palabraJugador1ConGuiones);
					System.err.println("Incorrecto ! Perdiste una vida...");
				}
				else {
					System.out.println(palabraJugador1ConGuiones);
					System.out.println("Correcto !");
				}
				if (Arrays.equals(arrayPalabraJugador1, palabraJugador1ConGuiones)==true) {
					jugadorGanador=2;
				}
				if (cantidadDeVidasJugador2==0) {
					jugadorGanador=1;
				}
				turnoActual=1;
			}
			
		}

		private static void promptOpciones() {
			System.out.println("Elija una opcion:");
			System.out.println("1.Ingresar Letra");
			System.out.println("2.Arriesgar");
		}

		private static void mostrarVidasYPalabraConGuiones(int jugador) {
			int jugadorActual=jugador;
			if (jugadorActual==1) {
				System.out.println("*************************************");
				System.out.println("Es el turno de "+nombreJugador1.toUpperCase());
				System.err.println("Tenes "+cantidadDeVidasJugador1+" vidas.");
				System.out.println("*************************************");
				System.out.println("La palabra a adivinar:");
				System.out.println("");
				System.out.println(palabraJugador2ConGuiones);
				System.out.println("");
				System.out.println("*************************************");
			}
			if (jugadorActual==2) {
				System.out.println("*************************************");
				System.out.println("Es el turno de "+nombreJugador2.toUpperCase());
				System.err.println("Tenes "+cantidadDeVidasJugador2+" vidas.");
				System.out.println("*************************************");
				System.out.println("La palabra a adivinar:");
				System.out.println("");
				System.out.println(palabraJugador1ConGuiones);
				System.out.println("");
				System.out.println("*************************************");
			}
			
		}

		private static boolean chequearLetraEnPalabra(int turnoActual,char letra) {
			boolean acerto=false;
			if (turnoActual==1) {
				for (int i = 0; i < arrayPalabraJugador2.length; i++) {
					if (arrayPalabraJugador2[i]==letra) {
						palabraJugador2ConGuiones[i]=letra;
						acerto=true;
					}
				}
			}
			if (turnoActual==2) {
				for (int i = 0; i < arrayPalabraJugador1.length; i++) {
					if (arrayPalabraJugador1[i]==letra) {
						palabraJugador1ConGuiones[i]=letra;
						acerto=true;
					}
				}
			}
			return acerto;
		}	

		
			
		
}
