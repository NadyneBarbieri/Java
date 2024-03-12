package entities;

public abstract  class TaxPayer {
	private String nome;
	private Double AnualIncome;
	
	public TaxPayer() {}
	
	public TaxPayer(String nome, Double anualIncome) {
		this.nome = nome;
		AnualIncome = anualIncome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getAnualIncome() {
		return AnualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}
	
	public abstract Double tax();
}
