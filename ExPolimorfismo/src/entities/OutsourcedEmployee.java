package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valueperhour, Double additionalCharge) {
		super(name, hours, valueperhour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	//logica para fazer a soma de 110 por cento
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
