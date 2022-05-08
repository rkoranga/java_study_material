import java.util.Scanner;
class demooverloading{
	static void add(int x, int y){
		System.out.println(x+y);
	}

	static void add(int x, int y, int z){
		System.out.println(x+y+z);
	}

	public static void main(String ar[]){
		
		int a,b,c;
		Scanner scobj=new Scanner(System.in);
		a=scobj.nextInt();
		b=scobj.nextInt();
		c=scobj.nextInt();	
		add(a,b);
		add(a,b,c);
	}
}		
