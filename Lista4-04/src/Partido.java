//Desenvolvido por João Vitor de Oliveira, Natália Sens Weise, Paulo Rubens de Moraes Leme Júnior
import java.util.ArrayList;

public class Partido {
	private String nome;
	private int numero;
	private ArrayList<Vereador> vereadores = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String sNome) {
		if (sNome == null || sNome.isEmpty()) {
			throw new IllegalArgumentException("Nome do partido inválido");
		}
		this.nome = sNome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int iNumero) {
		if (iNumero>=10 && iNumero < 100) {
			this.numero = iNumero;
		}
		else {
			IllegalArgumentException excecao = new IllegalArgumentException("Número do partido deve estar entre 10 e 99");
			throw excecao;
		}
	}

	public double getMediaDesempenho() {
		double dDesempenho = 0;
		for (Vereador vereador : this.vereadores) {
			dDesempenho += vereador.getDesempenho();
		}
		return dDesempenho / this.vereadores.size();
	}

	public int getTotalProjetosApresentados() {
		int projetosApresentados = 0;
		for (Vereador vereador : this.vereadores) {
			projetosApresentados += vereador.getQtdProjApres();
		}
		return projetosApresentados;
	}

	public int getTotalProjetosAprovados() {
		int projetosAprovados = 0;
		for (Vereador vereador : this.vereadores) {
			projetosAprovados += vereador.getQtdProjAprov();
		}
		return projetosAprovados;
	}

	public void addVereador(Vereador vereador) {
		this.vereadores.add(vereador);
		vereador.setPartido(this);
	}

	public ArrayList<Vereador> getVereadores() {
		return new ArrayList<>(this.vereadores);
	}



	public Vereador getVereadorMenorDesempenho() {
		Vereador vereadorMenorDesempenho = null;
		for (Vereador vereador : vereadores) {
			if (vereadorMenorDesempenho == null || vereador.getDesempenho() < vereadorMenorDesempenho.getDesempenho()) {
				vereadorMenorDesempenho = vereador;
			}
		}
		return vereadorMenorDesempenho;
	}
}