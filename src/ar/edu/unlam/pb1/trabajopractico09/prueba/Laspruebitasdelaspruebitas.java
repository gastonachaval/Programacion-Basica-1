package ar.edu.unlam.pb1.trabajopractico09.prueba;

public class Laspruebitasdelaspruebitas {
	
	static final int NUMERO_MINIMO=-1;
	static final int NUMERO_MAXIMO=36;
	
	
	public static void main(String[] args) {
		System.out.println("*************************************");
		System.out.println("Welcome to the rula");
		System.out.println("*************************************");
		System.out.println();
		System.out.println("Se lanza la rulaaaaa");
		comprobaciones(tirarLaRula());
		
	}


	private static void comprobaciones(int numeroQueSalio) {
		
		
	}


	private static int tirarLaRula() {
		return (int) (Math.random()*(NUMERO_MINIMO-NUMERO_MAXIMO)+NUMERO_MAXIMO);
	}
	
	
}
