import java.time.LocalDate;
import java.time.Period;

public abstract class Aluno {
	protected String nome;
	protected LocalDate dataNascimento;
	
	public Aluno(String nome, LocalDate dataNascimento) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		int idade;
		Period p = Period.between(dataNascimento, LocalDate.now());
		idade = p.getYears();
		
		return idade;
	}
	
	public abstract String mostra();
	
	
	
}
