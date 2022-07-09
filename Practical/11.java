//constructor chaining with parameterized constructor
//parameterized constructors are created
//When base class has a parameterized constructor, derived class constructor must call super() 
class box {
	protected int l, w, h;
	
	//parameterized Constructor
	box(int x, int y, int z){
		l=x;
		w=y;
		h=z;
	}
	
	public void set(int x, int y, int z) {
		l=x;
		w=y;
		h=z;
	}
	
	public void get() {
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		
	}

}

class d1 extends box{
	protected int wt;
	
	//parameterized constructor in present in d1
	//d1 must call super because base class box has a parameterized constructor 
	d1(int x, int y, int z, int u){
		super(x, y, z);//call and pass values to base constructor box()
		wt=u;//initialize own variable

	}	


	public void set(int x, int y, int z, int u) {
		l=x;
		w=y;
		h=z;
		wt=u;
	}
	
	public void get() {
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(wt);
		
	}
	
	
}

class d2 extends d1{
	protected String col;
	
	//parameterized is present in d2 
	//d2() must call super(), because base class has a parameterized constructor 
	d2(int x, int y, int z, int u, String s){
		super(x,y,z,u);//call and pass values to d1() constructor
		col=s;//initialize own variable
	}
	public void set(int x, int y, int z, int u, String s) {
		l=x;
		w=y;
		h=z;
		wt=u;
		col=s;
	}
	
	public void get() {
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(wt);
		System.out.println(col);
		
	}
	
	
}

class demo{
	
	public static void main(String args[]) {
		
		
		//When obj of d2 is created,parameterized constructor d2() is called.
		//d2() calls d1() through super()
		//d1() calls box() through super()
		//order: top to bottom

		d2 obj_d2=new d2(10,20,30,40,"red");//all constr will be called
		obj_d2.get();
	}
}
