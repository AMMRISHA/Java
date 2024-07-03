import  java.util.*;


class calculator{
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
     System.out.println("Click 1 to add numbers \n click 2 to subtract two numbers");
     int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("The sum is =");
                System.out.println(a+b);
                break;
            
            case 2:
                System.out.println("The Difference is =");
                System.out.println(a-b);
                break;
            default:
                System.out.println("Invalid Credentials");
        }
        
    }
}