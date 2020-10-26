
public class Curso {
	private String sigla;
	private String nome;
	
	
	public Curso(String sigla, String nome) {
		this.setSigla(sigla);
		this.setNome(nome);;
	}

	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
