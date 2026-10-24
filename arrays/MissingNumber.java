import java.util.*;
class Solution
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int a[]=new int[n];
           for(int i=0;i<n;i++)
           {
             a[i]=sc.nextInt();
           }
           MissingNumber(a);

     }

static void MissingNumber(int a[])
{
      int n=(a.length*(a.length+1))/2;
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
         sum+=a[i];
      }
       int diff=n-sum;
       System.out.println(diff);
      }
}
