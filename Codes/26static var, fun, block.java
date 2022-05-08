class box {
    protected static int l,w,h;

    static{
        l=0;w=0;h=0;
        System.out.println("static block is run");
    }
    public static void set(int x, int y, int z){
        l=x;w=y;h=z;
    }

    public static void get(){
        System.out.println(l);
        System.out.println(w);
        System.out.println(h);
    }
    
}
class demo{
    public static void main(String args[]){
        box.set(2,3,4);
        box.get();
    }
}