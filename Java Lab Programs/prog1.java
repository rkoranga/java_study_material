class prog1{
    public static void main(String[] ar) {
        
        if(ar.length!=3){
            System.out.println("enter correct number of arguments");
            return;
        }
        String name=ar[0];
        String course=ar[1];
        int rn= Integer.parseInt(ar[2]);

        System.out.println("Name= "+name+"  Course= "+course+"  Roll number= "+rn);
    }
}