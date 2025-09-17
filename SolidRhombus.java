import java.util.Scanner;
public class SolidRhombus {
    public static void solidRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)//printing spaces
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)//printing stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows:");
        int n=sc.nextInt();
        solidRhombus(n);//calling method
    }
}
