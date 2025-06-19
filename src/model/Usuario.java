package model;

public abstract class Usuario {
	
	protected String nombreUsuario;
	protected String contraseña;
	
	public Usuario(String nombreUsuario, String contraseña) {
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
	}
	
	public abstract void realizarAccion();
	

}
