import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minpos=i;
            for(int j=i+1;j<=arr.length-1;j++)
            {
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
            }
            
        }

    }
    public static void main(String[] args) {
         int arr[]=new int[5];
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Array Elements:");
        
         for(int i=0;i<arr.length;i++)
        {   
            arr[i]=sc.nextInt();
        }
           
        System.out.println("Array elements before sort:");
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"\t");
            }
            System.out.println("\n");
        }

        selectionSort(arr);//calling the function of selectionSort

         System.out.println("Array elements  after sort");//array after sort
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
