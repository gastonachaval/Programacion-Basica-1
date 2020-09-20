package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class Mesa {
	private static int contadorNumerosDeMesa;
	private int numeroDeMesa;
	private int capacidad;
	private boolean estaOcupada;
	private double cuantoConsumieron;
	private int numeroDeMozoAtendiendoLaMesa;
	private OrdenDeRestaurant[] pedidosCargadosEnLaMesa;

	public Mesa() {
		this.numeroDeMesa = ++contadorNumerosDeMesa;
		capacidad = 2;
		estaOcupada = false;
		cuantoConsumieron = 0.0;
		this.pedidosCargadosEnLaMesa = new OrdenDeRestaurant[30];
		llenarVectorConOrdenesVacias(pedidosCargadosEnLaMesa);

	}

	public String toString() {
		if (estaOcupada == false) {
			return "La mesa esta libre";
		} else {
			return "La mesa esta ocupada y su consumicion actual es de: " + cuantoConsumieron;
		}
	}

	public boolean isEstaOcupada() {
		return estaOcupada;
	}

	public int getNumeroDeMesa() {
		return numeroDeMesa;
	}

	public void setNumeroDeMozoAtendiendoLaMesa(int numeroDeMozoAtendiendoLaMesa) {
		this.numeroDeMozoAtendiendoLaMesa = numeroDeMozoAtendiendoLaMesa;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void ocuparODesocuparMesa() {
		if (estaOcupada == false) {
			estaOcupada = true;
		} else {
			estaOcupada = false;
		}
	}

	public void buscarPosicionEnElArrayParaCargarComanda(OrdenDeRestaurant comandaACargar) {
		for (int i = 0; i < pedidosCargadosEnLaMesa.length; i++) {
			if (pedidosCargadosEnLaMesa[i].getNumeroDeOrden() == 0) {
				pedidosCargadosEnLaMesa[i] = comandaACargar;
				cuantoConsumieron += comandaACargar.getPrecio();
				break;
			}
		}
	}

	private void llenarVectorConOrdenesVacias(OrdenDeRestaurant[] vectorALimpiar) {
		for (int i = 0; i < vectorALimpiar.length; i++) {
			vectorALimpiar[i] = new OrdenDeRestaurant();
		}
	}

	public double getCuantoConsumieron() {
		return cuantoConsumieron;
	}

	public int getNumeroDeMozoAtendiendoLaMesa() {
		return numeroDeMozoAtendiendoLaMesa;
	}
}