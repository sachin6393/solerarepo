package string_assignment;

import java.util.Scanner;

public class Is_string_assign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		

		 String str = sc.next();
		 boolean b=true;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<'0' || str.charAt(i)>'9')
			{
				b=false;
				break;
			}
		}
		
		
		if(b)
		{
			System.out.println("it contains only digits");
		}
		else
		{
			System.out.println("it is a string or both digit and string");
		}
		
sc.close();
}
}
