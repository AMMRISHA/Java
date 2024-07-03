import java.util.*;


class number_table{
    public static void main(String[] args) {

        System.out.println("Enter the table multiplicant:");
        Scanner sc = new Scanner(System.in);

        int multiplicant = sc.nextInt();


        for(int i =1 ; i<=10;i++)
        {
          int  result=multiplicant * i;

          System.out.println(multiplicant+" x " +i+ " = "+result);
        }

    }
}