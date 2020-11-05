public class Avaliacao {
	private int qntPagantes;
	private String opiniaoGeral;

	public Avaliacao(int qntPagantes, String opiniaoGeral) {
		this.setQntPagantes(qntPagantes);
		this.setOpiniaoGeral(opiniaoGeral);
	}

	public int getQntPagantes() {
		return qntPagantes;
	}

	public void setQntPagantes(int qntPagantes) {
		this.qntPagantes = qntPagantes;
	}

	public String getOpiniaoGeral() {
		return opiniaoGeral;
	}

	public void setOpiniaoGeral(String opiniaoGeral) {
		this.opiniaoGeral = opiniaoGeral;
	}
}