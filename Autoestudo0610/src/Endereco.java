public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String uf;

	public Endereco(String rua, int numero, String cidade, String uf) {
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

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}