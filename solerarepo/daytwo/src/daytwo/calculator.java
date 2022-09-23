package daytwo;

import java.util.Scanner;
import java.util.*;

public class calculator {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("which operation you want to perform");
		System.out.println("\n");
		System.out.println("option 1==Add\n");
		System.out.println("option 2==Subtract\n");
		System.out.println("option 3==Divide\n");
		System.out.println("option 4==Multiply\n");
		System.out.println("option 0==to exit");
		
		
		int option=sc.nextInt();
		while(option!=0) {
		
		switch(option)
		{
		case 1:
			{System.out.println("enter first number");
			int num1=sc.nextInt();
			System.out.println("enter second number");
			int num2=sc.nextInt();
			int add=num1+num2;
			System.out.println("Addition ="+add);
			
			}
		case 2:
			{System.out.println("enter first number");
			int num1=sc.nextInt();
			System.out.println("enter second number");
			int num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println("Substraction ="+sub);
			break;
			}
		case 3:
			{System.out.println("enter first number");
			int num1=sc.nextInt();
			System.out.println("enter second number");
			int num2=sc.nextInt();
			int mul=num1*num2;
			System.out.println("Multiply ="+mul);
			break;
			}
		case 4:
			{System.out.println("enter first number");
			int num1=sc.nextInt();
			System.out.println("enter second number");
			int num2=sc.nextInt();
			int div=num1/num2;
			System.out.println("divide ="+div);
			break;
			}
		
			
			default:
				System.out.println("enter valid number");
				break;
		}
		System.out.println("which operation you want to perform");
		System.out.println("\n");
		System.out.println("option 1==Add\n");
		System.out.println("option 2==Subtract\n");
		System.out.println("option 3==Divide\n");
		System.out.println("option 4==Multiply\n");
		System.out.println("option 0==to exit");
			
		}
		
		
	}

}
