import java.util.Scanner;
public class Power 
{
    public static int pow(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfPower=pow(x,n/2);
        int halfPowerSquare=halfPower*halfPower;//for even integer to print power.
        if(n%2==0)
        {
            return halfPower;//for odd integer to print power.
        }
        return x*halfPowerSquare;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to print the Power:");
        int x=sc.nextInt();
        System.out.println("Enter the raised to Power:");
        int n=sc.nextInt();
        int result=pow(x,n);
        System.out.println("The value of "+x+" raised to "+n+" is:"+result);
        sc.close();
    }
}
