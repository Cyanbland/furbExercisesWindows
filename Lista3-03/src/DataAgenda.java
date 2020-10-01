import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class DataAgenda {
	private LocalDate data;
	private String efemeride;
	private ArrayList<Compromisso> compromissos = new ArrayList<>();
	
	public int getTempoMedio() {
		int tempoTotal = 0;
		int numDeCompromissos = compromissos.size();
		for (int i = 0; i < numDeCompromissos; i++) {
			tempoTotal += compromissos.get(i).getTempo();
		}
		
		return tempoTotal / numDeCompromissos;
	}
	
	public boolean addCompromisso(Compromisso compromisso) {
		if (verificaDisponibilidadeHora(compromisso.getHora())) {
			this.compromissos.add(compromisso);
			return true;
		}
		return false;
	}
	
	public ArrayList<Compromisso> getCompromissos() {
		return compromissos;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEfemeride() {
		return efemeride;
	}

	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}

	public Compromisso getMenorCompromissoDoDia() {
		Compromisso menor = null;
		
		for (Compromisso c : this.compromissos) {
			if (menor == null || c.getTempo() < menor.getTempo()) {
				menor = c;
			}
		}
		return menor;
	}
	
	public void setCompromissos(ArrayList<Compromisso> compromissos) {
		this.compromissos = compromissos;
	}

	private boolean verificaDisponibilidadeHora(LocalTime hora) {
		for (int i = 0; i < this.compromissos.size(); i++) {
			if (compromissos.get(i).getHora() == hora) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Compromisso> getCompromissosPrioridade(char prioridade) {
		ArrayList<Compromisso> compromissosPrioridade = new ArrayList<>();
		for (int i = 0; i < this.compromissos.size(); i++) {
			if (this.compromissos.get(i).getPrioridade() == prioridade) {
				compromissosPrioridade.add(compromissos.get(i));
			}
		}
		return compromissosPrioridade;
	}
	
	public int getQtdCompromissosPrioridade(char prioridade) {
		return getCompromissosPrioridade(prioridade).size();
	}
	
	
	
}
