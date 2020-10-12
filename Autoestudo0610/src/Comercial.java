//Jo�o Vitor de Oliveira, Nat�lia Sens Weise, Paulo Rubens de Moraes Leme J�nior
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Comercial extends Telefone {

	private String servico;

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Comercial(Cliente cliente, LocalDate data, String num, String servico) {

		super(cliente, data, num);

		this.setServico(servico);

	}

	public String getServico() {

		return servico;

	}

	public void setServico(String servico) {
		if (servico.isEmpty()) {
			throw new IllegalArgumentException("Informe um ramo de atividade");
		}
		this.servico = servico;

	}

	public boolean verificarData() {

		if (this.getDataInst().isBefore(LocalDate.parse("01/01/2017", formatter))) {

			return true;

		}

		return false;

	}

	@Override

	public float getCustoMensal() {

		if (verificarData()) {

			return 25f;

		}

		return 37.5f;

	}

}