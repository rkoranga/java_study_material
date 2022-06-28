//29b- Thread Synchronization
//thread synchronization is done using synchronization block


//two threads are created. Each increment the value of x 10 times.
//value of x is shared. The expected output is 20
//However , if the synchronized block is removed then the actual ouptut may be less than 20.


//this class contains the function which is run by the thread
class task{
	//x is a shared variable.
	int x;
	
	task(){
		//initialize x
		x=0;
	}

	//thread1 obj will call this run function
	 public void run() { 
	 //increment the value of x 10 times
		for(int i=0;i<10;i++){
			System.out.print("Child: "+i+" ");
			x++;
			
		}
		System.out.println("x is "+x);
	}

	
	
}


//create thread1 to define one type of thread.
class thread1 extends Thread{
	//create task and Thread obj
	Thread obj_thread;
	task obj_task;
	
	
	thread1(task obj_task){
		//initialize task obj
		this.obj_task=obj_task;
		
		//initialize thread obj and call start fun
		obj_thread=new Thread(this);
		obj_thread.start();
		
	}
	public void run() {
		
		//****** the fun is called inside a synchronized block. So correct output is printed i.e x=20
		synchronized(obj_task){
			obj_task.run();
		}
		
		//**if synchronized block is removed and simply fun is called then output may be less than 20
		//to test - comment the last three statements and uncomment the next statement then see the output
		//obj_task.run(); //no synchronized block.
		
		 
	}
}



class demo{
	public static void main(String args[]){
		task obj=new task();//create a task obj
		thread1 obj1=new thread1(obj);//same task obj passed to both threads
		thread1 obj2=new thread1(obj);//same task obj passed to both threads
		
		
	}
}

