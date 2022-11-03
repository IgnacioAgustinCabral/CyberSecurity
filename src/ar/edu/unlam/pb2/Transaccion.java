package ar.edu.unlam.pb2;

import java.util.Set;

import ar.edu.unlam.pb2.interfaces.Denunciable;
import ar.edu.unlam.pb2.interfaces.Monitoreable;

public class Transaccion implements Monitoreable {

	private Cliente cliente;
	private Dispositivo dispositivo;
	private Double monto;

	public Transaccion(Cliente cliente, Dispositivo dispositivo, Double monto) {
		this.cliente = cliente;
		this.dispositivo = dispositivo;
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	@Override
	public Boolean monitorear(Set<Denunciable> lista) {
		Integer score = 0;
		if (lista.contains(this.getCliente().getCUIT())) {
			score += 80;
		}
		if (lista.contains(this.getDispositivo().getIp())) {
			score += 80;
		}

		if (this.getMonto() == this.getCliente().getSaldo()) {
			score += 40;
		}
		
		if(score>=80) {
			return Boolean.FALSE;
		} else {
			return Boolean.TRUE;
		}
		

	}

}
