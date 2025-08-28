import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int num[],int key)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)
            {
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the Element to found:");
        int key=sc.nextInt();

        int index=linearSearch(num,key);
        if(index!=-1)
        {
            System.out.println("Element found at the index:"+index);
        }
        else
        {
            System.out.println("Element not found in the array.");
        }

    }
    
}
