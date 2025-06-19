package backend;

public abstract class Usuario {
	
	protected String nombreUsuario;
	protected String contraseña;
	protected String correoElectronico;
	
	public Usuario(String nombreUsuario, String contraseña, String correoElectronico) {
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.correoElectronico = correoElectronico;
	}
	
	public abstract void realizarAccion();
	

}
