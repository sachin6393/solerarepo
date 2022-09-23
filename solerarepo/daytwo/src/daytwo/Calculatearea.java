package daytwo;

public interface Calculatearea {
	public int calculatearea(int length ,int breath);
	default int calculateparameter(int length ,int breadth )
	{
		return length + breadth;
	}
	 static void display()
	 {
		 System.out.println("this is static method");
	 }

}
