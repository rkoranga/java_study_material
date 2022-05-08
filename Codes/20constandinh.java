class box{
	box(){
		System.out.println("box const called");
	}
}
class d1 extends box{
	d1(){
		System.out.println("d1 const called");
	}
}
class d2 extends d1{
	d2(){
		System.out.println("d2 const called");
	}
}
class demo{
	public static void main(String ar[]){
		box obj_b=new box();
		
		d1 obj_d1=new d1();
		
		d2 obj_d2=new d2();
	}
}
