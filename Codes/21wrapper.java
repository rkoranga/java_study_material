class demo{
	public static void main(String ar[]){
		
		int a=10,b=20;
		
		System.out.println("a,b before swap");
		System.out.println(a);
		System.out.println(b);

		swap(a,b);
		
		System.out.println("a, b after swap");
		System.out.println(a);
		System.out.println(b);
		
		Integer obj1= a;

		Integer obj2= b;

		obj1+=100;
		obj2+=100;	
		System.out.println("obj1, obj2 before swap");
		System.out.println(obj1);
		System.out.println(obj2);
		
		swap1(obj1,obj2);
		
		System.out.println("obj1, obj2 after swap");

		System.out.println(obj1);
		System.out.println(obj2);
		
	}

	public static void swap(int x, int y){
		System.out.println("swap");
		int temp;
		temp=x;
		x=y;
		y=temp;
	}

	public static void swap1(Integer ob1, Integer ob2){
		System.out.println("swap1");
		Integer temp;
		temp=ob1;
		ob1=ob2;
		ob2=temp;
	}

}
