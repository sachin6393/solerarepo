package string_assignment;

import java.util.Scanner;

public class Is_vowel_consonent {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
		
		String str="This is a really simple sentence ";
		
		str.toLowerCase();
		
		int len=str.length();
		char ar[]=str.toCharArray();
		int count_v=0,count_c=0;
		for(char ch:ar)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				count_v++;
			}
			else if(ch>='a' && ch<='z')
			{
				count_c++;
			}
		}
		System.out.println("vowels "+count_v+" and consonnts "+count_c);
	}

}
