import  java.util.*;
class sum_natural_nm{
    public static void main(String[] args) {
        System.out.println("Enter the number of terms:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum =0;
         System.out.println("The Sum of the "+n+" natural numbers is:" +" ");
        for(int i =1;i<=n;i++)
        {
            sum = sum + i;
           
        }
         System.out.println(sum);
    }

}
 