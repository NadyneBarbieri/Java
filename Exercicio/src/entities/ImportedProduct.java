package entities;

public class ImportedProduct extends Product{
	private Double custtomsFee;
	
	public ImportedProduct(String name, Double price, Double custtomsFee) {
		super(name, price);
		this.custtomsFee = custtomsFee;
	}

	public Double getCusttomsFee() {
		return custtomsFee;
	}

	public void setCusttomsFee(Double custtomsFee) {
		this.custtomsFee = custtomsFee;
	}
	//metodo para calcular o tatal
	public Double totalPrice() {
		return getPrice() + custtomsFee;
	}

	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", custtomsFee)
				+ ")";
	}
}
