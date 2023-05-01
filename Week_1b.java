//sort of array elements

import java.util.Scanner;
class Sortarray
{
   public static void main(String args[])
   {
     int a[]= new int[50];
     int i,j,n,temp;
     Scanner in=new Scanner(System.in);
     System.out.println("enter the value of n:");
     n=in.nextInt();
     System.out.println("enter the array elements");
     for(i=0;i<n;i++)
     {
       a[i]=in.nextInt();
     }
     System.out.println("the array elements are:");
     for(i=0;i<n;i++)
     {
       for(j=i+1;j<n;j++)
      {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
     }
     System.out.println("max="+a[n-1]);
        System.out.println("min="+a[n]);
   }
}
g