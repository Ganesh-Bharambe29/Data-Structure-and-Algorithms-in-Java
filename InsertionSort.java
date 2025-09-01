import java.util.Scanner;
public class InsertionSort {
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int previous=i-1;

            while(previous>=0 && arr[previous]>current)
            {
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
    }
    public static void main(String args[])
    {
        int A[]=new int[5];
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Array Elements:");
        
         for(int i=0;i<A.length;i++)
        {   
            A[i]=sc.nextInt();
        }
           
        System.out.println("Array elements before sort:");
        {
            for(int i=0;i<A.length;i++)
            {
                System.out.print(A[i]+"\t");
            }
            System.out.println("\n");
        }

       insertionSort(A);

       System.out.println("Array elements after sort");
         for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"\t");
        }
        System.out.println();
    }
    
}
