package string_assignment;

import java.util.Scanner;

public class String_exer_4 {
	
	static void recursive_rev(char[] str2,int i)
	{
		
		int n=str2.length;
		
		if(i==n/2)
			return;
		swap(str2,i,n-i-1);
		
		recursive_rev(str2,i+1);
				
	}
	
	static void swap(char st1[],int i,int j)
	{
		char temp;
		temp=st1[i];
		st1[i]=st1[j];
		st1[j]=temp;
		
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		String str=sc.next();
		
		int len=str.length();
		
		//iterative method
//		StringBuffer bf=new StringBuffer();
//		for(int i=len-1;i>=0;i--)
//		{
//			bf.append(str.charAt(i));
//		}
		
		//recursive method
		
		char str2[]= str.toCharArray();
		recursive_rev(str2,0);
		
		
		System.out.println(String.valueOf(str2));	
		
	}

}
