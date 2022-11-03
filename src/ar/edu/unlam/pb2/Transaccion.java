package ar.edu.unlam.pb2;

import ar.edu.unlam.pb2.interfaces.Monitoreable;

public class Transaccion implements Monitoreable {
	
	private Cliente cliente;
	private Dispositivo pc;
	private Integer score;

	public Transaccion(Cliente cliente, Dispositivo pc) {
		this.cliente = cliente;
		this.pc = pc;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Dispositivo getPc() {
		return pc;
	}

	public void setPc(Dispositivo pc) {
		this.pc = pc;
	}
	

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public Boolean monitorear() {
		return true;
		
	}

}
