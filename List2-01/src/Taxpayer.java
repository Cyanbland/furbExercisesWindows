
public class Taxpayer {
	private String name;
	private String cpf;
	private String uf;
	private double anualIncome;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf.equals("SC") || uf.equals("PR") || uf.equals("RS")) {
			this.uf = uf;
		}
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		if (anualIncome >= 0) {
			this.anualIncome = anualIncome;
		}
	}
	
	public double getTaxToPay() {
		return this.anualIncome * this.getAliquot();
	}
	
	public double getAliquot() {
		if (this.anualIncome < 4001) {
			return 0;
		}
		if (this.anualIncome < 9001) {
			return 0.058;
		}
		if (this.anualIncome < 25001) {
			return 0.15;
		}
		if (this.anualIncome < 35001) {
			return 0.275;
		}
		
		return 0.3;
	}


	
}
