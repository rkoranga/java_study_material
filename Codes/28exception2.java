import java.util.ArrayList;
//Handling multiple exceptions
//how to handle divide by zero and array index out of bounds exception

import java.util.Scanner;
class demo{
	public static void main(String args[]){
		
		int a;
		int ar[]={10,20};

		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
	
		try{
			//There may be two exceptions.
			//if a is 0 then arithmeticException will occur here	
			System.out.println(5/a);
			//if a is greater than 1 then Arrayindexoutofbounds will occur
			ar[a]=100;

		}
		//Two catch blocks are required to handle arithmeticException and arrayindexoutofbounds exception.
		

		
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception caught");
		}

		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds caught");
		}
		//This must be placed at the last. 
		//otherwise error due to unreachable code
		catch(Exception e){
			System.out.println("Exception caught");
		}
	}

}
			

