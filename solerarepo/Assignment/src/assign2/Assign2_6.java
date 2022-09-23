package assign2;

import java.util.Scanner;

public class Assign2_6 {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

		System.out.println("enter value of rows for first matrix");
		int m=sc.nextInt();
		System.out.println("enter value of coloumns for first matrix");
		int n=sc.nextInt();
		
		boolean flag=true;
		while(flag) {
		
		System.out.println("enter value of rows for second matrix ");
		int m2=sc.nextInt();
		if(m!=m2)
		{
			System.out.println("enter valid input it must be equal to previous matrix");
			continue;
			//flag=true;
		}
		
		
		System.out.println("enter value of coloumns for the second matrix");
		int n2=sc.nextInt();
		if(n!=n2)
		{
			System.out.println("enter valid input it must be equal to previous matrix");
			continue;
			//flag=true;

		}
		flag=false;
		}
		
		int f=0,g=1;
		int M1[][]=new int[m][n];
		int M2[][]=new int[m][n];
		
		int ans[][]=new int[m][n];
		System.out.println("first matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				M1[i][j]=f;
				System.out.print(M1[i][j]+" ");
				f++;
			}
			System.out.println();
		}
		System.out.println("second matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				M2[i][j]=g;
				System.out.print(M2[i][j]+" ");
				g++;
			}
			System.out.println();
		}
		
		System.out.println("Addition of two matrix matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ans[i][j]=M1[i][j]+M2[i][j];
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ans[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
