package br.com.calculator.factory;

import br.com.calculator.service.CalculatorService;
import br.com.calculator.service.CalculatorServiceImpl;

public class CalculatorFactory {

	private static final CalculatorService calculatorService = new CalculatorServiceImpl();

	public static CalculatorService getCalculatorservice() {
		return calculatorService;
	}
	
}
