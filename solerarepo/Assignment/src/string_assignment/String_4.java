package string_assignment;

public class String_4 {

	public static void main(String[] args) {

	   
	        String original = "software";
	        StringBuffer result = new StringBuffer("hi");
	        int index = original.indexOf('a');

	/*1*/   result.setCharAt(0, original.charAt(0));
//	//ans1==si
	/*2*/   result.setCharAt(1, original.charAt(original.length()-1));
	//ans 2=se;
	/*3*/   result.insert(1, original.charAt(4));
	//ans3=swe
	/*4*/   result.append(original.substring(1,4));
	//ans4=sweoft
	/*5*/   result.insert(3, (original.substring(index, index+2) + " "));
	//ans5=swear oft

	        System.out.println(result);
	    }

	}


