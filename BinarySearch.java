import java.util.Scanner;
public class BinarySearch
{

    static void bubbleSort(int A[])
    {
        int temp=0;
        for(int k=0;k<A.length;k++)
        {
            for(int j=k+1;j<A.length;j++)
            {
                if(A[k]>A[j])
                {
                    temp=A[k];
                    A[k]=A[j];
                    A[j]=temp;
                }
            }
        }
    }


    static int binarySearch(int A[],int left,int right,int x)
    {
        int mid=0;
        while(left<=right)
        {
             mid=(left+right)/2;
             if(A[mid]==x)
             {
                return mid;
             }
             else if(A[mid]>x)
             {
                right=mid-1;
             }
             else
             {
                left=mid+1;
             }
        }
        return -1;
    }


    public static void main(String s[])
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

       bubbleSort(A);

        System.out.println("Array elements  after sort");
        {
            for(int i=0;i<A.length;i++)
            {
                System.out.print(A[i]+"\t");
            }
            System.out.println("\n");
        }
        int n=A.length;
        System.out.println("Enter the Element to found:");
        int x=sc.nextInt();

        int result=binarySearch(A,0,n-1,x);
        
        if(result==-1)
        {
            System.out.println("Element is not found:"+x);
        }
        else
        {
            System.out.println("Element is found:"+x);
        }

    }

}