import java.util.Scanner;
public class prog3 {
    
    public static void main(String[] args) {
        

        int n1, n2;
        Scanner sc= new Scanner(System.in);

        n1=sc.nextInt();
        n2=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
                sum1+=i;
            }
        }
        for(int i=1;i<=n2;i++)
        {
            if(n2%i==0){
                sum2+=i;
            }
        }

        if(sum1/n1==sum2/n2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }
}
