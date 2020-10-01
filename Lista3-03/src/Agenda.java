import java.time.LocalDate;
import java.util.HashMap;

public class Agenda {

	private HashMap<LocalDate, DataAgenda> datas = new HashMap<>();


	public Compromisso getMenorCompromisso() {
		Compromisso menorTodos = null;

		for (DataAgenda data : this.datas.values()) {
			Compromisso c = data.getMenorCompromissoDoDia();
			if (c != null) {
				if (menorTodos == null || c.getTempo() < menorTodos.getTempo()) {
					menorTodos = c;
				}	
			}
		}

		return menorTodos;

	}

	public boolean addDataAgenda(DataAgenda d) {
		if (datas.containsKey(d.getData())) {
			return false;
		}
		else {
			datas.put(d.getData(), d);
			return true;
		}
	}

	public DataAgenda buscarData(LocalDate dia) {
		return datas.get(dia);
		
	}


}