package lab5;

public class Cliente {
	
	private MeiosDeTransporte meiosDeTransporte;
	
	public Cliente(MeiosDeTransporte transporte) {
		this.meiosDeTransporte = transporte;
	}
	
	public MeiosDeTransporte getMeiosDeTransporte() {
		return meiosDeTransporte;
	}

	public void setMeiosDeTransporte(MeiosDeTransporte meiosDeTransporte) {
		this.meiosDeTransporte = meiosDeTransporte;
	}

	public String imprimeCabecalho() {
		return "Selecione um meio de tansporte:" + "\n" +
                "1 - Pedestre" + "\n" +
                "2 - Carro" + "\n" +
                "3 - Ônibus" + "\n" +
                "4 - Metrô" + "\n";
	}
	
	public String Resultado() {
		return "Calculando a rota de " + this.meiosDeTransporte.ToString() + ":" + "\n" +
				this.meiosDeTransporte.calculaRota() + "\n" + "Obrigado por usar este servico.";	
	}
	
	public String alterar() {
		return "Deseja alterar a escolha ? S/N: ";
	}
	
	public String defineMeioDeTransporte(MeiosDeTransporte strategy, int transporte) {
		String resultado; 
		if(transporte == 1) {
			strategy = new Pedestre();
			this.setMeiosDeTransporte(strategy);
			resultado = "Voce escolheu: " + this.meiosDeTransporte.ToString();
		}
		else if(transporte == 2) {
			strategy = new Carro();
			this.setMeiosDeTransporte(strategy);
			resultado = "Voce escolheu: " + this.meiosDeTransporte.ToString();
		}
		else if(transporte == 3) {
			strategy = new Onibus();
			this.setMeiosDeTransporte(strategy);
			resultado = "Voce escolheu: " + this.meiosDeTransporte.ToString();
		}
		else if(transporte == 4) {
			strategy = new Metro();
			this.setMeiosDeTransporte(strategy);
			resultado = "Voce escolheu: " + this.meiosDeTransporte.ToString();
		}
		else {
			resultado = "meio de transporte invalido.";
		}
		return resultado;
	}
}
