import java.util.Scanner;

//Nested try catch statements
//Rethrowing an exception - exception are rethrown when nested try catch are used. inner catch can rethrow the exception.

class demo{
	public static void main(String args[]){

		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int ar[]={10,20};

		try{
			//divide by zero can occur in outer try block
			System.out.println(5/a);
			try{
				//array index out of bounds can occur in inner try
				ar[a]=100;
			}
			//Inner catch handles array exception and rethrows it
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Array Index exception caught by inner catch");
				//rethrow the exception
				throw new ArrayIndexOutOfBoundsException("array index exception");
			}

		}

		//outer catch again handles the array exception
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index caught by outer catch");
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0 : caught ");
		}
	}
}

		
			
			
			
				

