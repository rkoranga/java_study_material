//when innerclass is declared as static , it is called static class
//static keyword can only be used with an inner class. It can't be used with an outer class
//class can be nested. innerclass is defined inside outerclass.

//create an outer class and a static innerclass
//create one fun in both classes.
//create obj of both classes and call these functions.


class outerclass{
    public void outerfun(){
        System.out.println("outer fun is run");
    }
    
    //this is inner class
    //It is declared as static. So it becomes static inner class
    static class  innerclass{
        public void innerfun(){
            System.out.println("inner fun is run in static class");
        }
    }
}
class demo{
    public static void main(String args[]){
        //create outer obje
        outerclass obj1=new outerclass();

        //inner class is static. So its obj can be created without using outerclass object.
        //inner class name should be prefixed with outerclass name
        outerclass.innerclass obj2=new outerclass.innerclass();

        //call functions using outer obj
        obj1.outerfun();;

        //call functions using inner obj
        obj2.innerfun();



    }
}
