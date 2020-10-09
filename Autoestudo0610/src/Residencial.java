import java.time.LocalDate;

public class Residencial extends Telefone {

	private boolean conexInt;

	public Residencial(LocalDate data, String num, boolean conexInt) {
		super(data, num);
		this.setConexInt(conexInt);
	}

	public boolean isConexInt() {
		return conexInt;
	}

	public void setConexInt(boolean conexInt) {
		this.conexInt = conexInt;
	}

	@Override
	public float getCustoMensal() {
		return 15f;
	}
}