/**
 *
 * @author João Vitor de Oliveira
 * @author Paulo Rubens de Moraes Leme Júnior
 */

import java.util.ArrayList;

public class Aluno 
{
	private ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	private String nome;
	
	
	public Aluno(String nome)
	{
		this.setNome(nome);
	}
	
	public Aluno() {}
	
	
	public void addAvaliacao(Avaliacao a)
	{
		if (a == null)
			throw new IllegalArgumentException("Avaliacao invalida");
		
		this.avaliacoes.add(a);
	}
	
	public float getMedia()
	{
		float media = 0;
		for (Avaliacao a : avaliacoes)
		{
			media += a.getNota();
		}
		return media / avaliacoes.size();
	}
	
	public String exibeBoletim()
	{
		String buffer = "\n";
		buffer += this.getNome() + " obteve média final " + this.getMedia() + " em função das avaliações:";
		for (Avaliacao a : avaliacoes)
		{
			buffer += "\n\n";
			buffer += a.mostrar();
		}
		return buffer;
	}
	
	public void setNome(String nome) throws IllegalArgumentException
	{
		if (nome.equals(""))
			throw new IllegalArgumentException("Nome deve ser especificado");
		
		
		this.nome = nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
}
