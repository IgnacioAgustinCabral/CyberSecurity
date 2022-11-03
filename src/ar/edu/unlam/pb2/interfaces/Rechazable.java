package ar.edu.unlam.pb2.interfaces;

import ar.edu.unlam.pb2.excepciones.FraudeException;

public interface Rechazable {
	
	public Boolean monitorear() throws FraudeException;

}
