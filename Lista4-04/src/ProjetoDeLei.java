//Desenvolvido por João Vitor de Oliveira, Natália Sens Weise, Paulo Rubens de Moraes Leme Júnior
import java.time.LocalDate;
import java.lang.IllegalArgumentException;

public class ProjetoDeLei 
{
	private String titulo;
	private LocalDate dataApresentacao;
	private LocalDate dataAprovacao;
	private int numeroProjeto;
	
	
	
	public ProjetoDeLei(String titulo, LocalDate dataApresentacao, LocalDate dataAprovacao, int numeroProjeto) throws IllegalArgumentException
	{
		this.setTitulo(titulo);
		this.setDataApresentacao(dataApresentacao);
		this.setDataAprovacao(dataAprovacao);
		this.setNumeroProjeto(numeroProjeto);
	}
	
	public ProjetoDeLei() {}
	
	
	public String mostrar()
	{
		String msg = "";
		if (this.getDataAprovacao() == null)
			msg = "--------------- \nTitulo: " + this.getTitulo() + 
			"\nDataApresentacao: " + this.getDataApresentacao().toString() + 
			"\nData Aprovacao: Não aprovado ainda." + 
			"\nNúmero Projeto: " + String.valueOf(this.getNumeroProjeto());
		else
			msg = "--------------- \nTítulo: " + this.getTitulo() + 
				"\nData Apresentacão: " + this.getDataApresentacao().toString() + 
				"\nData Aprovação: " + this.getDataAprovacao().toString() + 
				"\nNúmero Projeto: " + String.valueOf(this.getNumeroProjeto());
		return msg;
	}
	
	public void setTitulo(String titulo)
	{
		if (titulo == null)
			throw new IllegalArgumentException("Titulo nulo");
		
		this.titulo = titulo;
	}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public void setDataApresentacao(LocalDate dataApresentacao)
	{
		if (dataApresentacao == null)
			throw new IllegalArgumentException("Data apresentacao nulo");
		
		this.dataApresentacao = dataApresentacao;
	}
	
	public LocalDate getDataApresentacao()
	{
		return this.dataApresentacao;
	}
	
	public void setDataAprovacao(LocalDate dataAprovacao)
	{
		if (dataAprovacao == null)
			throw new IllegalArgumentException("Data aprovacao nulo");
		
		this.dataAprovacao = dataAprovacao;
	}
	
	public LocalDate getDataAprovacao()
	{
		return this.dataAprovacao;
	}
	
	public void setNumeroProjeto(int numeroProjeto) throws IllegalArgumentException
	{
		if (numeroProjeto < 0)
			throw new IllegalArgumentException("Numero negativo");
		
		
		this.numeroProjeto = numeroProjeto;
	}
	
	public int getNumeroProjeto()
	{
		return this.numeroProjeto;
	}
	
	
	
	
	
	
}