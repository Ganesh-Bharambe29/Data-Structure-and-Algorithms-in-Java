import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int num[])
    {
        int first=0;
        int last=num.length-1;
        while(first<last)
        {
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;

            first++;
            last--;
        }
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

        reverseArray(num);//calling the function
        System.out.println("Array in reverse order:");
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+"\t");
        }
        System.out.println();
    }
}
