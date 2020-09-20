package ar.edu.unlam.pb1.trabajopractico11.dominio;

public class OrdenDeRestaurant {

	private static int contadorOrdenesDeRestaurant = 0;
	private String nombre = "";
	private double precio;
	private int numeroDeOrden;
	private int cantidadDePedidosDiario;

	public OrdenDeRestaurant(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.numeroDeOrden = ++contadorOrdenesDeRestaurant;
		this.cantidadDePedidosDiario = 0;
	}

	public OrdenDeRestaurant() {
		this.nombre = "Vacio";
		this.precio = 0.0;
		this.numeroDeOrden = 0;
		this.cantidadDePedidosDiario = 0;
	}

	public String toString() {
		return numeroDeOrden + "-" + nombre + "-" + precio;
	}

	public int getNumeroDeOrden() {
		return numeroDeOrden;
	}

	public double getPrecio() {
		return precio;
	}

	public void subirContadorDePedidosDeLaComanda() {
		cantidadDePedidosDiario++;

	}

	public int getCantidadDePedidosDiario() {
		return cantidadDePedidosDiario;
	}

	public String getNombre() {
		return nombre;
	}
}