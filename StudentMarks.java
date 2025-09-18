import java.util.Scanner;
public class StudentMarks 
{
    public static void bubbleSort(int arr[])
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void studentMarks(int arr[])
    {
        
        bubbleSort(arr);
         int BottomTotal=0;
        for(int i=0;i<=3;i++)
        {
            BottomTotal+=arr[i]; 
        }
        System.out.println("The Bottom 3 Students having low marks Total Is:"+BottomTotal);
        int averageBottom3=BottomTotal/3;
        int TopTotal=0;
        for(int i=arr.length-3;i<arr.length;i++)
        {
            TopTotal+=arr[i];
        }
        System.out.println("The Top 3 Students having Higher marks Total Is:"+TopTotal);
        int averageTop3=TopTotal/3;
       
        int diffrence=averageTop3-averageBottom3;
        System.out.println("Average of Bottom 3: " + averageBottom3);
        System.out.println("Average of Top 3: " + averageTop3);
        System.out.println("The Diffrence between Top 3 and Bottom 3 :"+diffrence);
        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number of Students:");
        int size=sc.nextInt();
        
        if(size<3)
        {
            System.out.println("Sorry! Need at least 3 students to perform operation.");
        }
        int marks[]=new int[size];
        System.out.println("Enter marks of Students:");
         for(int i=0;i<marks.length;i++)
        {   
            marks[i]=sc.nextInt();
        }
           
        System.out.println("The marks entered :");
        {
            for(int i=0;i<marks.length;i++)
            {
                System.out.print(marks[i]+"\t");
            }
            System.out.println("\n");
        }
        studentMarks(marks);
    }

}
