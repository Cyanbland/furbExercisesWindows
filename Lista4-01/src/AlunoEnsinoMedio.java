import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno{
	private int ano;

	public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, int ano) {
		super(nome, dataNascimento);
		this.setAno(ano);
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws IllegalArgumentException {
		if (ano >= 1 && ano <= 3) {
			this.ano = ano;
		}
		else {
			throw new IllegalArgumentException("Ano deve estar entre 1 e 3");
		}
	}

	@Override
	public String mostra() {

		return null;
	}
	
	
}
