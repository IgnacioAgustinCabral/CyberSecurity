package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Alertable;
import ar.edu.unlam.pb2.interfaces.Monitoreable;
import ar.edu.unlam.pb2.interfaces.Rechazable;

public class Extraccion extends Transaccion implements Rechazable{
	
	private Integer numero;
	public Extraccion(Cliente cliente, Dispositivo pc) {
		super(cliente, pc);
	}

}
