import java.util.*;

class demo{
	public static void main(String ar[]){
		
		ArrayList<Integer> al=new ArrayList<Integer> ();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		al.remove(1);
		al.remove(Integer.valueOf(10) );
		
		System.out.println(al);
		
	}
}