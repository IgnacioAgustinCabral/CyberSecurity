package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ar.edu.unlam.pb2.interfaces.Denunciable;

public class Sistema {
	
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();
	private Set<Denunciable> listaNegra;
	
	public Sistema() {
	}

	public Set<Denunciable> getListaNegra() {
		return listaNegra;
	}

	public void setListaNegra(Set<Denunciable> listaNegra) {
		this.listaNegra = listaNegra;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public Boolean agregarAListaDeTransacciones(Transaccion extraccion) {
		transacciones.add(extraccion);
		return extraccion.monitorear(listaNegra);
	}
	
	
	

}
