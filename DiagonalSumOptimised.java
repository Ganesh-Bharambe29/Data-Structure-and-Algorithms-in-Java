import java.util.Scanner;

public class DiagonalSumOptimised 
{
    public static int diagonalSum(int mat[][])
    {
        int sum=0;
        for(int i=0;i<mat.length;i++)
        {
            //primary diagonal
            sum+=mat[i][i];
            //seconadary diagonal
            if(i!=mat.length-1)
            {
                sum+=mat[i][mat.length-i-1];
            }
        }
        return sum;
    } 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The Number of Array rows and columns should be equal!");
        System.out.println("Enter the Size of array rows and columns:");
        int r=sc.nextInt();

        int mat[][]=new int[r][r];
        System.out.println("Enter the 2x2 matrix elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                mat[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Array elements entered is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
               System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        int sum=diagonalSum(mat);
        System.out.println("The diagonal Sum of elements is:"+sum);
        sc.close();
    }
        
}
    
    

