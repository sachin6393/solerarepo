package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mutating_calculator {

	public static void main(String[] args) {

		
		int operation=0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("which operation you want to peform \n");
			System.out.println("press '1' to calculate value of a string expression\n");
			System.out.println("press '2' for Arithmatic operation \n");
			System.out.println("press '3' for Scientific operation \n");
			System.out.println("press '4' for Trigonometric operation \n");
			System.out.println("press -1 to exit the program");
			
			operation = sc.nextInt();

			if (operation == 2) {
				System.out.println("Write two numbers and a operator ( +,-,*,/ ) with spaces");
				
				String str;
				double firstnum = 0;
				double secondnum = 0;
				char operator = 0;

				try {
					firstnum = sc.nextDouble();
					secondnum = sc.nextDouble();
					operator = sc.next().charAt(0);
					str = sc.nextLine();
					
					Calculator cal = new Calculator();
					System.out.println(cal.makeCalculation(firstnum, secondnum, operator));
					operation=1;
					continue;


				} catch (InputMismatchException e ) {

					System.out.println("invalid input\n");
					operation=-1;
				    
				}

				
			} else if (operation == 3) {
				System.out.println("press '1' to calculate square root of a number\n");
				System.out.println("press '2' to calculate absolute  of a number");
				Scanner sc3 = new Scanner(System.in);
				int option = 0;

				
					option = sc3.nextInt();
					
					if(option==1)
					{
						
						Value v=new Value(ScientificOp.SQRT);
						v.Operation();
						operation=-1;
						
					}
					if(option==2)
					{
						Value v=new Value(ScientificOp.ABS);
						v.Operation();
						operation=-1;
						
					}	


			} 
			else if (operation == 1) {
				
				
				System.out.println("Enter Expression with spaces ");
				try {
				 Scanner sc2=new Scanner(System.in);
			     String inp=sc2.nextLine();
				
				Calculateexp exp=new Calculateexp();
				double result=exp.result_exp(inp);
				System.out.println(result);
				operation=-1;
				}
				catch(InputMismatchException e){
					System.out.println(" wrong input\n");
					operation=-1;
				}
				
			}
			else if(operation==4)
			{
				System.out.println("press 1 for SIN \n");
				System.out.println("press 2 for COS \n");
				System.out.println("press 3 for TAN \n");
				
				Scanner sc4 = new Scanner(System.in);
				
					int option = sc4.nextInt();
					
					if(option==1)
					{
						
						Value2 v2=new Value2(TrignometricOp.SIN);
						v2.Operation();
						operation=-1;
						
					}
					else if(option==2)
					{
						Value2 v2=new Value2(TrignometricOp.COS);
						v2.Operation();
						operation=-1;
						
					}	
					else if(option==3)
					{
						Value2 v2=new Value2(TrignometricOp.TAN);
						v2.Operation();
						operation=-1;
						
					}	
					else
					{
						System.out.println("invalid input\n");
				        operation=-1;
					}			
				
			}
			sc.close();
			
		} while (operation != -1);

		
	}

}
