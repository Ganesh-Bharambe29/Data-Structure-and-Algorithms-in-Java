import java.util.*;
public class StairCaseSearch 
{
    public static boolean stairCaseSearch(int mat[][],int key)
    {
        int rows=0;
        int col=mat[0].length-1;
        while(rows<mat.length && col>=0 )
        {
            if(mat[rows][col]==key)
            {
                System.out.println("Key found at:("+rows+","+col+")");
                return true;
            }
            else if(key<mat[rows][col])
            {
                col--;
            }
            else
            {
                rows++;
            }
        }
        System.out.println("Key Not Found.");
        return false;
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows:");
        int r=sc.nextInt();
        System.out.println("Enter the Number of Columns:");
        int c=sc.nextInt();
        int A[][]=new int[r][c];
        //The Array elements entered by the user is well sorted properly
        System.out.println("Enter the Elements in array.");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Elements Entered In the Array:");//printing elements in array
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the Key:");//declaring key to find in given array
        int n=sc.nextInt();
        stairCaseSearch(A,n);//calling method
    }
}
