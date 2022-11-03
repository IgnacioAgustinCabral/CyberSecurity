package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.excepciones.FraudeException;
import ar.edu.unlam.pb2.interfaces.Alertable;
import ar.edu.unlam.pb2.interfaces.Monitoreable;
import ar.edu.unlam.pb2.interfaces.Rechazable;

public class Extraccion extends Transaccion implements Rechazable {

	private Integer numero;

	public Extraccion(Cliente cliente, Dispositivo pc, Double monto) {
		super(cliente, pc, monto);
	}

	@Override
	public Boolean monitorear() throws FraudeException {
		// TODO Auto-generated method stub
		return null;
	}

}
