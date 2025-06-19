package model;

import java.time.LocalDate;

public class Cliente extends Usuario implements RecuperacionContraseña{
	
	private String correoRecuperacion;
	private LocalDate fechaRegistro;

	public Cliente(String nombreUsuario, String contraseña, String correoRecuperacion) {
		super(nombreUsuario, contraseña);
		this.correoRecuperacion = correoRecuperacion;
		this.fechaRegistro = LocalDate.now();
	}
	
	
	public String getCorreoRecuperacion() {
		return correoRecuperacion;
	}


	public void setCorreoRecuperacion(String correoRecuperacion) {
		this.correoRecuperacion = correoRecuperacion;
	}
	

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	@Override
	public void realizarAccion() {
		
	}


	@Override
	public String recuperarContraseña() {
		return null;
	}



}
