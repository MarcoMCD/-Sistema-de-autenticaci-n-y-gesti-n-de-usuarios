package model;

public class Cliente extends Usuario{
	
	private String correoRecuperacion;
	private String fechaRegistro;

	public Cliente(String nombreUsuario, String contraseña, String correoRecuperacion, String fechaRegistro) {
		super(nombreUsuario, contraseña);
		this.correoRecuperacion = correoRecuperacion;
		this.fechaRegistro = fechaRegistro;
	}
	
	
	public String getCorreoRecuperacion() {
		return correoRecuperacion;
	}


	public void setCorreoRecuperacion(String correoRecuperacion) {
		this.correoRecuperacion = correoRecuperacion;
	}

	
	public String getFechaRegistro() {
		return fechaRegistro;
	}

	
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	@Override
	public void realizarAccion() {
		
	}

}
