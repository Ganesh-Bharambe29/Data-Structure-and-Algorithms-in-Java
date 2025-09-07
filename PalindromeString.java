import java.util.Scanner;
public class PalindromeString
{
    public static boolean isPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String s=sc.nextLine();

        boolean result =isPalindrome(s);//calling function

        if(result)
        {
            System.out.println("The String is Palindromic.");
        }
        else
        {
            System.out.println("The String is not Palindromic.");

        }

    }
}