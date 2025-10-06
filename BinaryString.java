import java.util.Scanner;
public class BinaryString
{
    public static void binString(int n,int lastPlace,String ans)
    {
        if(n==0)//base case
        {
            System.out.println(ans);
            return;
        }
        if(lastPlace!=1)
        {
            binString(n-1, 0, ans+'0');
            binString(n-1, 1, ans+'1');
        }
        else
        {
            binString(n-1,0,ans+'0');
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Binary String:");
        int n=sc.nextInt();
        String ans=" ";
        binString(n,0,ans);
        sc.close();
    }    
}
