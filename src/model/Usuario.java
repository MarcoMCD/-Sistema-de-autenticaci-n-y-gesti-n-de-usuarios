package model;

public abstract class Usuario {
	
	protected String nombreUsuario;
	protected String contraseña;
	
	public Usuario(String nombreUsuario, String contraseña) {
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
	}
	
	public Usuario(){}
	
	
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public abstract void realizarAccion();
	

}
