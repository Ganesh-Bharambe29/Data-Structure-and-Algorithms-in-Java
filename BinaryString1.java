import java.util.Scanner;
public class BinaryString1 
{
    // This code is printing binary string without using lastplace.
    public static void binString(int n,String ans)
    {
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(ans.length()==0||ans.charAt(ans.length()-1)!='1')
        {
            binString(n-1, ans+'0');
            binString(n-1, ans+'1');
        }
        else
        {
            binString(n-1, ans+'0');
        }
    } 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Binary String:");
        int n=sc.nextInt();
        String ans=" ";
        binString(n,ans);
        sc.close();
    }       
}
