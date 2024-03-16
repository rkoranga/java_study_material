import java.util.Scanner;

class prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

            //int n= 248008;
            
            int num=0;
            int i=1;
            while (n>0) {
                int last=n%10;
                if(last==0)
                last=1;

                num=last*i+num;
                n=n/10;
                i=i*10;            
            }
            System.out.print(num);

    }    
}
