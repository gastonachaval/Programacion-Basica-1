package ar.edu.unlam.pb1.trabajopractico06.dominio;

public class Destornillador {
	
	
	private final char TIPO_DE_CABEZA;
	
	public Destornillador(char tipoDeCabeza) {
		this.TIPO_DE_CABEZA=tipoDeCabeza;
	}
	
	public void desatornillar(Tornillo tornillo) {
		if (this.TIPO_DE_CABEZA==tornillo.getTIPO_DE_CABEZA()) {
			while (tornillo.getPosicionActual()>0) {
				tornillo.girar('A');
			}
		}
	}
	public void atornillar(Tornillo tornillo) {
		if (this.TIPO_DE_CABEZA==tornillo.getTIPO_DE_CABEZA()) {
			while (tornillo.getPosicionActual()<tornillo.getCANTIDAD_DE_ROSCA()) {
				tornillo.girar('H');
			}
		}
	}
	public void desatornillar(Tornillo tornillo,Tarugo tarugo) {
		if (this.TIPO_DE_CABEZA==tornillo.getTIPO_DE_CABEZA()) {
			while (tornillo.getPosicionActual()>0) {
				tornillo.girar('A');
			}
		}
	}
	public void atornillar(Tornillo tornillo,Tarugo tarugo) {
		if (this.TIPO_DE_CABEZA==tornillo.getTIPO_DE_CABEZA()) {
			while (tornillo.getPosicionActual()<tarugo.getLONGITUD()) {
				tornillo.girar('H');
			}
		}
	}
}
