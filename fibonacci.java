import java.util.*;

class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max length of thse fibonacci series:");
        int n = sc.nextInt();
        int f0=0, f1=1;
         System.out.print(f0 +" "+f1);
        for(int i = 0; i<=n;i++)
        {
                     
             int f2=f0+f1;
             System.out.print(" "+f2);
            f0=f1;
            f1=f2;

        }
      
    }
}