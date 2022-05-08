//super keyword is used when base and derived class has variable or functions with same name.
//super is used to access members of base class with same name
//set function has same name in all classes. so set function of base class can be called by using super.set()
class box {
	protected int l, w, h;
	
	
	//set in box class
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
	

	//set in d1 class.
	//To call set function of base class use super keyword
	public void set(int x, int y, int z, int u) {
		super.set(x,y,z);//call set function of box class
		wt=u;//initialize own variables only
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
	
	//set in d2 class
	public void set(int x, int y, int z, int u, String s) {
		super.set(x,y,z,u);//use super to call set in d1 class 
		col=s;//initialize own variable
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
		
		

		d2 obj_d2=new d2();
		obj_d2.set(5,6,7,8,"red");// all constructor will be called
		obj_d2.get();
	}
}
