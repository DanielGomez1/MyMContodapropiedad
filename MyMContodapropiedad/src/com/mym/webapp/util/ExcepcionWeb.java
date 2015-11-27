package com.mym.webapp.util;

public class ExcepcionWeb extends Exception{

	private String mensajeUsuario;
	private String mensajeTecnico;
	private Exception exceptionOriginal;
	private String idException;
	public String getMensajeUsuario() {
		return mensajeUsuario;
	}
	public void setMensajeUsuario(String mensajeUsuario) {
		this.mensajeUsuario = mensajeUsuario;
	}
	public String getMensajeTecnico() {
		return mensajeTecnico;
	}
	public void setMensajeTecnico(String mensajeTecnico) {
		this.mensajeTecnico = mensajeTecnico;
	}
	public Exception getExceptionOriginal() {
		return exceptionOriginal;
	}
	public void setExceptionOriginal(Exception exceptionOriginal) {
		this.exceptionOriginal = exceptionOriginal;
	}
	public String getIdException() {
		return idException;
	}
	public void setIdException(String idException) {
		this.idException = idException;
	}
	
	
}
