import java.util.Scanner;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n,char A,char B,char C)
    {
        if(n==1)
        {
            System.out.println(A+"->"+C);
        }
        else
        {
            towerOfHanoi(n-1,A,C,B);
            System.out.println(A+"->"+C);
            towerOfHanoi(n-1,B,A,C);

        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disk:");
        int n =sc.nextInt();   
        System.out.println("Number of moves or subsequences");
        towerOfHanoi(n,'A','B','C');
    }
    
}
