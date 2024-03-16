import java.util.Scanner;
import java.util.Arrays;
class prog5{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the Elements");
        int ar[]=new int[n];

        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<ar.length-1;i++)
        {
            if(i%2==0  )
            {
                if(ar[i]>ar[i+1])
                {
                    int temp=ar[i];
                    ar[i ]=ar[i+1];
                    ar[i+1]=temp;
                }
            }    
            else{  

                if(ar[i]<ar[i+1])
                {
                    int temp=ar[i];
                    ar[i ]=ar[i+1];
                    ar[i+1]=temp;
                }
            }

            
        }

        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }



    }
}