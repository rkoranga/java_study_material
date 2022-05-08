//points:

//There are three types of function. 
//set() is overloaded, get() is overridden, 

//combination of base reference and overridden function allows to implement runtime polymorphism

//base reference can point to derived class object.

//base reference can call only those functions which are inside base part
class box {
	protected int l, w, h;

	//set fun in box class. It has 3 parameters
	public void set(int x, int y, int z) {
		l=x;
		w=y;
		h=z;
	}
	
	// get in box prints 3 parameters
	public void get() {
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		
	}
    public void volume(){
        System.out.println("l*w*h");
    }

}

class d1 extends box{
	protected int wt;
		
	//set in d1 has 4 parameters.
	//set is overloaded in d1 class
   	public void set(int x, int y, int z, int u) {
		l=x;
		w=y;
		h=z;
		wt=u;
	}
	
	//get is overridden in d1 class.
	//it prints 4 parameters.
	public void get() {
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(wt);
		
	}
    public void density(){
        System.out.println(wt*1.0/l*w*h*1.0);
    }
	
	
}

class d2 extends d1{
	protected String col;
		
	//set is overloaded.
	//It has 5 parameters.
	public void set(int x, int y, int z, int u, String s) {
		l=x;
		w=y;
		h=z;
		wt=u;
		col=s;
	}
	
	//get is overridden
	//it prints 5 variables.
	public void get() {
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
		System.out.println(wt);
		System.out.println(col);
		
	}
	public void blackbox(){
        col="black";
    }
	
}

class demo{
	
	public static void main(String args[]) {
		
		//create obj of derived class
		d2 obj_d2=new d2();
		obj_d2.set(1,2,3,4,"red");
	
		//create a base class reference
        box ref;
		
		//point reference to the derived object
        ref=obj_d2;
		
		//call overridden function using base class reference.
        ref.get();
		//** the function call is resolved at runtime. so Runtime polymorphism occurs here.
		
		
        
	}
}
