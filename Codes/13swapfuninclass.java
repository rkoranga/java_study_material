//swap fun is inside a separate class. it is not inside demo class.
//we need to swap variables of an object. (we donot need to swap object).
class swap{
	private	int a,b;
	
        public void set(int x, int y){
		a=x;b=y;
	}
	
	public void get(){
		System.out.println(a);
		System.out.println(b);
	}
	
	public void swap( ){
		int t;
		t=a;
		a=b;
		b=t;

	}
}
class demoswap{
	public static void main(String ar[]){
		
	swap obj1=new swap();
	swap obj2=new swap();
	
	obj1.set(1,2);
	obj1.get();
	obj1.swap(); // swap fun without any values.
	System.out.println("object variables are swapped");
	obj1.get();

	}
}
	
