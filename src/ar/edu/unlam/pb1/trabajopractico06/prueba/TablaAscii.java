package ar.edu.unlam.pb1.trabajopractico06.prueba;

public class TablaAscii {
	public static void main(String[] args) {
		char caracterInicial='0';
		String mensaje="";
		while (caracterInicial<='9') {
			mensaje=mensaje+((int)caracterInicial+"-"+caracterInicial+",");
			caracterInicial++;
		}
		System.out.println("Caracteres númericos:");
		System.out.println(mensaje);
		
		caracterInicial='a';
		mensaje="";
		while (caracterInicial<='z') {
			mensaje=mensaje+((int)caracterInicial+"-"+caracterInicial+",");
			caracterInicial++;
		}
		System.out.println("Letras minúsculas:");
		System.out.println(mensaje);
		
		caracterInicial='A';
		mensaje="";
		while (caracterInicial<='Z') {
			mensaje=mensaje+((int)caracterInicial+"-"+caracterInicial+",");
			caracterInicial++;
		}
		System.out.println("Letras mayúsculas:");
		System.out.println(mensaje);

		caracterInicial='!';
		mensaje="";
		while (caracterInicial<='/') {
			mensaje=mensaje+((int)caracterInicial+"-"+caracterInicial+",");
			caracterInicial++;
		}
		caracterInicial=':';
		while (caracterInicial<='@') {
			mensaje=mensaje+((int)caracterInicial+"-"+caracterInicial+",");
			caracterInicial++;
		}
		caracterInicial='[';
		while (caracterInicial<='`') {
			mensaje=mensaje+((int)caracterInicial+"-"+caracterInicial+",");
			caracterInicial++;
		}
		caracterInicial='{';
		while (caracterInicial<='~') {
			mensaje=mensaje+((int)caracterInicial+"-"+caracterInicial+",");
			caracterInicial++;
		}
		System.out.println("Caracteres Especiales:");
		System.out.println(mensaje);
	}
}
