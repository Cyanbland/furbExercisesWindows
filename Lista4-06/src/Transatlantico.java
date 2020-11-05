import java.time.LocalDate;
import java.util.ArrayList;

public class Transatlantico extends Embarcacao{
	private String nome;
	private LocalDate dataInauguracao;
	private ArrayList<BoteSalvaVidas> botes = new ArrayList<>();
	
	public Transatlantico(String registroCapitania, int qtdePessoas, String nome, LocalDate dataInauguracao) {
		super(registroCapitania, qtdePessoas);
		this.setNome(nome);
		this.setDataInauguracao(dataInauguracao);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}
	
	public void setDataInauguracao(LocalDate dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}
	
	public void addBote(BoteSalvaVidas bote) {
		botes.add(bote);
	}
	
	public void addBote(String registroCapitania, int qtdePessoas, boolean inflavel, int qtdeRemos, int qtdeColetes) {
		
	}

	@Override
	public String verificaSeguranca() {

		return null;
	}
	
	
}
