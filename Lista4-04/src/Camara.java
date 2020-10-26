//Desenvolvido por João Vitor de Oliveira, Natália Sens Weise, Paulo Rubens de Moraes Leme Júnior
import java.util.ArrayList;
import java.util.HashMap;

public class Camara {
	private String municipio;
	private HashMap<Integer, Partido> partidos = new HashMap<>();
	private ArrayList<Partido> partidosArray = new ArrayList<>();

	public Camara(String municipio) {
		this.setMunicipio(municipio);
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public void addPartido(Partido p) {
		if (this.partidos.containsKey(p.getNumero())) {
			throw new IllegalArgumentException("Já existe partido com este número: "+p.getNumero());
		}
		this.partidos.put(p.getNumero(), p);
		this.partidosArray.add(p);
	}

	public int getTotProjApres() {
		int totProj = 0;
		for (Partido p : partidos.values()) {
			totProj += p.getTotalProjetosApresentados();
		}
		return totProj;
	}

	public int getTotProjAprov() {
		int totProj = 0;
		for (Partido p : partidos.values()) {
			totProj += p.getTotalProjetosAprovados();
		}
		return totProj;
	}

	public Vereador getVereadorMenorDesempenho() {
		Vereador vereadorMenor = null;

		for (Partido p : partidos.values()) {
			Vereador piorDoPartido = p.getVereadorMenorDesempenho();
			if (vereadorMenor == null || piorDoPartido.getDesempenho() < vereadorMenor.getDesempenho()) {
				vereadorMenor = piorDoPartido;
			}
		}
		return vereadorMenor;
	}

	public Vereador getVereadorMaisProjAprov() {
		Vereador vereadorMais = null;
		for (Partido p : partidos.values()) {
			ArrayList<Vereador> listaDoPartido = p.getVereadores();
			for (Vereador v : listaDoPartido) {
				if (vereadorMais == null || v.getQtdProjAprov() > vereadorMais.getQtdProjAprov()) {
					vereadorMais = v;
				}
			}
		}
		return vereadorMais;
	}

	public double getDesempenhoMedioCamara() {
		double desemp = 0;
		int qtd = 0;
		for (Partido p : partidos.values()){
			ArrayList<Vereador> listaDoPartido = p.getVereadores();
			for (Vereador v : listaDoPartido) {
				desemp += v.getDesempenho();
				qtd++;
			}
		}
		return desemp / qtd;
	}

	public ArrayList<Vereador> getVereadoresAcimaMediaDesempenho() {
		ArrayList<Vereador> vs = new ArrayList<>();
		double desemp = getDesempenhoMedioCamara();
		for (Partido p : partidos.values()){
			ArrayList<Vereador> listaDoPartido = p.getVereadores();
			for (Vereador v : listaDoPartido) {
				if (v.getDesempenho() > desemp) {
					vs.add(v);
				}
			}
		}
		return vs;
	}
	
	public ArrayList<Partido> getPartidos() {
		return this.partidosArray;
	}

	public Partido getPartido(int numero) {
		return this.partidos.get(numero);
	}

}