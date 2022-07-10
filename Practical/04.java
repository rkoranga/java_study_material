class box{
	private int l,w,h;
	
	box(int x,int y,int z){
		l=x;
		w=y;
		h=z;
	}
	
	void set(int x, int y, int z){
		l=x;
		w=y;
		h=z;
	}
	
	void get(){
		System.out.println(l);
		System.out.println(w);
		System.out.println(h);
	}
	
	void vol(){
		System.out.println(l*w*h);	
	}
}

class demo{
	public static void main(String ar[]){
		
		box obj1, obj2;
		obj1=new box(10,20,30);
		
		obj1.get();
		obj1.vol();
		
		
	}
}
