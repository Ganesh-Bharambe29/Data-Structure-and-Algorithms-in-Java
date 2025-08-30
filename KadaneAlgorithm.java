import java.util.Scanner;
//The code will not whole negative number array
public class KadaneAlgorithm {
    public static void kadaneAlgorithm(int num[])
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        
        for(int i=0;i<num.length;i++)
        {
            currSum +=num[i];
            if(currSum<0)
            {
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("max Subarray  is:"+maxSum);
    }
    public static void main(String[] args) {
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
        kadaneAlgorithm(num);
    }

    
}
