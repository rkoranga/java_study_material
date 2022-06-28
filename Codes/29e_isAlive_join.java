//29e using isAlive() and join()

//isAlive is used to check if a thread is running or not
//join() waits for other thread to complete before moving onwards


//task class contains two different functions
class task{
	//thread1 obj will call this run function to print 1 to 100
	public void run() { 
		for(int i=0;i<100;i++){
			System.out.println("thread1:"+i+" ");
			
		}
	}
	
	//thread2 obj will call this run2 function to print a to z
	public void run2(){
		for(char c='a';c<'z';c++){
			System.out.println("thread2 : "+c);
		}
		
		
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
		obj_thread.start();
		
	}
	public void run() {
		
		//thread1 will call run function in task class
		obj_task.run();
		 
	}
	
	public void check(){
		//check whether thread1 is alive or not
		System.out.println("check thread1 is alive- "+obj_thread.isAlive());
	}
	
	public void call_join(){
		//wait for thread1 to finish before moving onwards
		try{
			obj_thread.join();
			
		}
		catch(InterruptedException e){
			
		}
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
		obj_thread.start();
		
	}
	public void run() {
		
		//call run2 function of task class
		obj_task.run2();
		
	}
	
	public void check(){
		//check thread2 is alive or not
		System.out.println("check thread2 is alive- "+obj_thread.isAlive());
	}
	
	public void call_join(){
		try{
			//wait for thread2 to finish before moving onwards
			obj_thread.join();
			
		}
		catch(InterruptedException e){
			
		}
	}
}


class demo{
	public static void main(String args[]){
		task obj=new task();//create a task obj
		thread1 obj1=new thread1(obj);//same task obj passed to both threads
		thread2 obj2=new thread2(obj);//same task obj passed to both threads
		
		//check if threads are alive or not
		System.out.println("after creating threads check whether they are alive or not");
		
		obj1.check();
		obj2.check();
		
		
		//wait for both threads to finish 
		//now main thread will wait for both threads to finish before moving onwards		
		obj2.call_join();
		obj1.call_join();
		
		
		//both threads have finished here. so now both threads should not be alive
		System.out.println("check after join whether they are alive or not");
		
		obj1.check();
		obj2.check();
		
		
	}
}


	
	
	
