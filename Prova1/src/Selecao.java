import java.util.ArrayList;

//João Vitor de Oliveira e Paulo Rubens de Moraes Leme Júnior


public class Selecao {
	private String nomeSelecao;
	private String nomeTreinador;
	private int ranking;
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	
	public Selecao(String _nomeSelecao, String _nomeTreinador, int _ranking) {
		this.setNomeSelecao(_nomeSelecao);;
		this.setNomeTreinador(_nomeTreinador);
		this.setRanking(_ranking);
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

	public void addJogador(Jogador jogador) throws Exception
	{
		if (jogador == null)
			throw new Exception("Jogador nulo");
		
		if (jogadores.size() > 12)
			throw new Exception("Maximo de jogadores excedido");
		
		
		this.jogadores.add(jogador);
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
	
	public Jogador getJogadorMaisAlto() {
		Jogador jogadorMaior = null;

		for (Jogador jogador : this.getJogadores()) {
			if ((jogadorMaior == null) || (jogadorMaior.getAltura() < jogador.getAltura())) {
				jogadorMaior = jogador;
			}
		}

		return jogadorMaior;

	}

	public int getQuantosAbaixo(int altura) {
		int count = 0;

		for (Jogador jogador : this.getJogadores()) {
			if (jogador.getAltura() < altura)
				count++;
		}

		return count;

	}

	public ArrayList<Jogador> getJogadores(String posicao) {
		ArrayList<Jogador> jogadoresEmPosicao = new ArrayList<Jogador>();

		for (Jogador jogador : this.getJogadores()) {
			if (jogador.getPosicao() == posicao) {
				jogadoresEmPosicao.add(jogador);
			}
		}
		return jogadoresEmPosicao;
	}
}