import  java.util.*;

class All_pattern{
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

    //triangle pattern
                System.out.println("Triangular star pattern :\n");

                    for(int i = 0;i<row;i++)

                        {
                                        for(int j = 0;j<=i;j++)
                                        {

                                    
                                        System.out.print("*"+" ");
                                        }
                            System.out.println("\n");
                        }


                     //upper triangle

                     System.out.println("Upper Triangular star pattern using iterate the row\n");
                        for(int i = row-1;i>=0;i--)

                        {
                                    for(int j=0;j<=i;j++)
                                    {

                                        System.out.print("*"+" ");
                                    }
                            System.out.println("\n");
                        }

                        //upper triangle
                        System.out.println("Upper Triangular star pattern using iterate the column\n");
                        for(int i = 0;i<=row;i++)

                        {
                                    for(int j=0;j<=row-i;j++)
                                    {

                                        System.out.print("*"+" ");
                                    }
                            System.out.println("\n");
                        }

                    //****
                    //*  *
                    //****



                    for(int i = 0;i<=row;i++)
                    {
                                if(i==0 || i==row)
                                {
                                    for (int j=0;j<=row;j++)
                                    {
                                        System.out.print("*"+" ");
                                    }
                                    System.out.print("\n");
                                }
                                else{
                                    for (int j=0;j<=row;j++)
                                    {
                                        if(j==0 || j==row)
                                        {
                                            System.out.print("*"+" ");
                                        }
                                        else
                                        {
                                            System.out.print(" "+" ");
                                        }
                                        
                                        
                                    }
                                    System.out.print("\n");
                                }
                        
                    }

                   
               //        * 
               //      * * 
               //    * * * 
               //  * * * * 
               //* * * * * 

               for(int i=0;i<=row;i++)
               {
                    for(int k=0;k<=row-i;k++)
                        {
                            System.out.print(" "+" ");
                        }
                    for(int j=0;j<=i;j++)
                    {
                          System.out.print("*"+" ");
                    }
                     System.out.print("\n");
               }


    //Java Program to Print Pyramid Number Pattern

    //1
    //12
    //123
    //1234


                for(int i=1;i<=row;i++)
                {

                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                     System.out.println("\n");
                }



             //1234
             //123
             //12
             //1

                for(int i=0;i<row;i++)
                {
                    for(int j=1;j<=row-i;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println("\n");
                }    



            //*
            //**
            //***
            //**
            //*   

            for(int i=0;i<row;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.print("\n");
            } 
             for(int i=1;i<=row;i++)
            {
                for(int j=1;j<=row-i;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.print("\n");
            } 


            //1
            //2 3
            //4 5 6
            //7 8 9 10

                int number=1;
                for(int i=1;i<=row;i++)
                {
                for(int j=1;j<=i;j++)
                {
                    
                            System.out.print(number+" ");
                            number ++;
                        
                        
                } 
                System.out.print("\n");
                }


            //   1
            // 1 2 3
            //1 2 3 4 5

                for(int i=0;i<=row;i++)
                {
                    for(int space=0;space<row-i;space++)
                        {
                            System.out.print(" "+" ");
                        }
                    for(int valueloop=1;valueloop<=2*i-1 ; valueloop++)
                    {
                        
                        System.out.print(valueloop+" ");
                    }
                    System.out.println("\n");
                }



                

        }

        }



   



