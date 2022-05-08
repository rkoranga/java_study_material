//static functions - static func can call only static var
//so all var are also static

class box{
	
	private static int l,w,h;
	
	public void set(int x, int y, int z){
		l=x;w=y;h=z;
	}
	
	static public void get(){
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
	}
	
}
class demo{
	public static void main(String ar[]){
		box obj1=new box();
		box obj2=new box();	
		obj1.set(1,2,3);
		obj2.set(4,5,6);
//		obj1.set(7,8,9);
		obj2.set(10,11,12);	
//		obj1.get();
		box.get();
//		obj2.get();
		
	}
}
