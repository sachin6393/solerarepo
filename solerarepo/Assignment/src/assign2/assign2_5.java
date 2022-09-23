package assign2;

import java.util.Scanner;

public class assign2_5 {

	public static void main(String[] args) {
  
		
		Scanner sc=new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
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
