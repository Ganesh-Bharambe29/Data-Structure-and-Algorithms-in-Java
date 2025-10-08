import java.util.*;
public class MergeSort 
{
    public static void merge(int arr[],int si,int mid,int ei)
    {
        ArrayList<Integer>temp=new ArrayList<>();
        int i=si;
        int j=mid+1;

        while(i<=mid && j<=ei)
        {
            if(arr[i]<=arr[j])
            {
                temp.add(arr[i]);
                i++;
            }
            else
            {
                temp.add(arr[j]);
                j++;
            }
        }
       while(i<=mid)
       {
            temp.add(arr[i++]);
       }
       while(j<=ei)
       {
            temp.add(arr[j++]);
       }
       for(int idx=si,x=0;idx<=ei;idx++,x++)
       {
            arr[idx]=temp.get(x);
       }
    }
    public static void printArr(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(arr, si, mid);//left
        mergeSort(arr, mid+1, ei);//right
        merge(arr,si,mid,ei);//conquer

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
        printArr(arr,n);
        mergeSort(arr,0,n-1);//calling mergeSort method 
        System.out.println("Array Elements after Sorting:");
        printArr(arr,n);
    
        sc.close();
    }
}    
    

