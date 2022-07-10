//create an add fun to add two numbers
import java.util.Scanner;
class demo{
        static void add(int x, int y){ //it should be static and inside demo class
		int sum=x+y;
		System.out.println("The sum is "+ sum);
	}



	public static void main(String ar[]){
			
		int a,b;
		Scanner scobj=new Scanner(System.in);

		a=scobj.nextInt();
		b=scobj.nextInt();
		add(a,b);
	}
}
				
		
