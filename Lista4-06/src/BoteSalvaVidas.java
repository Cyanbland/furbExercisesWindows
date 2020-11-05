
public class BoteSalvaVidas extends Embarcacao{
	private boolean inflavel;
	private int qtdeRemos;
	private int qtdeColetes;
	
	public BoteSalvaVidas(String registroCapitania, int qtdePessoas, boolean inflavel, int qtdeRemos, int qtdeColetes) {
		super(registroCapitania, qtdePessoas);
		this.setInflavel(inflavel);
		this.setQtdeRemos(qtdeRemos);
		this.setQtdeColetes(qtdeColetes);
	}
	
	public boolean isInflavel() {
		return inflavel;
	}
	
	public void setInflavel(boolean inflavel) {
		this.inflavel = inflavel;
	}
	
	public int getQtdeRemos() {
		return qtdeRemos;
	}
	
	public void setQtdeRemos(int qtdeRemos) {
		if (qtdeRemos < 0) {
			throw new IllegalArgumentException("Informe um valor positivo para a quantidade de remos.");
		}
		this.qtdeRemos = qtdeRemos;
	}
	
	public int getQtdeColetes() {
		return qtdeColetes;
	}
	
	public void setQtdeColetes(int qtdeColetes) {
		if (qtdeColetes < 0) {
			throw new IllegalArgumentException("Informe um valor positivo para a quantidade de coletes.");
		}
		this.qtdeColetes = qtdeColetes;
	}
	
	@Override
	public String verificaSeguranca() {
		String msg = "";
		
		if (this.getQtdeColetes() >= this.getQtdePessoas())
			msg = "Bote OK!";
		else
			msg = "ALERTA: Insuficiência de " + (this.getQtdePessoas() - this.getQtdeColetes()) + " coletes salva-vidas!";
		
		return msg;
	}
	
	
}
