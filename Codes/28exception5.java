import java.util.Scanner;
//Exception inside a function
//Put the function inside a try catch block. 

class demo{
	public static void fun(int x){ 

		int ar[]={10,20};
		System.out.println(5/x);
		System.out.println(ar[x]);
		

	}

	public static void main(String args[]){
		
		int a;
		Scanner sc=new Scanner(System.in);

		a=sc.nextInt();
		
		try{
			fun(a);
		}
		catch(ArithmeticException e){
			System.out.println("divide by zero caught");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array exception caught");
		}
	}
}
		
		
