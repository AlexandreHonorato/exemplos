package br.com.calculator.service;

import java.math.BigDecimal;

import br.com.calculator.CalculationRequest;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Double calculateCompoundInterest(CalculationRequest request) {
		BigDecimal interest;
		
		if (request.getInterest() >= 1) {
			interest = new BigDecimal(request.getInterest())
							.divide(new BigDecimal(100), 3, BigDecimal.ROUND_FLOOR);
		} else {
			interest = new BigDecimal(request.getAmmount());
		}
		interest = interest.add(new BigDecimal(1));
		
		BigDecimal periodCalculated = interest.pow(request.getNumberOfParcels());
		
		BigDecimal newAmmount = new BigDecimal(request.getAmmount()).multiply(periodCalculated);
		
		return newAmmount.doubleValue();
	}

}
