package ar.edu.unlam.pb1.trabajopractico09.dominio;

public class Usuario {
	private String nombre;
	private String contrasena;
	private boolean estaLogueado;
	
	
	public Usuario() {
		this.nombre="Vacio";
		this.contrasena="Vacio";
	}
	
	
	public Usuario (String nombre,String contrasena) {
		this.nombre=nombre;
		this.contrasena=contrasena;
	}

	public String getNombre() {
		return nombre;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setEstaLogueado(boolean estaLogueado) {
		this.estaLogueado = estaLogueado;
	}
	
}
