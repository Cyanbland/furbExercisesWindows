import java.time.LocalDate;

import java.time.LocalTime;

public class ShowMusical extends Evento {
	private String nomeBanda;
	private String estiloMusical;

	public ShowMusical(String t, double v, LocalDate d, String nome, String estilo) {
		super(t, v, d);
		this.setNomeBanda(nome);
		this.setEstiloMusical(estilo);
	}
	
	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}



	@Override
	public String exibir() {
		if (this.getAval() != null) {
			return this.getClass().getName() + ": " + this.getTitulo() + " de " + this.getEstiloMusical() + " de "
					+ this.getNomeBanda() +
					" com ingressos a " + this.getValor() + ", dia " + this.getData() + ". Teve "
					+ this.getAval().getQntPagantes() +
					" pagantes que acharam o evento " + this.getAval().getOpiniaoGeral();
		} else {
			return this.getClass().getName() + ": " + this.getTitulo() + " de " + this.getEstiloMusical() + " de "
					+ this.getNomeBanda() +
					" com ingressos a " + this.getValor() + ", dia " + this.getData() + ". Não possui avaliação.";
		}
	}
}