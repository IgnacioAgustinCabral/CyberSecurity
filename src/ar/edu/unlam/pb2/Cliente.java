package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.interfaces.Denunciable;

public class Cliente implements Denunciable{
	private String CUIT;
	private String nombre;
//	private List<Transaccion> ultimasTransacciones = new ArrayList<Transaccion>();
	private Double saldo;
	
	public Cliente(String CUIT, String nombre,Double saldo) {
		super();
		this.CUIT = CUIT;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
//	public List<Transaccion> getUltimasTransacciones() {
//		return ultimasTransacciones;
//	}
//	public void setUltimasTransacciones(List<Transaccion> ultimasTransacciones) {
//		this.ultimasTransacciones = ultimasTransacciones;
//	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public String getCUIT() {
		return CUIT;
	}
	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
