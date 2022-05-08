class box{

	innerbox obj=new innerbox();
//	private int l,w,h;
		public void set(int x, int y, int z){
//			innerbox obj=new innerbox();
			obj.l=x;obj.w=y;obj.h=z;
	//		color =s;
		}
		public void get(){
//			innerbox obj=new innerbox();
			System.out.println(obj.l);		
			System.out.println(obj.w);
			System.out.println(obj.h);
	
		}


class innerbox{
//		private String color;
		private int l,w,h;


	}
//	innerbox obj=new innerbox();
//	obj.set(1,2,3,"red"); //error functions can be defined, not called


}
class demo{
	public static void main(String arg[]){
//		box.innerbox obj1=new box.innerbox();
		box obj1=new box();
//		obj1.obj.set(1,2,3,"red");
//		obj1.obj.get();	
		obj1.set(1,2,3);
		obj1.get();
	}
}
