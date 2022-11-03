package ar.edu.unlam.pb2;

public class Movil extends Dispositivo {

	private String IMEI;
	private Biometria registro;
	
	public Movil(String sistemaOperativo, String ip, String localidad, String IMEI, Biometria registro) {
		super(sistemaOperativo, ip, localidad);
		this.IMEI = IMEI;
		this.registro=registro;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public Biometria getRegistro() {
		return registro;
	}

	public void setRegistro(Biometria registro) {
		this.registro = registro;
	}
	
	
}
