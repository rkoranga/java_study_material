//constructor chaining with non parameterized constructor
//Non parameterized constructors are created

class box {
	protected int l, w, h;
	
	//Non parameterized Constructor
	box(){
		System.out.println("box called");
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
	
	//non param constructor in d1
	//d1 will automatically call box()
	d1(){
		System.out.println("d1 called");
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
	
	//non parameterized in d2
	//d2 will automatically call d1()
	d2(){
		System.out.println("d2 called");
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
		
		
		//When obj of d2 is created,non parameterized constructor d2() is called.
		//d2() calls d1()
		//d1() calls box()
		//order: top to bottom

		d2 obj_d2=new d2();//all constr will be called
		obj_d2.set(1,2,3,4,"red");
		obj_d2.get();
	}
}
