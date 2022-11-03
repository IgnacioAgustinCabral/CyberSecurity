package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyberSecurityTest {

	@Test
	public void queSePuedaCrearUnCliente() {
		String CUIT = "21-40123321-3";
		String nombre = "Pedro";
		Cliente cliente = new Cliente(CUIT,nombre);
		
		assertNotNull(cliente);
	}
	
	@Test
	public void queSePuedaCrearUnDispositivo() {
		String SO = "Windows";
		String IP = "190.0.0.0";
		String localidad = "San Justo";
		String IMEI = "1234";
		Biometria registro = Biometria.HUELLA;
		Dispositivo pc = new PC(SO,IP,localidad);
		Dispositivo movil = new Movil(SO,IP,localidad,IMEI,registro);
		
		assertNotNull(pc);
		assertNotNull(movil);
	}
	
	@Test
	public void queSePuedaMonitorearUnaExtraccion() {
		
		///Cliente
		String CUIT = "21-40123321-3";
		String nombre = "Pedro";
		Double saldo = 1550.25;
		Cliente cliente = new Cliente(CUIT,nombre,saldo);
		
		///Dispositivo
		String SO = "Windows";
		String IP = "190.0.0.0";
		String localidad = "San Justo";
		Dispositivo pc = new PC(SO,IP,localidad);
		
		Transaccion extraccion = new Extraccion(cliente,pc);
		
		Sistema sistema = new Sistema();
		
		sistema.agregarAListaDeTransacciones(extraccion);
	}
	

}
