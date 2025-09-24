import java.util.Scanner;
public class BubbleSort 
{
    public static void bubbleSort(int arr[])//bubbleSort method.
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");//input from user.
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements in the Array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements before sort:");//printing array after adding elements.
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);//calling bubbleSort method.
        System.out.println("Array Elements after sort:");//printing sort array.
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
