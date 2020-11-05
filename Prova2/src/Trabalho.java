/**
 *
 * @author João Vitor de Oliveira
 * @author Paulo Rubens de Moraes Leme Júnior
 */

public class Trabalho extends Avaliacao
{
	private Character conceito;
	
	public Trabalho(String descricao, Character conceito)
	{
		super(descricao);
		this.setConceito(conceito);
	}

	
	public void setConceito(Character conceito) throws IllegalArgumentException
	{
		if (this.converterConceito(conceito) == 0f)
			throw new IllegalArgumentException("Conceito inválido"); 
		
		if (String.valueOf(conceito) == "")
			throw new IllegalArgumentException("Conceito deve ser especificado");
		
		this.conceito = conceito;
	}
	
	private float converterConceito(Character conceito)
	{
		if (conceito.equals('A'))
			return 10f;
		if (conceito.equals('B'))
			return 9f;
		if (conceito.equals('C'))
			return 7.5f;
		if (conceito.equals('D'))
			return 5.0f;
		if (conceito.equals('E'))
			return 2.0f;
		
		return 0f;
	}
	
	
	public char getConceito()
	{
		return this.conceito;
	}
	

	public float getNota() 
	{
		return this.converterConceito(conceito);
	}
	
	public String mostrar()
	{
		return "Trabalho " + this.getDescricao() + " (" + this.getConceito() + ")";
	}
}
