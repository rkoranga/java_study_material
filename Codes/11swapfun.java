//use swap fun to swap two variables.
//this swap fun is inside demo class.
import java.util.Scanner;
class demoswap{
	static void swap(int x, int y){//it shud be inside demo class and above main fun
		int t; 
		t=x;
		x=y;
		y=t;
	}


	public static void main(String ar[]){
		int a=10,b=20;
		Scanner scobj=new Scanner(System.in);
		
		
		swap(a,b);//it is useless because it is CBV;
		
		System.out.println(a);
		System.out.println(b);
	}

}		
