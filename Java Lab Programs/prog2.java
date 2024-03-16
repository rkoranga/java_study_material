import java.util.Scanner;

class prog2   {

    public static void main(String ar[]){
        System.out.println("enter choice");

        Scanner sc=new Scanner(System.in);
        String s="hello world";
        System.out.println(s.length);

        int choice=sc.nextInt();
        double p,r,n;
        double a;
        switch(choice){
            case 1:
            System.out.println("Enter p r n");
            p=sc.nextInt();
            r=sc.nextInt();
            n=sc.nextInt();
            a=p*(1+r/100)*n;
            System.out.println("maturity amount=" +a);
            break;

            case 2:
            System.out.println("Enter p r n");
            p=sc.nextInt();
            r=sc.nextInt();
            n=sc.nextInt();
            a=p*n+p*n*(n+1)/2*r/100*1/12;
            System.out.println("maturity amount=" +a);


            
        }
    }

    
}
