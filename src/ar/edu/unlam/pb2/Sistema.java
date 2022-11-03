package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private Transaccion transaccion;
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();
	
	public Sistema() {
	}

	public Transaccion getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(Transaccion transaccion) {
		this.transaccion = transaccion;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public void agregarAListaDeTransacciones(Transaccion extraccion) {
		if(extraccion.monitorear())
	}
	
	
	

}
