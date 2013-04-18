package br.com.calculator.action;

import java.text.NumberFormat;

import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;

import br.com.calculator.CalculationRequest;
import br.com.calculator.factory.CalculatorFactory;
import br.com.calculator.service.CalculatorService;

@Results({ 
	    @Result(name = "success", value = "main.jsp"),
		@Result(name = "showResult", value = "result.jsp") 
	    })
public class CalculatorAction {

	// Servico 
	private CalculatorService service = CalculatorFactory.getCalculatorservice();
	// JavaBean
	private CalculationRequest request;
	private Double result;

	public String execute() {
		return "success";
	}

	public String calculate() {
		result = service.calculateCompoundInterest(request);
		return "showResult";
	}

	public String getFormattedResult() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return nf.format(result);
	}

	public CalculationRequest getRequest() {
		return request;
	}

	public void setRequest(CalculationRequest request) {
		this.request = request;
	}
}
