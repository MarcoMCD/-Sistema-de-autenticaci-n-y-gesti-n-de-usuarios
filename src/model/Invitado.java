package model;

public class Invitado extends Usuario {
	
	private String tiempoEspiracion;
	private String comentarioReferencia;

	public Invitado(String nombreUsuario, String contraseña, String tiempoEspiracion, String comentarioReferencia) {
		super(nombreUsuario, contraseña);
		this.tiempoEspiracion = tiempoEspiracion;
		this.comentarioReferencia = comentarioReferencia;
	}
	
	

	public String getTiempoEspiracion() {
		return tiempoEspiracion;
	}


	public void setTiempoEspiracion(String tiempoEspiracion) {
		this.tiempoEspiracion = tiempoEspiracion;
	}


	public String getComentarioReferencia() {
		return comentarioReferencia;
	}


	public void setComentarioReferencia(String comentarioReferencia) {
		this.comentarioReferencia = comentarioReferencia;
	}


	@Override
	public void realizarAccion() {
	
		
	}

}
