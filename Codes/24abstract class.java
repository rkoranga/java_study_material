//abstract class are classes with atleast one abstract functions.
//it can have abstract as well as concrete functions.
//abstract classes are meant to be inherited.
//abstract classes are used to provide abstraction. The derived class must define the abstract functions in abstract class

//show the use of abstract, concrete, final, static, constructor in abstract class

abstract class base{

    //abstract function in base
    abstract public void get(); // it will not be defined here. box class must define it

    //concrete(defined) function in base. It is declared as final, static
    final public static void fun(){
        System.out.println("Stati Fun called");
    }

    //constructor of abstract class
    base(){
        System.out.println("constructor of abstract class called");
    }

}

class box extends base{

    protected int l,w,h;

    public void set(int x, int y, int z){
        l=x;w=y;h=z;
    }
    //since box extends base, it must define this function.
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
}

class demo{
    public static void main( String args[]){
        //create an obj of box class. Obj of base class can't be created
        box obj=new box();//when obj of derived class is created base constructor is called because of constructor chaining.
        obj.set(1,2,3);
        obj.get();

        //fun is static function. 
        base.fun();


    }
}