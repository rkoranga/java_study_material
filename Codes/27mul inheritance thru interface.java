//A class can implement multiple interfaces. 
//Two interfaces are created interface1 and interface2
//myclass implements both interfaces.

//Thus multiple inheritance is through interfaces.

interface interface1{
    public void fun();
}

interface interface2{
    public void fun();
}

class myclass implements interface1 , interface2 {
    //myclass must implement fun()
    
    public void fun(){
        System.out.println("fun is called");
    }
    
}

class demo{
    public static void main(String args[]){
        myclass obj=new myclass();
        obj.fun();
    }
}
