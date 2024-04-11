package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer nunber;
	private LocalDate date;
	private Double totalValue;

	private List<Installment> installments = new ArrayList<>();

	public Contract() {
	}

	public Contract(Integer nunber, LocalDate date, Double totalValue) {
		this.nunber = nunber;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNunber() {
		return nunber;
	}

	public void setNunber(Integer nunber) {
		this.nunber = nunber;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalVlaue) {
		this.totalValue = totalVlaue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

}
