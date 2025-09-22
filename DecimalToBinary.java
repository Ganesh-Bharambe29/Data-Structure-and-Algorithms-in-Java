import java.util.*;
public class DecimalToBinary 
{
    public static void decToBin(int n)
    {
        int Num=n;
        int Pow=0;
        int binNum=0;
        
        while(n>0)
        {
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,Pow));
            Pow++;
            n=n/2;
        }
        System.out.println("Binary Form of "+ Num +" is:"+binNum);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);//Input from the user
        System.out.println("Enter the Decimal Number:");
        int n=sc.nextInt();
        decToBin(n);//calling a function
    }
}
