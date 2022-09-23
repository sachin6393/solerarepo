package Assignment3_p1;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		String ans=str.substring(start,end+1);
		System.out.println("result string\n"+ans);
	}

}
