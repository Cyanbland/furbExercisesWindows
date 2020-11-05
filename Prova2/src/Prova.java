/**
 *
 * @author João Vitor de Oliveira
 * @author Paulo Rubens de Moraes Leme Júnior
 */

public class Prova extends Avaliacao{
	private float nota;

	public Prova (String descricao, float nota) {
		super(descricao);
		this.setNota(nota);
	}
	
	public float getNota() {
		return nota;
	}

	public void setNota(float nota) throws IllegalArgumentException {
		if (nota > 0 && nota <= 10) {
			this.nota = nota;
		}
		else {
			throw new IllegalArgumentException("A nota da prova deve ser entre 0 e 10.");
		}

	}
	
	public String mostrar()
	{
		return "Prova " + this.getDescricao() + " (" + this.getNota() + ")";
	}
	
}