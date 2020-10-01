

public class Obra {
	private String titulo;
	private String autor;
	private Parecer[] pareceres = new Parecer[3];
	private byte idxPareceres = 0;
	
	public Obra(String _titutlo, String _autor) {
		this.setTitulo(_titutlo);
		this.setAutor(_autor);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Parecer[] getPareceres() {
		return pareceres;
	}

	public void setPareceres(Parecer[] pareceres) {
		this.pareceres = pareceres;
	}
	
	public boolean addParecer(Parecer parecer) {
		if (idxPareceres < this.pareceres.length) {
			pareceres[idxPareceres] = parecer;
			idxPareceres++;
			return true;
		}
		return false;
	}
	

	public String mostrarObra()
	{
		 String msg = "Titulo: " + this.titulo;

		 msg += "\nAutor: " + this.autor + "\nPareceres: " + this.idxPareceres;
	
		 for (int i = 0; i < this.idxPareceres; ++i)
		 {
			 msg += "\nParecerista: " + pareceres[i].getParecerista() +
			 "\nData: " + pareceres[i].getData() +
			 "\nConteudo: " + pareceres[i].getConteudo();
		 }
	
	
		 return msg;

	}



}
