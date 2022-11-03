package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Denunciable;

public class Dispositivo implements Denunciable{
	private String sistemaOperativo;
	private String Ip;
	private String localidad;
	
	public Dispositivo(String sistemaOperativo, String ip, String localidad) {
		super();
		this.sistemaOperativo = sistemaOperativo;
		this.Ip = ip;
		this.localidad = localidad;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	

	
	
}
