import java.util.*;
public class SubString {
    public static String subString(String str,int si,int ei)
    {
        String substr=" ";
        for(int i=si;i<ei;i++)//si=start index,ei=end index
        {
            substr+=str.charAt(i);
        }
       return substr;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");//input String 
        String s=sc.next();
        System.out.println("Enter the Starting index:");//input si
        int a=sc.nextInt();
        System.out.println("Enter the Ending index:");//input ei
        int b=sc.nextInt();
        String result=subString(s,a,b);//calling function
        System.out.println("The given SUbstring from given index :"+result);//printing  result
    }
}