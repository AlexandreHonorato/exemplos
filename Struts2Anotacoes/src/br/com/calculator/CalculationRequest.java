package br.com.calculator;

public class CalculationRequest {

	private Double ammount;
	private Double interest;
	private Integer numberOfParcels;
	
	public Double getAmmount() {
		return ammount;
	}
	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}
	public Double getInterest() {
		return interest;
	}
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	public Integer getNumberOfParcels() {
		return numberOfParcels;
	}
	public void setNumberOfParcels(Integer numberOfParcels) {
		this.numberOfParcels = numberOfParcels;
	}
	
}
