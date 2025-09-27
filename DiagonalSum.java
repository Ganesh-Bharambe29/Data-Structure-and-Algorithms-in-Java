import java.util.*;
public class DiagonalSum 
{
    public static int diagonalSum(int mat[][])
    {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                //primary diagonal
                if(i==j)
                {
                    sum+=mat[i][j];
                }
                else if(i!=mat.length-1-i)
                {
                    sum+=mat[i][mat.length-1-i];
                }
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The Number of Array rows and columns should be equal!");
        System.out.println("Enter the Size of array rows and columns:");
        int r=sc.nextInt();

        int mat[][]=new int[r][r];
        System.out.println("Enter the 2*2 matrix elements:");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Array elements entered is:");
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int sum=diagonalSum(mat);
        System.out.println("The diagonal Sum of elements is:"+sum);

    }
        
}
