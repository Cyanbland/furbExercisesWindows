import java.time.LocalDate;

import java.time.LocalTime;

public class Evento {
	private String titulo;
	private double valor;
	private LocalDate data;
	private Avaliacao aval;

	public Evento(String t, double v, LocalDate d) {
		this.setTitulo(t);
		this.setValor(v);
		this.setData(d);
	}

	public Avaliacao getAval() {
		return aval;
	}

	public void setAval(Avaliacao aval) {
		this.aval = aval;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String exibir() {
		if (aval != null) {
			return this.getClass().getName() + ":" + this.getTitulo() + ", no dia " + this.getData() +
					"ingressos a " + this.getValor() + ", teve" + this.getAval().getQntPagantes()
					+ "pagantes que acharam o evento " +
					this.getAval().getOpiniaoGeral();
		}

		else {
			return this.getClass().getName() + ":" + this.getTitulo() + ", no dia " + this.getData() +
					"ingressos a " + this.getValor() + ". Ainda não possui avaliação.";
		}

	}

}