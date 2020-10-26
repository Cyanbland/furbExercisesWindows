import java.time.LocalDate;

public class AlunoUniversitario extends Aluno{
	private char formaIngresso;
	private Curso curso;
	
	
	public AlunoUniversitario(String nome, LocalDate dataNascimento, char formaIngresso, Curso curso) {
		super(nome, dataNascimento);
		this.setFormaIngresso(formaIngresso);;
		this.setCurso(curso);
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}
	
	public void setFormaIngresso(char formaIngresso) throws IllegalArgumentException{
		char[] formasIngresso = {'v', 'e', 's', 't', 'i'};
		char formaIngressoFormatada = Character.toLowerCase(formaIngresso);
		boolean formaEValida = false;
		
		for (int i = 0; i < formasIngresso.length; i++) {
			if (formaIngressoFormatada == formasIngresso[i]) {
				formaEValida = true;
			}
		}
		
		if (formaEValida) {
			this.formaIngresso = formaIngresso;
		}
		else {
			throw new IllegalArgumentException("A forma de ingresso informada é inválida.");
		}

	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String mostra() {

		return null;
	}
	
	
}
