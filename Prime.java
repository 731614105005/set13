# set13
 import java.io.*;
 import java.util.*;
 public class Prime
 {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a,b,count=0;
     a=n/2;
     for(int i=2;i<=a;i++)
     {
       if(n%i==0)
       {
         count=1;
        break;
         }
         else
         {
           count=0;
           }
           }
           if(count==1)
             System.out.println("Not a prime number");
             else
             
               System.out.println("prime number");
               }}



