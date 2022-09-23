package assign2;

public class evenarray {

	public static void main(String[] args) {

		
		int arr[] =new  int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=i;
		}
		
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			System.out.println(arr[i]);
		}
		
	}

}
