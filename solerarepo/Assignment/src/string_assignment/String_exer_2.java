package string_assignment;

public class String_exer_2 {

	public static void main(String[] args) {

		String name="sachin verma";
		String n[]=name.split(" ");
		
		char ini;
		for(String ch:n)
		{
			System.out.println(ch.substring(0,1));
		}
		
		
	}

}
