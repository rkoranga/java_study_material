class box{
	int l;
	int w;
	int h;
}

class demobox{
	public static void main(String arg[]){
		box obj1;
		obj1 = new box();
		
		obj1.l=10;
		obj1.w=20;
		obj1.h=30;
		
		System.out.println(obj1.l);
		System.out.println(obj1.w);
		System.out.println(obj1.h);

		int vol=obj1.l*obj1.w*obj1.h;

		System.out.println("vol is " + vol );
	}
}




		
