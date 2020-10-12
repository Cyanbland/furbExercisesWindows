//João Vitor de Oliveira, Natália Sens Weise e Paulo Rubens de Moraes Leme Júnior

public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String uf;

	private String[] estados = new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
			"MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO" };

	public Endereco(String rua, int numero, String cidade, String uf) throws Exception {
		this.setRua(rua);
		this.setNumero(numero);
		this.setCidade(cidade);
		this.setUf(uf);

	}

	public Endereco() {
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) throws IllegalArgumentException {
		if (rua == null)
			throw new IllegalArgumentException("Rua nula");

		this.rua = rua;
	}

	public int getNumero() {
		return this.numero;
	}

	private Boolean estadoValido(String uf) throws IllegalArgumentException {
		if (uf == null)
			throw new IllegalArgumentException("UF nulo");

		for (String estado : estados) {
			if (estado.equals(uf))
				return true;
		}
		return false;
	}

	public void setNumero(int numero) throws IllegalArgumentException {
		if (numero < 0)
			throw new IllegalArgumentException("Endereço com numero negativo");

		this.numero = numero;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) throws IllegalArgumentException {
		if (cidade == null)
			throw new IllegalArgumentException("Cidade nula");

		this.cidade = cidade;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) throws Exception {
		if (!this.estadoValido(uf))
			throw new Exception("Estado inexistente");

		this.uf = uf;
	}
}
