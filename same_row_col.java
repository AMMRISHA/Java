import  java.util.*;

class same_row_col{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows  and column:");
         int row = sc.nextInt();
         int col = sc.nextInt();

         //each row and colum contains equal number of stars
         System.out.println("Star pattern of any no. of row and colum with same star in each lines:\n ");
                    for(int i = 0;i<row;i++)

                    {
                                        for(int j = 0;j<col;j++)
                                        {

                                    
                                        System.out.print("*"+" ");
                                        }
                        System.out.println("\n");
                    }

    }

}