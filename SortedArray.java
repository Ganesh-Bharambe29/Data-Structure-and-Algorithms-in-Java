import java.util.Scanner;

public class SortedArray 
{
    public static boolean isSorted(int arr[],int n,int i)
    {
        if(i==n-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        return isSorted(arr,n,i+1);
    }
    public static void main(String args[])
    {
         int num[]=new int[5];
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Array Elements:");
        
         for(int i=0;i<num.length;i++)
        {   
            num[i]=sc.nextInt();
        }
           
        System.out.println("Elements in the array:");
        {
            for(int i=0;i<num.length;i++)
            {
                System.out.print(num[i]+"\t");
            }
            System.out.println("\n");
        }
        int n=num.length;
        boolean result=isSorted(num,n,0);
        if(result)
        {
            System.out.println("Array is Sorted.");
        }
        else
        {
            System.out.println("Array is not Sorted.");
        }
    }
}
