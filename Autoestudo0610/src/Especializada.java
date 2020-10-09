import java.time.LocalDate;

public class Especializada extends Telefone {

	private int qtdOcor;

	public Especializada(LocalDate data, String num, int qtdOcor) {
		super(data, num);
		this.setQtdOcor(qtdOcor);
	}

	public int getQtdOcor() {
		return qtdOcor;
	}

	public void setQtdOcor(int qtdOcor) {
		this.qtdOcor = qtdOcor;
	}

	@Override
	public float getCustoMensal() {
		if (this.getQtdOcor() > 0 && this.getQtdOcor() < 1001) {
			return 50f;
		} else if (this.getQtdOcor() < 5001) {
			return 67.8f;
		} else if (this.getQtdOcor() < 10001) {
			return 98.5f;
		} else if (this.getQtdOcor() < 50001) {
			return 123.9f;
		} else {
			return 187.82f;
		}
	}
}