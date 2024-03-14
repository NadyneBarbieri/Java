package entities;

public abstract class TaxPayer {
	private String Name;
	private Double AnualIncome;
	
	public TaxPayer() {}
	
	public TaxPayer(String Name, Double anualIncome) {
		this.Name = Name;
		AnualIncome = anualIncome;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public Double getAnualIncome() {
		return AnualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		AnualIncome = anualIncome;
	}
	
	public abstract Double tax();
}
