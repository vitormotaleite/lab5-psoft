package lab5;

public class Pedestre implements MeiosDeTransporte {
	
	public Pedestre() {
		super();
	}

	@Override
	public String calculaRota() {
		return "Esta rota levaria duas horas para ser percorrida a pé.";
	}

	@Override
	public String ToString() {
		return "Pedestre";
	}

}
