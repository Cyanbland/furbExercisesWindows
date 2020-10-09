import java.util.ArrayList;

//João Vitor de Oliveira e Paulo Rubens de Moraes Leme Júnior


public class Selecao {
	private String nomeSelecao;
	private String nomeTreinador;
	private int ranking;
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	
	public Selecao(String _nomeSelecao, String _nomeTreinador, int _ranking, ArrayList<Jogador> _jogadores) {
		this.setNomeSelecao(_nomeSelecao);;
		this.setNomeTreinador(_nomeTreinador);
		this.setRanking(_ranking);
		this.setJogadores(_jogadores);
	}
	
	public Selecao() {}
	
	public String getNomeSelecao() {
		return nomeSelecao;
	}
	public void setNomeSelecao(String nomeSelecao) {
		this.nomeSelecao = nomeSelecao;
	}
	public String getNomeTreinador() {
		return nomeTreinador;
	}
	public void setNomeTreinador(String nomeTreinador) {
		this.nomeTreinador = nomeTreinador;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public float getIdadeMedia() {
		float idadeMedia = 0;
		int totalIdades = 0;
		int qtdJogadores = this.jogadores.size();
		
		for (int i = 0; i < qtdJogadores; i++) {
			totalIdades += this.jogadores.get(i).getIdade();
		}
		
		idadeMedia = (float) totalIdades / qtdJogadores;
		return idadeMedia;
	}
	
	public Jogador getJogadorMaisAlto(ArrayList<Jogador> jogadores) {
		Jogador jogadorMaior = null;

		for (Jogador jogador : jogadores) {
			if ((jogadorMaior == null) || (jogadorMaior.getAltura() < jogador.getAltura())) {
				jogadorMaior = jogador;
			}
		}

		return jogadorMaior;

	}

	public ArrayList<Jogador> getQuantosAbaixo(ArrayList<Jogador> jogadores, int altura) {
		ArrayList<Jogador> jogadoresAbaixo = new ArrayList<Jogador>();

		for (Jogador jogador : jogadores) {
			if (jogador.getAltura() < altura)
				jogadoresAbaixo.add(jogador);
		}

		return jogadoresAbaixo;

	}

	public ArrayList<Jogador> getJogadores(ArrayList<Jogador> jogadores, String posicao) {
		ArrayList<Jogador> jogadoresEmPosicao = new ArrayList<Jogador>();

		for (Jogador jogador : jogadores) {
			if (jogador.getPosicao() == posicao) {
				jogadoresEmPosicao.add(jogador);
			}
		}
		return jogadoresEmPosicao;
	}
}
