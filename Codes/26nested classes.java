//class can be nested. innerclass is defined inside outerclass.


class outerclass{
    public void outerfun(){
        System.out.println("outer fun is run");
    }
    
    //this is inner class
    class innerclass{
        public void innerfun(){
            System.out.println("inner fun is run");
        }
    }
}
class demo{
    public static void main(String args[]){
        //create outer obje
        outerclass obj1=new outerclass();

        //to create innerclass obj, outerclass object must be used
        //innerclass name should be prefixed with outerclass
        outerclass.innerclass obj2=obj1.new innerclass();

        //call functions using outer obj
        obj1.outerfun();;

        //call functions using inner obj
        obj2.innerfun();



    }
}
