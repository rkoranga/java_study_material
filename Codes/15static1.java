//static var - can be accessed by static, non static fun
class box{
	private static String color="red";

	private int l,w,h;
	
	private static void fun(){
		System.out.println("go");
	}
	
	public void set(int x, int y, int z, String s){
		l=x;w=y;h=z;color=s;
		fun();
	}
	
	public void get(){
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(color);
	}
	
}
class demo{
	public static void main(String ar[]){
		box obj1=new box();	
		box obj2=new box();
		obj1.get();
		obj2.get();
		obj1.set(1,2,3,"blue");
		obj1.get();
		obj2.set(4,5,6,"green");
		obj2.get();
		obj1.get();
		
		//box.fun();
	}
}	
