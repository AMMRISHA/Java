//WAP to find the prime numbers from 1 to 100 using loops

import  java.util.*;

class loop{
    public static void main(String[] args) {
        int flag=0;
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter for checking the prime number");
        int n = sc.nextInt();


        if(n==0 || n==1)
        {
            System.out.println(n+"Not prime");
        }
        for (int i=2;i<10;i++)
        {

                if((n%i)==0)
                {
                    flag=1;
                }
             
           
        }
        if(flag ==0)
        {
            System.out.println(n+" is Prime");
        }
        else{
            System.err.println(n+"is not prime");
        }

    }
}