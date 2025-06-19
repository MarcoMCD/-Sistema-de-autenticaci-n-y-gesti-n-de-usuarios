package backend;

public class Admin extends Usuario{
	
	private String codigoVerificacion;

	public Admin(String nombreUsuario, String contraseña, String correoElectronico, String codigoVerificacion) {
		super(nombreUsuario, contraseña);
		this.codigoVerificacion = codigoVerificacion;
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
	
	
}
