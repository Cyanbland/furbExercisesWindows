import java.time.LocalDate;

public class Telefone {

	private LocalDate dataInst;
	private String numero;

	public Telefone(LocalDate data, String num) {
		this.setDataInst(data);
		this.setNumero(num);
	}

	public LocalDate getDataInst() {
		return dataInst;
	}

	public void setDataInst(LocalDate dataInst) {
		this.dataInst = dataInst;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero.length() == 10) {
			this.numero = numero;
		} else {
			throw new IllegalArgumentException("O telefone deve ter 10 dígitos");
		}
	}

	public float getCustoMensal() {
		return 0;
	}
}