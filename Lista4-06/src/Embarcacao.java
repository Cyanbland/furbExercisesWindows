
public abstract class Embarcacao implements AtivoEmRisco {
	//A classe Embarcacao n�o precisa ter o m�todo verificaSeguranca pois � abstrata. As suas sub-classes necessitam implementar o m�todo.
	private String registroCapitania;
	private int qtdePessoas;
	
	public Embarcacao(String registroCapitania, int qtdePessoas) {
		this.setRegistroCapitania(registroCapitania);
		this.setQtdePessoas(qtdePessoas);
	}

	public String getRegistroCapitania() {
		return registroCapitania;
	}

	public void setRegistroCapitania(String registroCapitania) {
		if (registroCapitania.isEmpty()) {
			throw new IllegalArgumentException("O registro de capitania n�o pode ser nulo.");
		}
		
		this.registroCapitania = registroCapitania;
	}

	public int getQtdePessoas() {
		return qtdePessoas;
	}

	public void setQtdePessoas(int qtdePessoas) {
		if (qtdePessoas < 0) {
			throw new IllegalArgumentException("A quantidade de pessoas precisa ser positiva.");
		}
		this.qtdePessoas = qtdePessoas;
	}
	
	
}
