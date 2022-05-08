//static variable
class box{
	public static String color;//uninitialized and private
	private int l,w,h;
	
	void set(int x,int y, int z){
		l=x;w=y;h=z;
	}
	void get(){
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
		
		box.color="blue";
		
		obj1.get();
		obj2.get();
	}
}
