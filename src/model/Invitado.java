package model;

public class Invitado extends Usuario {
	
	private String tiempoEspiracion;
	private String comentarioReferencia;

	public Invitado(String tiempoEspiracion, String comentarioReferencia) {
		super();
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
