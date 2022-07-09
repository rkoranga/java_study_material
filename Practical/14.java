//example to show Exception Handling

import java.util.Scanner;
class demo{
	public static void main(String args[]){
		
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		try{
			//Write the statement inside try block. 
			//where exception may occur.
			System.out.println(5/a);
		}
		
		//specify the type of exception inside catch statement.
		catch(ArithmeticException e){
			//Handle exception here
			System.out.println("divide by zero caught "+e);
		}
	}
}
