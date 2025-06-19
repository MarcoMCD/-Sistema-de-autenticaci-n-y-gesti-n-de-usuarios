package service;

import java.util.HashMap;
import java.util.Map;

import model.Admin;
import model.Cliente;
import model.Invitado;
import model.Usuario;

public class Logica {
	
	Map<String, Usuario> usuarios = new HashMap<>();
	
	
	//REGISTRO DE UN ADMINISTRADOR
	public void registroAdministrador(String nombreUsuario, String contraseña, String codigoVerificacion, String correoRecuperacion) {
		if(!usuarios.containsKey(correoRecuperacion)) {
			usuarios.put(correoRecuperacion, new Admin(nombreUsuario, contraseña, codigoVerificacion, correoRecuperacion));
		}else {
			System.out.println("Correo en uso");
		}
	}
	
	
	//REGISTRO DE UN CLIENTE
	public void registroCliente(String nombreUsuario, String contraseña, String correoRecuperacion) {
		if(!usuarios.containsKey(correoRecuperacion)) {
			usuarios.put(correoRecuperacion, new Cliente(nombreUsuario, contraseña, correoRecuperacion));
		}else {
			System.out.println("Correo en uso");
		}
	}
	
	//REGISTRO DE UN INVITADO
	public void registroInvitado(String tiempoEspiracion, String comentarioReferencia) {
		if(!usuarios.containsKey(comentarioReferencia)) {
			usuarios.put(comentarioReferencia, new Invitado(tiempoEspiracion, comentarioReferencia));
		}else {
			System.out.println("Correo en uso");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void iniciarSesion(String contraseña, String nombreUsuario) {
		
	}

}
