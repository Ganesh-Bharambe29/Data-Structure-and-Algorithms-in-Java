import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();

        while(n>0)
        {
            int lastdigit=n%10;
            n=n/10;
            System.out.print(lastdigit);

        }
        System.out.println();
        
    }
}
