
public class Vereador {
	private String nome;
	private int qtdProjApres;
	private int qtdProjAprov;
	private Partido partido;

	// para exemlificar um construtor que exige apenas um valor para inicialização
	public Vereador(String nome) {
		this.setNome(nome);
	}
	
	public double getDesempenho() {
		if (qtdProjApres > 0) {  // double / int -> double
			return ((double)qtdProjAprov / qtdProjApres) * this.getIndiceTrabalho();
		} 
		return 0;
	}
	
	public double getIndiceTrabalho() {
		if (this.qtdProjApres == 0) {
			return 0;
		}  //if aninhado (nested)
		if (qtdProjApres < 6) {
			return 0.8;
		} else if (qtdProjApres < 11) {
			return 1;
		} else if (qtdProjApres < 18) {
			return 1.08;
		} else {
			return  1.22;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
		else {
			throw new IllegalArgumentException("Nome do vereador inválido");
		}
	}

	public int getQtdProjApres() {
		return qtdProjApres;
	}

	public void setQtdProjApres(int qtdProjApres) {
		if (qtdProjApres >= 0) {
			this.qtdProjApres = qtdProjApres;
		}
		else {
			throw new IllegalArgumentException("Quantidade de projetos apresentados é inválida");
		}
	}

	public int getQtdProjAprov() {
		return qtdProjAprov;
	}

	public void setQtdProjAprov(int qtdProjAprov) {
		if (qtdProjAprov >= 0) {
			this.qtdProjAprov = qtdProjAprov;
		}
		else {
			throw new IllegalArgumentException("Quantidade de projetos aprovados é inválida");
		}
	}

	public Partido getPartido() {
		return partido;
	}

	protected void setPartido(Partido partido) {
		if (partido != null) {
			this.partido = partido;
		}
		else {
			throw new IllegalArgumentException("Nome do partido inválido");
		}
	}
	}
}
