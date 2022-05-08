import java.util.*;
class scan{

	public static void main(String arr[]){
		int a=10;
		Scanner inobj=new Scanner(System.in);
		int ar[]=new int[10];
		for(int i =0;i<10;i++){
			if(inobj.hasNextInt()){
				ar[i]=inobj.nextInt();
			}
			else{
				System.out.println("Please enter int");
				
				String aa=inobj.next();//remove that element from buffer
				--i;// to input same element again
			}
		}
		for(int i=0;i<10;i++){
			System.out.println(ar[i]);
		}					
	}


}
