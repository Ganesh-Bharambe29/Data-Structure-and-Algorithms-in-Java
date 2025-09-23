import java.util.*;
public class PrintPair 
{
    public static void printPairs(int num[])
    {
        int tp=0;//tp=total pairs.
        for(int i=0;i<num.length;i++)
        {
            int curr=num[i];
            for(int j=i+1;j<num.length;j++)
            {
                System.out.print("("+curr+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs:"+tp);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Size of the Array:");
        int size=sc.nextInt();

        int num[]=new int[size];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Elements in Array:");
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        printPairs(num);
    }   
}
 