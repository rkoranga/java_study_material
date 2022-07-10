//input one int and then one line from user
import java.util.*;
class demo{
	public static void main(String ar[]){
		
		int a;
		char c;
		String s1;

		Scanner scobj=new Scanner(System.in);
		
		a=scobj.nextInt();
		System.out.println(a);
		
		c=scobj.next().charAt(0);
		System.out.println(c);

		s1=scobj.nextLine();
		s1=scobj.nextLine();//to remove new line char
		System.out.println(s1);
		

		//a=scobj.nextInt();
		//System.out.println(a);

	}
}
