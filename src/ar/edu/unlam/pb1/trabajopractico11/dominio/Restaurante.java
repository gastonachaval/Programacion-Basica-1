	package ar.edu.unlam.pb1.trabajopractico11.dominio;

import java.util.Scanner;

public class Restaurante {
	private Mesa[][] mesas;
	private OrdenDeRestaurant[] menu;
	private Mozo[] mozos;
	private boolean sePudoAgregarMozo;
	private boolean estaElMozoRepetido;
	private double facturacionDiariaRestaurant;

	public Restaurante() {
		this.mesas = new Mesa[2][2];
		this.menu = new OrdenDeRestaurant[30];
		this.mozos = new Mozo[10];
		facturacionDiariaRestaurant = 0.0;
		sePudoAgregarMozo = false;
		estaElMozoRepetido = false;
		prepararTodosLosVectores();
		cargarOrdenesEnElMenu();
	}

	static Scanner teclado = new Scanner(System.in);

	private void prepararTodosLosVectores() {
		limpiarVector(mesas);
		limpiarVector(mozos);
		limpiarVector(menu);
	}

	private void limpiarVector(Mozo[] vectorALimpiar) {
		Mozo vacio = new Mozo("Vacio");
		for (int i = 0; i < vectorALimpiar.length; i++) {
			vectorALimpiar[i] = vacio;
		}
	}

	private void limpiarVector(Mesa[][] vectorALimpiar) {
		for (int i = 0; i < vectorALimpiar.length; i++) {
			for (int j = 0; j < vectorALimpiar[i].length; j++) {
				vectorALimpiar[i][j] = new Mesa();
			}
		}
	}

	private void limpiarVector(OrdenDeRestaurant[] vectorALimpiar) {
		for (int i = 0; i < vectorALimpiar.length; i++) {
			vectorALimpiar[i] = new OrdenDeRestaurant();
		}
	}

	private void cargarOrdenesEnElMenu() {
		menu[0] = new OrdenDeRestaurant("Pancho", 30.0);
		menu[1] = new OrdenDeRestaurant("Burger", 100.0);
		menu[2] = new OrdenDeRestaurant("Coca Cola", 50.0);
		menu[3] = new OrdenDeRestaurant("Sprite", 50.0);
		menu[4] = new OrdenDeRestaurant("Fanta", 50.0);
		menu[5] = new OrdenDeRestaurant("Quatro Pomelo", 50.0);
		menu[6] = new OrdenDeRestaurant("Papas Fritas", 50.0);
		menu[7] = new OrdenDeRestaurant("Tacos", 80.0);
		menu[8] = new OrdenDeRestaurant("Helado", 50.0);
	}

	public void darAltaAUnMozo(String nombreDelMozoNuevo) {
		sePudoAgregarMozo = false;
		estaElMozoRepetido = false;
		mozoRepetido(nombreDelMozoNuevo);
		if (estaElMozoRepetido == false) {
			for (int i = 0; i < mozos.length; i++) {
				if (mozos[i].getNombre().equals("Vacio") == true) {
					mozos[i] = new Mozo(nombreDelMozoNuevo);
					sePudoAgregarMozo = true;
					break;
				}
			}
		}

	}

	public boolean isSePudoAgregarMozo() {
		return sePudoAgregarMozo;
	}

	public void mozoRepetido(String nombreDelMozoNuevo) {
		for (int i = 0; i < mozos.length; i++) {
			if (mozos[i].getNombre().equalsIgnoreCase(nombreDelMozoNuevo) == true) {
				estaElMozoRepetido = true;
				break;
			}
		}
	}

	public String recorrerMesasYChequarSiEstanOcupadas() {
		String mesasLibres = "";
		final int guionesAlFinal = 3;
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j].isEstaOcupada() == false) {
					mesasLibres += mesas[i][j].getNumeroDeMesa() + "(Para " + mesas[i][j].getCapacidad() + " personas)"
							+ "---";
				}
			}
		}
		return "Las mesas disponibles son: " + mesasLibres.substring(0, mesasLibres.length() - guionesAlFinal);
	}

	public void asignarMozoALaMesa(int numeroDeMozo, int mesa) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas[i].length; j++) {
				if (mesas[i][j].getNumeroDeMesa() == mesa) {
					mesas[i][j].setNumeroDeMozoAtendiendoLaMesa(numeroDeMozo);
					return;
				}

			}
		}
	}

	public boolean estaDisponibleLaMesa(int numeroDeMesa) {
		boolean estaDisponible = true;
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j].getNumeroDeMesa() == numeroDeMesa) {
					if (mesas[i][j].isEstaOcupada() == true) {
						estaDisponible = false;
						break;
					} else {
						break;
					}
				}
			}
		}
		return estaDisponible;
	}

	public boolean sentarComensales(int numeroDeMesa, int cantidadDeComensales) {
		boolean sePudoSentarComensales = false;
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j].getNumeroDeMesa() == numeroDeMesa) {
					if (cantidadDeComensales <= mesas[i][j].getCapacidad()) {
						mesas[i][j].ocuparODesocuparMesa();
						sePudoSentarComensales = true;
					}
					break;

				}
			}
		}
		return sePudoSentarComensales;
	}

	public String mostrarCarta() {
		String cartaCompleta = "";
		final int guionesAlFinal = 3;
		for (int i = 0; i < menu.length; i++) {
			if (menu[i] != null) {
				cartaCompleta += menu[i].toString() + "---";
			}

		}
		return cartaCompleta.substring(0, cartaCompleta.length() - guionesAlFinal);
	}

	public String mostrarStaff() {
		String staffCompleto = "";
		final int guionesAlFinal = 3;
		for (int i = 0; i < mozos.length; i++) {
			if (mozos[i].getNombre() != "Vacio") {
				break;
			} else {
				return "No hay ningun mozo cargado en el sistema";
			}
		}
		for (int r = 0; r < mozos.length; r++) {
			if (mozos[r].getNombre() != "Vacio") {
				staffCompleto += mozos[r].toString() + "---";
			}

		}
		return staffCompleto.substring(0, staffCompleto.length() - guionesAlFinal);
	}

	public boolean chequearQueHayaMozosDisponibles() {
		boolean mozosDisponibles = false;
		for (int i = 0; i < mozos.length; i++) {
			if (mozos[i].getNombre() != "Vacio") {
				mozosDisponibles = true;
				break;
			}
		}
		return mozosDisponibles;
	}

	public void cargarPedidoAMesa(int numeroDeMesa) {
		String yesOrNo;
		do {
			System.out.println("Ingrese el codigo de comanda");
			int comanda = teclado.nextInt();
			asignarComandaALaMesa(comanda, numeroDeMesa);
			System.out.println("***********************************");
			System.out.println("Desea cargar otra comanda? Y/N");
			yesOrNo = teclado.next();

		} while (yesOrNo.charAt(0) == 'Y' || yesOrNo.charAt(0) == 'y');
	}

	public void asignarComandaALaMesa(int numeroDeOrden, int numeroDeMesa) {
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].getNumeroDeOrden() == numeroDeOrden) {
				for (int r = 0; r < mesas.length; r++) {
					for (int j = 0; j < mesas.length; j++) {
						if (mesas[r][j].getNumeroDeMesa() == numeroDeMesa) {
							mesas[r][j].buscarPosicionEnElArrayParaCargarComanda(menu[i]);
							menu[i].subirContadorDePedidosDeLaComanda();
							return;
						}
					}
				}
			}
		}

	}

	public String getEstadoMesa(int numeroDeMesa) {
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j].getNumeroDeMesa() == numeroDeMesa) {
					return mesas[i][j].toString();
				}
			}

		}
		return "No existe esa mesa pa";
	}

	public boolean mesaOcupada(int numeroDeMesa) {
		boolean mesaOcupada = false;
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j].isEstaOcupada() == true) {
					mesaOcupada = true;
					break;
				}
			}
		}
		return mesaOcupada;
	}

	public double cerrarMesa(int numeroDeMesa) {
		double importeTotal = 0.0;
		for (int i = 0; i < mesas.length; i++) {
			for (int j = 0; j < mesas.length; j++) {
				if (mesas[i][j].getNumeroDeMesa() == numeroDeMesa) {
					mesas[i][j].ocuparODesocuparMesa();
					importeTotal = mesas[i][j].getCuantoConsumieron();
					facturacionDiariaRestaurant += importeTotal;
					for (int r = 0; r < mozos.length; r++) {
						if (mozos[r].getNumeroEmpleado() == mesas[i][j].getNumeroDeMozoAtendiendoLaMesa()) {
							mozos[r].sumarPlatitaAFacturacionDiariaDelMozo(importeTotal);
							break;
						}
					}
					break;
				}
			}
		}
		return importeTotal;
	}

	public double getFacturacionDiariaRestaurant() {
		return facturacionDiariaRestaurant;
	}

	public void rankearMozos() {
		Mozo temporal = new Mozo();
		for (int i = 1; i < mozos.length; i++) {
			for (int j = 0; j < mozos.length; j++) {
				if (mozos[j + 1].getFacturacionDiaria() > mozos[j].getFacturacionDiaria()) {
					temporal = mozos[j];
					mozos[j] = mozos[j + 1];
					mozos[j + 1] = temporal;
				}
			}
		}
	}

	public void rankearComandas() {
		OrdenDeRestaurant temporal = new OrdenDeRestaurant();
		for (int i = 1; i < menu.length; i++) {
			for (int j = 0; j < menu.length - 1; j++) {
				if (menu[j + 1].getCantidadDePedidosDiario() > menu[j].getCantidadDePedidosDiario())
					;
				temporal = menu[j];
				menu[j] = menu[j + 1];
				menu[j + 1] = temporal;

			}
		}
	}

	public void mostrarRankingDeComandas() {
		byte numeroDelRanking = 1;
		for (int i = 0; i < menu.length; i++) {
			if (menu[i].getNumeroDeOrden() != 0) {
				System.out.println(numeroDelRanking + "." + menu[i].getNombre() + "("
						+ menu[i].getCantidadDePedidosDiario() + ")");
				numeroDelRanking++;
			}
		}

	}

	public void mostrarRankingDeMozos() {
		byte numeroDelRanking = 1;
		for (int i = 0; i < mozos.length; i++) {
			if (mozos[i].getNumeroEmpleado() != 0) {
				System.out.println(
						numeroDelRanking + "." + mozos[i].getNombre() + "($ " + mozos[i].getFacturacionDiaria() + ")");
				numeroDelRanking++;
			}
		}

	}
}