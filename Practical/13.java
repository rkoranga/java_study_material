// how to create and use an interface

interface myinterface{
    //interface contains undefined functions
    public void set(int x, int y , int z);
    public void get();
}

class box implements myinterface{

    //class must implement/define set and get.
    private int l,w,h;

    //set must be public
    public void set(int x, int y , int z){
        l=x;w=y;h=z;
    }
    //get must be public
    public void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);

    }

    public void vol(){
        System.out.println(l*w*h);
    }
    
}

class demo{
    public static void main(String args[]){
        //create obj of class and call set(),get()
        box obj=new box();
        obj.set(1,2,3);
        obj.get();
    }
}
