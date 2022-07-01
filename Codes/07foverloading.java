class box{
	private int l, w, h;
	
	public void set(int x){
		l=w=h=x;
	}
	public void set(int x, int y, int z){
		l=x;w=y;h=z;
	}
	public void get(){
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
	}
}
class demobox{
	public static void main(String ar[]){
		
		box obj1=new box();
		obj1.set(10);
		obj1.get();	
			
		box obj2=new  box();
		obj2.set(10,20,30);
		obj2.get();
	}
}
