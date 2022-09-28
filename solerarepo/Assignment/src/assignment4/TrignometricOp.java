package assignment4;

import java.util.Scanner;

public enum TrignometricOp {
 SIN,
 COS ,
 TAN,
}
class Value2{
	TrignometricOp op;

	public Value2(TrignometricOp op) {
		super();
		this.op = op;
	}
	public void Operation() {
		switch(op) {
		case SIN:
		{
			System.out.println("enter number to calculate sin");
			Scanner sc=new Scanner(System.in);
			Double num=sc.nextDouble();
			System.out.println("SIN of "+num+ " is "+Math.sin(num)+"\n");
			sc.close();
			break;
		}
		case COS:
		{
			System.out.println("enter number to calculate Absolute");
			Scanner sc=new Scanner(System.in);
			Double num=sc.nextDouble();
			System.out.println("COS of "+num+ " is "+Math.cos(num)+"\n");
			sc.close();
			break;
		}
		case TAN:
		{
			System.out.println("enter number to calculate Absolute");
			Scanner sc=new Scanner(System.in);
			Double num=sc.nextDouble();
			System.out.println("TAN of "+num+ " is "+Math.tan(num)+"\n");
			sc.close();
			break;
		}
		default:
		{
			System.out.println("Wroing input");
		}
		}
	}
}