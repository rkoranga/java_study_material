//the aim is to swap objects of the box class. 
//this involves object passing.
class box{
	private int l, w, h;
	
	void set(int x, int y, int z){
		l=x;w=y;h=z;
	}
	
	void get(){
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
	}
		
	void swapobj(box po1, box po2){
		int t; //swap all three var of po1 and po2
		t=po1.l; 
		po1.l=po2.l;
		po2.l=t;
	
		t=po1.w;
		po1.w=po2.w;
		po2.w=t;
		
		t=po1.h;
		po1.h=po2.h;
		po2.h=t;
	}
	
}

class demobox{
	public static void main(String ar[]){
		
		box obj1=new box();
		box obj2=new box();	
	
		obj1.set(1,2,3);	
		obj2.set(4,5,6);	
		
		obj1.swapobj(obj1,obj2);//this works like call by reference
		//when objects are passed, they are passed by reference.
		
		System.out.println("object are swapped");
		obj1.get();
		obj2.get();
	}
}	
