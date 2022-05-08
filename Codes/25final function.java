// a final function can't be overridden

// there are two functions in base. fun1 is normal, fun2 is final
//derived class can;t override fun2
class base {

    public void fun1(){
        System.out.println("fun1 in base");
    }

    final public void fun2(){
        System.out.println("fun2 in base");

    }
    
}

class derived extends base{
    public void fun1(){
        System.out.println("fun1 in derived");
        System.out.println("fun1 is overridden");
    }
    //fun2 can't be overridden in derived
    

}
class demo{
    public static void main(String args[]){
        //create base class obj
        base obj1=new base();
        
        //base obj can call both functions
        obj1.fun1();
        obj1.fun2();

        //create derived class object
        derived obj2=new derived();

        //derived obj can call only fun1
        obj2.fun1();
        

    }
}