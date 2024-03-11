package entities;

public class Employee {
	private String name;
	private Integer hours;
	private Double valueperhour;
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueperhour() {
		return valueperhour;
	}

	public void setValueperhour(Double valueperhour) {
		this.valueperhour = valueperhour;
	}

	public Employee(String name, Integer hours, Double valueperhour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valueperhour = valueperhour;
	}
	
	public double payment() {
		return hours * valueperhour;
	}
	
	
}
