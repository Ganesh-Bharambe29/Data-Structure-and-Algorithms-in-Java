import java.util.Scanner;
public class FirstOccur 
{
    public static int firstOcuur(int arr[],int i,int target)
    {
        int n=arr.length;
        if(i==n)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i;
        }
        return firstOcuur(arr,i+1,target);
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array.");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Array elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Elements in the Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the Target Value:");
        int tar=sc.nextInt();
        int index=firstOcuur(arr,0,tar);
        if(index==-1)
        {
            System.out.println("Target not Found.");
        }
        else
        {
            System.out.println("First Occurence at index:"+index);
        }
        sc.close();
    }
}
