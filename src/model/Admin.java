package model;

public class Admin extends Usuario implements RecuperacionContraseña{
	
	private String codigoVerificacion;
	private String correoRecuperacion;

	public Admin(String nombreUsuario, String contraseña, String codigoVerificacion, String correoRecuperacion) {
		super(nombreUsuario, contraseña);
		this.codigoVerificacion = codigoVerificacion;
		this.correoRecuperacion = correoRecuperacion;
	}

	@Override
	public void realizarAccion() {
		
	}

	public String getCodigoVerificacion() {
		return codigoVerificacion;
	}

	public void setCodigoVerificacion(String codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}
	
	public String getCorreoRecuperacion() {
		return correoRecuperacion;
	}

	public void setCorreoRecuperacion(String correoRecuperacion) {
		this.correoRecuperacion = correoRecuperacion;
	}

	@Override
	public String recuperarContraseña() {
		return null;
	}
	
	
}
