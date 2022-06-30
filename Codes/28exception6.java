import java.util.Scanner;
//Exception inside functions 
//In this case , function throws two types of exceptions. 
//ArithmeticException is unchecked exception so it may not be specified by throws
//IllegalAccessException is checked exception so it must be specified by function by throws statement.

class demo{

	public static void fun(int x)
	throws IllegalAccessException{
		if(x==0){
			//This is unchecked exception. So it may not be specified in the throws statement
			throw new ArithmeticException("msg");
		}
		if(x==1){
			//this is checked exception. so it must be specified in the throws statement.
			throw new IllegalAccessException("msg");
		}

	}
	public static void main(String args[]){

		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();	
		try{
			fun(a);
		}
		
		catch(ArithmeticException e){
			System.out.println("arithmetic exception caught");
		}
		
		catch(IllegalAccessException e){
			System.out.println("Illegal access exception caught");
		}
	}
}

				
