import java.util.*;


public  class oddeven{
    public static void main(String[] args) {
        //takes inputs
        Scanner sc =new Scanner(System.in);

        int a ;
        System.out.println("Enter the number");
        a= sc.nextInt();

        if(a%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
}