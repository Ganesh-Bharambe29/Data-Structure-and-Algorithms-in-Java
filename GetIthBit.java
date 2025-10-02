import java.util.Scanner;
public class GetIthBit 
{
    public static int getIthBit(int n,int i)
    {
        int bitmask=1<<i;
        if((n& bitmask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        System.out.println("Enter the ith Bit to check(0 based index):");
        int i=sc.nextInt();
        
        if(i<0||i>=32)
        {
            System.out.println("Please enter the a value between (0-32).");
        }   
        else
        {
            int result=getIthBit(n, i);
            System.out.println("The value of the:"+i+" th bit is:"+result);
        }
        sc.close();
    }
}
