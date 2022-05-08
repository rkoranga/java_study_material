//when interface reference is used to call functions , then run time poly occurs.
//there is one interface and two classes. Both classes implement the interface.
//Reference can point to obj of any class. 
//When function is called using interface reference then runtime poly occurs.

interface myinterface{
    public void get();
    
}
//box class
class box implements myinterface{
    private int l,w,h;

    public void set(int x, int y , int z){
        l=x;w=y;h=z;
    }

    //get must be defined in box, it must be public
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);

    }
}
//student class also implements myinterface.
class student implements myinterface{
    private int rn, m1, m2;

    public void set(int x, int y , int z){
        rn=x;m1=y;m2=z;
    }
    public void get(){
        System.out.println(rn);
        System.out.println(m1);
        System.out.println(m2);

    }

}
class demo {
    public static void main(String args[]){

        //create objects of both classes.
        student obj1=new student();
        box obj2=new box();

        obj1.set(1,2,3);
        obj2.set(10,20,30);

        //create interface reference
        myinterface ref; 

        //point reference to student's obj
        ref=obj1;
        ref.get();//runtime polymorphism occurs
      
        //point reference to box's obj
        ref=obj2;
        ref.get();//runtime polymorphism occurs
    }
    
}
