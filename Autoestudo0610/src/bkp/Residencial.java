//Jo�o Vitor de Oliveira, Nat�lia Sens Weise e Paulo Rubens de Moraes Leme J�nior

import java.time.LocalDate;

public class Residencial extends Telefone {

	private boolean conexInt;

	public Residencial(Cliente cliente, LocalDate data, String num, boolean conexInt) {

		super(cliente, data, num);

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