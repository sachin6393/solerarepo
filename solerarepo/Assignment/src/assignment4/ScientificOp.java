package assignment4;

import java.util.Scanner;

public enum ScientificOp {

	SQRT,
	ABS;
}
class Value{
	ScientificOp op;

	public Value(ScientificOp op) {
		super();
		this.op = op;
	}
	public void Operation() {
		switch(op) {
		case SQRT:
		{
			System.out.println("enter number to calculate sqrt");
			Scanner sc=new Scanner(System.in);
			Double num=sc.nextDouble();
			System.out.println("square root of "+num+ " is "+Math.sqrt(num)+"\n");
			sc.close();
			break;
		}
		case ABS:
		{
			System.out.println("enter number to calculate Absolute");
			Scanner sc=new Scanner(System.in);
			Double num=sc.nextDouble();
			System.out.println("Absolute value  of "+num+ " is "+Math.abs(num)+"\n");
			sc.close();
			break;
		}
		}
	}
}
