package daytwo;

public class Instance {
 public static void main(String[] args) {
	Instance in=new Instance();
	if(in instanceof Instance)
	{
		System.out.println("true");
	}
	else
		System.out.println("false");
}
}
