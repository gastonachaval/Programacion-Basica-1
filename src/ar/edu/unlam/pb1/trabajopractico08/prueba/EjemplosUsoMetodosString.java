package ar.edu.unlam.pb1.trabajopractico08.prueba;

import java.util.Scanner;

public class EjemplosUsoMetodosString {

	/* EJEMPLO 1: USO DEL METODO charAt()
	 * EL SIGUIENTE PROGRAMA RECIBE UNA PALABRA DE 10 CARACTERES, LA DEVUELVE
	 * Y LA MUESTRA AL REVES Y SIN SU PRIMER Y ULTIMA LETRA
	 */
	
	/*static Scanner teclado= new Scanner(System.in);
	static String cadena="";
	static String palabraInversa="";
	static char l8;
	static char l7;
	static char l6;
	static char l5;
	static char l4;
	static char l3;
	static char l2;
	static char l1;

	public static void main(String[] args) {
		System.out.println("Ingrese una palabra de 10 caracteres");
		for (int i = 0; i < 10; i++) {
			cadena=cadena+teclado.next().charAt(0);
		}
		System.out.println("La palabra ingresada es: "+cadena);
		l8=(cadena.charAt(8));
		l7=(cadena.charAt(7));
		l6=(cadena.charAt(6));
		l5=(cadena.charAt(5));
		l4=(cadena.charAt(4));
		l3=(cadena.charAt(3));
		l2=(cadena.charAt(2));
		l1=(cadena.charAt(1));
		palabraInversa=palabraInversa+l8+l7+l6+l5+l4+l3+l2+l1;
		System.out.println("La palabra ingresada al reves y sin la primera y ultima letra es:");
		System.out.println(palabraInversa);
	}*/
	
	/*EJEMPLO 2: USO DEL METODO equalsIgnoreCase()
	 * EL SIGUIENTE PROGRAMA TE DESAFIA A ADIVINAR UNA PALABRA
	 * DE 4 CARACTERES, COMPARANDO LA PALABRA INGRESADA CON LA 
	 * PALABRA ALMACENADA EN LA VARIABLE CON EL METODO equalsIgnoreCase()
	 */
		
		/*static Scanner teclado= new Scanner(System.in);
		static String palabraMagica="coco";
		static String palabraIngresada="";
		public static void main(String[] args) {
			System.out.println("Adivine la palabra magica !");
			System.out.println("Solo tienes 3 intentos");
			for (int i = 0; i < 3; i++) {
				palabraIngresada=teclado.next();
				if (palabraIngresada.equalsIgnoreCase(palabraMagica)) {
					System.out.println("Bingo !");
					break;

				}
			}
			if (palabraMagica.equals(palabraIngresada)==false) {
				System.out.println("Loser");
			}
		}*/
	
	/*EJEMPLO 3: USO DEL METODO equals()
	 * EL SIGUIENTE PROGRAMA VALIDA UNA CONTRASEÑA PARA DEVOLVER UN MENSAJE
	 */
	/*static Scanner teclado= new Scanner(System.in);
	static final String CONTRASENA_ALMACENADA="Matrix";
	static String contrasenaIngresada;
	
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Password?");
		
		while (CONTRASENA_ALMACENADA.equals(contrasenaIngresada=teclado.next())==false) {
			System.out.println("wrong...try again");
		}
		System.out.println("red pill ?");	
}*/
}
