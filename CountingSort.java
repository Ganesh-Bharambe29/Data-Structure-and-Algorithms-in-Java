import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {

            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int [largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
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

        countingSort(A);

        System.out.println("Array elements  after sort");
        {
            for(int i=0;i<A.length;i++)
            {
                System.out.print(A[i]+"\t");
            }
            System.out.println("\n");
        }
    }
}
