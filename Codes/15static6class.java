//static inner class
class box{
	
	static class innerbox{
		static public int l,w,h;
	
	
	}
	 void set(int x, int y, int z){
			innerbox.l=x;innerbox.w=y;innerbox.h=z;
	}
	
	void get(){

			System.out.println(innerbox.l);
			System.out.println(innerbox.w);
			System.out.println(innerbox.h);
		}
}

class demo{
	public static void main(String ar[]){
		box obj1=new box();
//		obj1.get();
//		box.innerbox obj2=new box.innerbox();	
//		obj2.set(1,2,3,"red");	
//		obj2.get();
		obj1.set(1,2,3);
		obj1.get();
	}
}	
