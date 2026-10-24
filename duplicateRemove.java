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
         duplicateRemove(a);
      /*    for(int i=0;i<n;i++)
         {
             System.out.print(a[i]+" ");
         }*/
    }
    static void duplicateRemove(int a[])
    {
        int j=0;
        int k=0;
        for(int i=1;i<a.length;i++)
        {
             if(a[i]!=a[j])
             {
                 j++;
                 a[j]=a[i];
                 k++;
             }
        }
         for(int i=0;i<a.length;i++)
         {
             System.out.print(a[i]+" ");
         }
    }
}