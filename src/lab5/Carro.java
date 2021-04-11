package lab5;

public class Carro implements MeiosDeTransporte {
	
	public Carro() {
		super();
	}

	@Override
	public String calculaRota() {
		return "Esta rota levaria 50 minutos para ser percorrida de carro.";
	}

	@Override
	public String ToString() {
		return "Carro";
	}

}
