package assignment4;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

	  
	 private Map<Character, Operation> operationMap = new HashMap<>();
	    Calculator() {
	        operationMap.put('+', new Addition());
	        operationMap.put('-', new Substraction());
	        operationMap.put('*', new Multiplication());
	        operationMap.put('/', new Division());
	    }

	    double makeCalculation(double operand1, double operand2, char operation) {
	        Operation operationMapValue = operationMap.get(operation);
	        return operationMapValue.calculateResult(operand1, operand2);
	    }
	
	    
}

