package ar.edu.unlam.pb1.trabajopractico09.dominio;

public class Sistema {
	private String nombreSistema;
	private Usuario[] baseDeDatos;

	public Sistema(int cantidadDeUsuarios) {
		baseDeDatos = new Usuario[cantidadDeUsuarios];
		for (int i = 0; i < baseDeDatos.length; i++) {
			baseDeDatos[i] = new Usuario();
		}
	}

	public void setNombreSistema(String nombreSistema) {
		this.nombreSistema = nombreSistema;
	}

	public String getNombreSistema() {
		return nombreSistema;
	}

	public Usuario[] getBaseDeDatos() {
		return baseDeDatos;
	}

	public boolean meterUsuarioNuevoEnBaseDeDatos(Usuario usuarioACargar) {
		boolean sePudoCargarUsuario = false;
		for (int i = 0; i < baseDeDatos.length; i++) {
			if (baseDeDatos[i].getNombre() == "Vacio") {
				baseDeDatos[i] = usuarioACargar;
				sePudoCargarUsuario = true;
				break;
			}
		}
		return sePudoCargarUsuario;

	}

	public boolean buscarUsuario(String usuarioABuscar) {
		boolean seEncontroUsuario = false;
		for (int i = 0; i < baseDeDatos.length; i++) {
			if (baseDeDatos[i].getNombre().equalsIgnoreCase(usuarioABuscar) == true) {
				seEncontroUsuario = true;
				break;
			}
		}
		return seEncontroUsuario;
	}

	public boolean loguearConContrasena(String usuario, String contrasena) {
		boolean sePudoLoguear = false;
		int posicionUsuario = -1;
		for (int i = 0; i < baseDeDatos.length; i++) {
			if (baseDeDatos[i].getNombre().equalsIgnoreCase(usuario) == true) {
				posicionUsuario = i;
				break;
			}
			
		}
		if (baseDeDatos[posicionUsuario].getContrasena().equalsIgnoreCase(contrasena) == true) {
			baseDeDatos[posicionUsuario].setEstaLogueado(true);
			sePudoLoguear = true;
		}
		return sePudoLoguear;
	}

}
