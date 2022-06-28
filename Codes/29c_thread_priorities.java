//29c Thread priorities
//thread priorities can be changed using setPriority() method

//two threads are created - thread1 will increment x, thread2 will increment y
//thread1 has low priority than thread2 , so output of x will be less than y

//task class contains two different var and fun
//thread1 will inc x, thread2 will inc y

class task{
	
	
	int x=0,y=0;
	
	//threads will run until flag is true
	volatile boolean flag=true;
	
	//thread1 will call this fun and increment x
	public void run() { 
		while(flag==true){
			x++;
		}
	}
	
		
	//thread2 obj will call this run2 function and increment y
	public void run2(){
		while(flag==true){
			y++;
		}
		
	}
	
	//to stop both threads set flag =false
	public void stop(){
		System.out.println("x= "+x+" y= "+y);//before stopping print the value of x and y
		flag=false;
	}
}


//create thread1 to define one type of thread.
class thread1 extends Thread{
	//create thread obj and task obj
	Thread obj_thread;
	task obj_task;
	
	thread1(task obj_task){
		//initialize task obj
		this.obj_task=obj_task;
		
		//create thread obj and call start()
		obj_thread=new Thread(this);
		//for thread1 , thread priority is set less than normal priority. so it will run less duration
		obj_thread.setPriority(Thread.NORM_PRIORITY - 2);
		obj_thread.start();
		
	}
	public void run() {
		
		//thread1 will call run function in task class
		obj_task.run();
	}
	
	public void finish(){
		//call the stop function to stop this thread
		obj_task.stop();
	}
	
}

//create thread2 to define other type of thread.
class thread2 extends Thread{
	//create thread and task obj
	Thread obj_thread;
	task obj_task;
	
	
	thread2(task obj_task){
		//initialize task obj
		this.obj_task=obj_task;
		
		//initialize thread obj and call start fun
		obj_thread=new Thread(this);
		//priority of thread2 is set higher than normal, so it will run for more duration
		obj_thread.setPriority(Thread.NORM_PRIORITY+2);
		obj_thread.start();
		
	}
	public void run() {
		
		//call run2 function of task class
		obj_task.run2();
		
	}
	
	public void finish(){
		obj_task.stop();
	}
}


class demo{
	public static void main(String args[]){
		task obj=new task();//create a task obj
		thread1 obj1=new thread1(obj);//same task obj passed to both threads
		thread2 obj2=new thread2(obj);//same task obj passed to both threads
		
		//stop both threads
		obj1.finish();
		obj2.finish();
		
		//In output , the value of x will be much lower than value of y, because thread1 has lower priority than thread2.
	}
}


	
	
	
