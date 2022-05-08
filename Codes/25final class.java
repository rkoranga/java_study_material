//a final class can't be inherited

final class base {
    public void fun(){
        System.out.println("fun in base");
    }
}

class demo{
    public static void main(String args[]){

        base obj=new base();
        obj.fun();
    }
}
