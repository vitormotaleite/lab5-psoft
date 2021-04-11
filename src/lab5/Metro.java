package lab5;

public class Metro implements MeiosDeTransporte{
	
	public Metro() {
		super();
	}

	@Override
	public String calculaRota() {
		return "Esta rota 25 minutos para ser percorrida de metrô.";
	}

	@Override
	public String ToString() {
		return "Metrô";
	}
	
	

}
