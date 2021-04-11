package lab5;

public class Onibus implements MeiosDeTransporte {
	
	public Onibus() {
		super();
	}

	@Override
	public String calculaRota() {
		return "Esta rota levaria uma hora e 10 minutos para ser percorrida de ônibus.";
	}

	@Override
	public String ToString() {
		return "Ônibus";
	}

}
