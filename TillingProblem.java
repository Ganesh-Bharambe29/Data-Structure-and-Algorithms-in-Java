import java.util.Scanner;
public class TillingProblem 
{
    //counting total ways to tile a floor(2xn)
    public static int tillingProblem(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        int ans1=tillingProblem(n-1);
        int ans2=tillingProblem(n-2);
        return ans1+ans2;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Dimensions of Tile(2Xn):");   
        int n=sc.nextInt();
        int result=tillingProblem(n);
        System.out.println("The Total Ways to Tilling "+n+" Tiles is:"+result);
        sc.close();

    }
}
