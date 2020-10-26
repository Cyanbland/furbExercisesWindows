//Desenvolvido por Jo�o Vitor de Oliveira, Nat�lia Sens Weise, Paulo Rubens de Moraes Leme J�nior
import java.util.ArrayList;

public class Vereador {
	private String nome;
	private int qtdProjApres;
	private int qtdProjAprov;
	private Partido partido;
	private ArrayList<ProjetoDeLei> leis = new ArrayList<ProjetoDeLei>();

	// para exemlificar um construtor que exige apenas um valor para inicializa��o
	public Vereador(String nome) {
		this.setNome(nome);
	}

	public double getDesempenho() {
		if (qtdProjApres > 0) { // double / int -> double
			return ((double) qtdProjAprov / qtdProjApres) * this.getIndiceTrabalho();
		}
		return 0;
	}
	
	public void addProjeto(ProjetoDeLei projeto) throws IllegalArgumentException
	{
		if (projeto == null)
			throw new IllegalArgumentException("Projeto de lei nulo.");
		
		for (ProjetoDeLei p : this.getProjetosDeLei())
		{
			if (p.getTitulo().equals(projeto.getTitulo()))
				throw new IllegalArgumentException("Projeto j� existente.");
		}
		
		this.leis.add(projeto);
	}
	
	public ArrayList<ProjetoDeLei> getProjetosDeLei()
	{
		return this.leis;
	}
	
	public double getIndiceTrabalho() {
		if (this.qtdProjApres == 0) {
			return 0;
		} // if aninhado (nested)
		if (qtdProjApres < 6) {
			return 0.8;
		} else if (qtdProjApres < 11) {
			return 1;
		} else if (qtdProjApres < 18) {
			return 1.08;
		} else {
			return 1.22;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null && !nome.isEmpty()) {
			this.nome = nome;
		} else {
			throw new IllegalArgumentException("Nome do vereador inv�lido");
		}
	}

	public int getQtdProjApres() {
		return qtdProjApres;
	}

	public void setQtdProjApres(int qtdProjApres) {
		if (qtdProjApres >= 0) {
			this.qtdProjApres = qtdProjApres;
		}else {
			throw new IllegalArgumentException("Quantidade de projetos apresentados deve ser maior ou igual a zero");
		}
	}

	public int getQtdProjAprov() {
		return qtdProjAprov;
	}

	public void setQtdProjAprov(int qtdProjAprov) {
		if (qtdProjAprov >= 0) {
			this.qtdProjAprov = qtdProjAprov;
		}else {
			throw new IllegalArgumentException("Quantidade de projetos aprovados deve ser maior ou igual a zero");
		}
	}

	public Partido getPartido() {
		return partido;
	}

	protected void setPartido(Partido partido) {
		this.partido = partido;
	}
}