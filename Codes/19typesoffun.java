class box{
	protected int l,w,h;
	public void set(int x, int y, int z){
		l=x;w=y;h=z;
	}
	public void get(){
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println("get in box class");
	}
	public void volume(){
		System.out.println("vol= "+l*w*h);
	}

}
class d1 extends box{
	protected int wt;
	public void set(int x, int y, int z, int u){
		l=x;w=y;h=z;wt=u;
	}
	public void get(){
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(wt);
		System.out.println("get in d1 class ");
	}
	public void density(){
		System.out.println( "den= "+ (float)wt/(l*w*h) );
	}
	
}
class d2 extends d1{
	protected String col;
	public void set(int x, int y, int z, int u, String s){
		l=x;w=y;h=z;wt=u;col=s;
	}
	public void get(){
		System.out.println("get with 5 parameters called");
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(wt);
		System.out.println(col);
		
	}
	public void blackbox(){
		System.out.println("black color is assigned to box");
		col="black";
	}
}
	
class demo{
	public static void main(String ar[]){
		box obj_b= new box();
		d1 obj_d1= new d1();
		d2 obj_d2= new d2();
		
		//calling overloaded fun for d2
		obj_d2.set(1,2,3,4,"red");
		obj_d2.set(4,5,6,7);
		obj_d2.set(8,9,10);

		//calling inherited fun for d2
		obj_d2.volume();
		obj_d2.density();
		obj_d2.blackbox();	
		
		//calling overridden fun for d2 object
		//d2's get will be called //// inherited get are hidden, can't be called
		obj_d2.get();

	}
}
