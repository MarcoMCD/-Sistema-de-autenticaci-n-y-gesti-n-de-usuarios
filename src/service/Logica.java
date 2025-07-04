package service;

import java.util.HashMap;
import java.util.Map;

import model.Admin;
import model.Cliente;
import model.Invitado;
import model.Usuario;

public class Logica {
	
	private Map<String, Usuario> usuarios = new HashMap<>();
	
	
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
		if(!usuarios.containsKey(correoRecuperacion)) { //Verificamos que no este repetido el correo
			usuarios.put(correoRecuperacion, new Cliente(nombreUsuario, contraseña, correoRecuperacion));
		}else {
			System.out.println("Correo en uso");
		}
	}
	
	//REGISTRO DE UN INVITADO
	public void registroInvitado(String tiempoExpiracion, String comentarioReferencia) {
		if(!usuarios.containsKey(comentarioReferencia)) {
			usuarios.put(comentarioReferencia, new Invitado(tiempoExpiracion, comentarioReferencia));
		}else {
			System.out.println("Correo en uso.");
		}
	}
	
	
	//INICIAR SESION 
	public boolean iniciarSesiones(String nombreUsuario, String contraseña) {
		for(Usuario usuario : usuarios.values()) {
			if(usuario.getNombreUsuario().equalsIgnoreCase(nombreUsuario) && usuario.getContraseña().equals(contraseña)) {
				return true;
			}
		}
		return false;
	}
	
	//VER LISTA DE USUARIOS
	public String listaUsuarios() {
				
		StringBuilder listaUsuarios = new StringBuilder();
		
		if(usuarios.isEmpty()) {
			return "No hay usuarios registrados";
		}
		
		for(Map.Entry<String, Usuario> entrada : usuarios.entrySet()) {
			
			String nombre = entrada.getValue().getNombreUsuario();
			String contraseña = entrada.getValue().getContraseña();
			
			listaUsuarios.append("Usuario: ").append(nombre).append("\n");
			listaUsuarios.append("Contraseña: ").append(contraseña).append("\n");
			listaUsuarios.append("----------------------------").append("\n");
		}
		
		return listaUsuarios.toString();
	}
	

}
