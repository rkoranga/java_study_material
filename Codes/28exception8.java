//Program to demonstrate user defined Exception in java

//create a class which extends Exception
class myexception extends Exception{

	//create a variable to store error code
	int code;
	
	//constructor to initialize code
	myexception(int x){
		code=x;
	}

}

class demo{
	public static void main(String args[]){
	
		try{	
			int a=10;
			if(a==10){
			//throw user defined exception and specify error code eg.55
				throw new myexception(55);
			}	
		}
		
		catch(myexception e){
			//handle the exception and print error code
			System.out.println("Error code is : "+e.code);
		}

	}
}
