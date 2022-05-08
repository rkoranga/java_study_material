class box{
	protected int l,w,h;
	
	box(int x, int y, int z){
		System.out.println("box c called");
		l=x;w=y;h=z;
	}
}
class d1 extends box{
	protected int wt;
	d1(){ 
		super(1,2,3);
		System.out.println("d1 c called");
	}
}
class d2 extends d1{
	protected String col;

	d2(int x, int y, int z, int u, String s){
		super();
		System.out.println("d2 c called");
	}
}
class demo{
	public static void main(String ar[]){
		box obj_b=new box(1,2,3);
		d2 obj_d2=new d2(1,2,3,4,"red");
	}
}
