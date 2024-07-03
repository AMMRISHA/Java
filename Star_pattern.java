import java.util.*;
public class Star_pattern{
    public static void main(String args[]){
        int n = 5;
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        // Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i= 1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}