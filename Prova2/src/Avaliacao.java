/**
 *
 * @author João Vitor de Oliveira
 * @author Paulo Rubens de Moraes Leme Júnior
 */
public abstract class Avaliacao 
{
	private String descricao;

	public Avaliacao(String descricao)
	{
		this.setDescricao(descricao);
	}
	
	public void setDescricao(String descricao) throws IllegalArgumentException
	{
		if (descricao.isEmpty())
			throw new IllegalArgumentException("Descricao vazia");
		
		this.descricao = descricao;
	}
	
	public String getDescricao()
	{
		return this.descricao;
	}
	
	public abstract String mostrar();
	
	public abstract float getNota();
}
