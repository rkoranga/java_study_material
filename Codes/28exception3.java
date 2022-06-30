import java.util.Scanner;
//program to demonstrate throw
//throw is used to manually generate an exception
class demo{
	public static void main(String args[]){
		//Suppose we want to throw exception when attempting divide by 1
		int a;
		Scanner sc=new Scanner(System.in);

		a=sc.nextInt();
		try{
			if(a==1){
				throw new ArithmeticException("divide by 1");
			}
			//divide by zero will be automatically thrown
			System.out.println(5/a);
		}
		
		catch(ArithmeticException e){
			System.out.println("Divide by 0 or 1 caught");
		}
	}


}
