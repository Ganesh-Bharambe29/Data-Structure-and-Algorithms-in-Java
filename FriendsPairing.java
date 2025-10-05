import java.util.Scanner;
public class FriendsPairing 
{
    public static int friendsPairing(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Friends:");
        int n=sc.nextInt();
        int pairing=friendsPairing(n);
        System.out.println("The Total Number of Ways to Pair "+n+" Friends is:"+pairing);
        sc.close();
    }
}
