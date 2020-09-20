package ar.edu.unlam.pb1.trabajopractico10.dominio;

public class SistemaAulaScarlet {
	private int filas = 4;
	private int columnas = 4;
	
	private AlumnoScarlet aula[][];
	private int cantidadActualEscritorios;
	private int posicionFila;
	private int posicionColumna;
	
	private int cantidadDeAlumnosPresentes;
	
	
	//Constructor
	public SistemaAulaScarlet() {
		aula = new AlumnoScarlet[filas][columnas];
		cantidadActualEscritorios = 0;
		posicionFila = 0;
		posicionColumna = 0;
	}
	
	
	//Para consultar si un determinado escritorio esta ocupado
	public  boolean estadoDelEscritorio(int fila, int columna) {
		boolean estaOcupado = false;
		
			if(aula[fila][columna]!=null) {
				estaOcupado = true;
		}
		return estaOcupado;
	}
	
	public boolean ingresarOcupante(String nombre) 
	{
		
		for(int i=0;i<filas;i++)
		{
			for(int j=0;j<columnas;j++)
			{
				if(!estadoDelEscritorio(i,j))
				{
					aula[i][j]= new AlumnoScarlet(nombre);
					cantidadDeAlumnosPresentes++;
					return true;
				}
			}
		}
			
		return false;
	}
	
	//Para ingresar un ocupante en un determinado escritorio en caso de estar vacio
	public boolean ingresarEnEscritorio(int fila, int columna,String nombre) {
		boolean ingresoExitoso = false;
		if(estadoDelEscritorio(fila, columna)==false) {
			aula[fila][columna]=new AlumnoScarlet(nombre);
			
			cantidadDeAlumnosPresentes++;
			ingresoExitoso = true;
		}
		return ingresoExitoso;
	}
	
	public void getAula() {
		
		System.out.println("........................");
		System.out.println("Nota: los escritorios ocupados contienen un asterisco");
		for(int i=0; i<filas; i++) {
			System.out.println("\n");
			
			for(int j=0; j<columnas; j++) {
				System.out.print(aula[i][j] +"  |  " );
			}
		}
		System.out.println("\n........................");
	}
	
	public int getCantidadDeAlumnos(){
		return cantidadDeAlumnosPresentes;
	}
}
