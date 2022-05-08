//arrays are called by ref
class demo{
	
	public static void incby10(int ar[]){
		
		for(int i=0;i<ar.length;i++){
			ar[i]+=10;
		}
	}

	public static void incby10(int x, int y){
		x+=10; y+=10;
	}
	
	public static void main(String arr[]){
		int a=10, b=20;
		incby10(a,b);
		System.out.println(a);	
		System.out.println(b);
		
		int ar[]=new int[10];
		for(int i=0;i<ar.length;i++){
			ar[i]=i;
		}
		incby10(ar);
		
		System.out.println("print arrays");
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
		
	}
}

