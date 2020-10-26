//Desenvolvido por Jo�o Vitor de Oliveira, Nat�lia Sens Weise, Paulo Rubens de Moraes Leme J�nior
import java.time.LocalDate;

public class ProjetoDeLeiComplementar extends ProjetoDeLei{

	private String artigoLO;
	private int qtdVotosFavoraveis;
	
	public ProjetoDeLeiComplementar(String titulo, LocalDate dataApres, LocalDate dataAprov, int numProj,
			String art, int qtdVotos) {
		super(titulo, dataApres, dataAprov, numProj);
		this.setArtigoLO(art);
		this.setQtdVotosFavoraveis(qtdVotos);
	}
	
	public ProjetoDeLeiComplementar() {}

	public String getArtigoLO() {
		return artigoLO;
	}

	public void setArtigoLO(String artigoLO) {
		if (artigoLO.isEmpty()) {
			throw new IllegalArgumentException("ArtigoLO vazio...");
		}
		else {
			this.artigoLO = artigoLO;
		}
	}

	public int getQtdVotosFavoraveis() {
		return qtdVotosFavoraveis;
	}

	public void setQtdVotosFavoraveis(int qtdVotosFavoraveis) {
		if (qtdVotosFavoraveis > -1) {
			this.qtdVotosFavoraveis = qtdVotosFavoraveis;	
		}
		else {
			throw new IllegalArgumentException("N�mero inv�lido!");
		}
	}
	
	public String mostrar() {
		return super.mostrar() + "\n ArtigoLO: "+this.getArtigoLO()+
				"\n Votos Favor�veis: "+this.getQtdVotosFavoraveis();
	}
}