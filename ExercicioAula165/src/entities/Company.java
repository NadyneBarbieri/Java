package entities;

public class Company extends TaxPayer {
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String nome, Double anualIncome, Integer numberOfEmployees) {
		super(nome, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}

}
