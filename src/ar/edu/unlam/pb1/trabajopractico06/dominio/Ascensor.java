package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Ascensor {

		int PISO_MAXIMO;
	    int PISO_MINIMO;
	    double PESO_MAXIMO;
	    int CAPACIDAD_MAXIMA;
	    boolean puertaAbierta;
	    boolean sobrecarga;
	    int pisoActual;
	    double pesoActual;
	    int capacidadActual;

	    
	    
	    public Ascensor(int pisoActual, int PISO_MAXIMO, int PISO_MINIMO) {
	        this.pisoActual = pisoActual;
	        this.PISO_MAXIMO = PISO_MAXIMO;
	        this.PISO_MINIMO = PISO_MINIMO;
	    }
	
	    
	    
	    public void subir() {
	        if (this.pisoActual <= PISO_MAXIMO) {
	            this.pisoActual++;
	        }
	    }
	    public void bajar() {
	        if (this.pisoActual >= PISO_MINIMO) {
	            this.pisoActual--;
	        }
	    }

	    public int getPisoActual() {
	        return pisoActual;
	    }

	    public void setPisoActual(int pisoActual) {
	        this.pisoActual = pisoActual;
	    }
	    public void  irAlPiso(int pisoDeseado){
	    	if (pisoDeseado>=PISO_MINIMO&&pisoDeseado<=PISO_MAXIMO) {
		    	if (pisoDeseado<pisoActual) {					
			    	while (pisoDeseado<pisoActual) {
						this.pisoActual--;			
					}
			    	}
			    	if (pisoDeseado>pisoActual) {
						while (pisoDeseado>pisoActual) {
							this.pisoActual++;
						}
					}
			}
	    }
}

