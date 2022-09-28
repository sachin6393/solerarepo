package assignment4;

import java.util.ArrayList;
import java.util.List;


public class Calculateexp {

	public double result_exp(String input)
	{
		 String s[] = input.split(" ");
	        List<String> l=new ArrayList<>();
	        for(int i=0;i<s.length;i++) {
	            if (s[i].equals("abs")) {
	                l.add(String.valueOf(Math.abs(Double.parseDouble(s[i + 1]))));
	                i = i + 1;
	            }
	            else if(s[i].equals("sqrt")){
	                l.add(String.valueOf(Math.sqrt(Double.parseDouble(s[i + 1]))));
	                i = i + 1;
	            }
	            else if(s[i].equals("sin")){
	                l.add(String.valueOf(Math.sin(Double.parseDouble(s[i + 1]))));
	                i = i+1;
	            }
	            else
	                l.add(s[i]);
	        }
	        
	        return basic(l);
	}

	public static double basic(List<String> exp) {
		  double result=0;
	        for (int i = 1; i < exp.size() - 1; i = i + 2) {
	            int counter = 0;
	            counter = i;
	            double res1 = 0;
	            double number1 = 0;
	            double number2 = 0;
	            double num3 = 0;
	            if (i == 1) {
	                number1 = Double.parseDouble(exp.get(counter-1));
	                number2 = Double.parseDouble(exp.get(counter+1));
	                if (exp.get(i).equals("+")) {
	                    res1 = number1 + number2;
	                } else if (exp.get(i).equals("-")) {
	                    res1 = number1 - number2;
	                } else if (exp.get(i).equals("*")) {
	                    res1 = number1 * number2;
	                } else if (exp.get(i).equals("/")) {
	                    res1 = number1 / number2;
	                }
	                result += res1;
	            } else {
	                num3 = Double.parseDouble(exp.get(counter+1));
	                if (exp.get(i).equals("+")) {
	                    result = result + num3;
	                } else if (exp.get(i).equals("-")) {
	                    result = result - num3;
	                } else if (exp.get(i).equals("*")) {
	                    result = result * num3;
	                } else if (exp.get(i).equals("/")) {
	                    result = result / num3;
	                }
	                result += res1;
	            }

	        }
	       // System.out.println(result);
	        return (double)result;
	}
	

	
	
}
