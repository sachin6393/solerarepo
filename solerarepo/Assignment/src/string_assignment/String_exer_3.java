package string_assignment;

import java.util.Arrays;



public class String_exer_3 {
	
	public static String sortstring(String input)
	{
		char temp[]=input.toCharArray();
		Arrays.sort(temp);
		
		return new String(temp);
	}
	
	
	public static void main(String[] args) {

		String one="sachin";
		String two="chins  a";
		
		    //removing spaces ;
		    one=one.replaceAll(" ","");
			two=two.replaceAll(" ","");
			
			//sorting the strings
			one=sortstring(one);
			two=sortstring(two);
			
			//checking if equal
			if(one.equals(two)) {
				System.out.println("true");
				
			}else
			{
				System.out.println("false");
			}
		}
		
		
				
		
	}


