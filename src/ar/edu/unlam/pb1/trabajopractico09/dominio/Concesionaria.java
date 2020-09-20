package ar.edu.unlam.pb1.trabajopractico09.dominio;

public class Concesionaria {

	private Coche[] flota;

	public Concesionaria() {
		flota = new Coche[127];
		for (int i = 0; i < flota.length; i++) {
			flota[i] = new Coche();
		}
	}

	public void agregarCoche(Coche cocheAAgregar) {
		for (int i = 0; i < flota.length; i++) {
			if (flota[i].getMarca().equalsIgnoreCase("Vacio") == true) {
				flota[i] = cocheAAgregar;
				flota[i].setCodigoDelCoche((byte) i);
				break;
			}
		}
	}

	public String getFlota() {
		String listadoDeVehiculos = "No hay ningun vehiculo cargado";
		for (int i = 0; i < flota.length; i++) {
			if (flota[i].getMarca().equalsIgnoreCase("Vacio") == false) {
				listadoDeVehiculos = "";
				break;
			}
		}
		for (int j = 0; j < flota.length; j++) {
			if (flota[j].getMarca().equalsIgnoreCase("Vacio") == false) {
				listadoDeVehiculos += flota[j].toString() + "\n";
			}
		}
		return listadoDeVehiculos;
	}

	public Coche getVehiculoPorCodigo(byte codigoDelVehiculo) {		
		Coche vehiculoADevolver=null;
		if (flota[codigoDelVehiculo].getMarca().equalsIgnoreCase("Vacio")==false) {
			vehiculoADevolver=flota[codigoDelVehiculo];
		}
		
		return vehiculoADevolver;
	}

	public String buscarVehiculosEnUnRangoDePrecio(int precioMinimo, int precioMaximo) {
		String listaDeVehiculosEnUnRangoDePrecio="";
		for (int i = 0; i < flota.length; i++) {
			if (flota[i].getPrecio()>=precioMinimo&&flota[i].getPrecio()<=precioMaximo) {
				listaDeVehiculosEnUnRangoDePrecio+=flota[i].toString()+"\n";
			}
		}
		if (listaDeVehiculosEnUnRangoDePrecio.equalsIgnoreCase("")==true) {
			listaDeVehiculosEnUnRangoDePrecio="No hay ningun vehiculo en ese rango de precios";
		}
		return listaDeVehiculosEnUnRangoDePrecio;
		
	}
	
	public String buscarVehiculosPorMarca(String marcaBuscada) {
		String listaDeVehiculosDeUnaMarca="";
		for (int i = 0; i < flota.length; i++) {
			if (flota[i].getMarca().equalsIgnoreCase(marcaBuscada)==true) {
				listaDeVehiculosDeUnaMarca+=flota[i].toString()+"\n";
			}
		}
		if (listaDeVehiculosDeUnaMarca.equalsIgnoreCase("")==true) {
			listaDeVehiculosDeUnaMarca="No hay ningun vehiculo de esa marca";
		}
		return listaDeVehiculosDeUnaMarca;
		
	}
	
	public String buscarVehiculosPorModelo(String modeloBuscado) {
		String listaDeVehiculosMismoModelo="";
		for (int i = 0; i < flota.length; i++) {
			if (flota[i].getModelo().equalsIgnoreCase(modeloBuscado)==true) {
				listaDeVehiculosMismoModelo+=flota[i].toString()+"\n";
			}
		}
		if (listaDeVehiculosMismoModelo.equalsIgnoreCase("")==true) {
			listaDeVehiculosMismoModelo="No hay ningun vehiculo de ese modelo";
		}
		return listaDeVehiculosMismoModelo;
		
	}



}
