import java.util.*;
public class QuickSort
{
   
    public static int partition(int arr[],int si,int ei)
    {
         int temp=0;
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        temp=arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;
        return i;
    }
    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
         int PivotIdx=partition(arr,si,ei);
         quickSort(arr,si,PivotIdx-1);
         quickSort(arr,PivotIdx+1,ei);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Declare the Size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in Array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //printing array elements
        System.out.println("The Elements Entered in the Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //calling method quickSort
        quickSort(arr,0,arr.length-1);
        System.out.println("Array elements after sorting:");//printing elements after sorting
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}