
import java.util.* ;

 public class Basic {
    public static void main(String[] args)
{
    //scan string using scanner class
    System.out.println("Enter your string:");
   Scanner sc = new Scanner(System.in);
   String name= sc.nextLine();
   System.out.println(name);

   //scan int and float  using scanner class
    System.out.println("Enter first number:");
    Scanner sc1 = new Scanner(System.in);

    int a =sc1.nextInt();
    System.out.println("Enter Second number:");
    float b= sc1.nextFloat();

    float sum = a+b;
    System.out.println("Sum is:");
    System.out.println(sum);


    ////////Conditional Statements //////////

    //if else

    if(a>20)
     System.out.println("You are adult");

     else{
        System.out.println("You are not adult");
     }


     //else if

     




   
}

}
