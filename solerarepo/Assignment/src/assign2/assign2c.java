package assign2;

public class assign2c {

	public static void main(String[] args) {
		int arr [][]=new int[4][5];
		int f=0;
		System.out.println("Your matrix");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=f;
				System.out.print(arr[i][j]+" ");
				f++;
			}
			System.out.println();
		}
		System.out.println("only odd numbers from the matrix");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]%2!=0)
				{
					System.out.print(arr[i][j]+" ");
				}
				//System.out.println("\n");

			}
		}
		
		

	}

}
