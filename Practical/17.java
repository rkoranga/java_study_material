//29f producer and consumer problem

//there are two threads - producer and consumer
//producer will assign values 1 to 1000 to variable x
//consumer will print the values of x

//Both threads must run alternatively. 
class q{
	//shared variable n 
	int x;
	int turn;// to check 
	
	q(){
		turn='p';
	}

	synchronized public void set(int i) {

		while(turn=='c') { 
		
			try{
				wait();
			}
			catch(InterruptedException e){
				
			}
		
		
		}
			System.out.println("\n producer sets "+i+" ");		
			x=i;
			turn='c';
			notify();
			
	}
	
	synchronized public void get(){
			while(turn=='p') {
				
				try{
					wait();
				}
				catch(InterruptedException e){
				
				}

				
			}

		
				System.out.println("Consumer gets "+x+" ");
				turn='p';
				notify();
			
	}	
	
}

class thread1 extends Thread{
	Thread t;
	q obj_q;
	thread1(q po){
		t=new Thread(this);
		obj_q=po;
		t.start();
	}

	public void run(){
		for(int i=0;i<1000;i++){
	
			obj_q.set(i);
		}
	}
}

class thread2 extends Thread{
	Thread t;
	q obj_q;
	thread2(q po){
		t=new Thread(this);
		obj_q=po;
		t.start();
	}
	
	public void run(){
		for(int i=0;i<1000;i++){
	
			obj_q.get();
		}
	}
}

class demo{
	public static void main(String args[]){
		q obj=new q();
		thread1 obj1=new thread1(obj);
		thread2 obj2=new thread2(obj);
		
		for(int i=0;i<100;i++){
			System.out.print("main ");
		}
	}
}
		
	

		
