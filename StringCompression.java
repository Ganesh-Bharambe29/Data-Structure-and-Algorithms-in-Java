import java.util.Scanner;
public class StringCompression 
{
    public static String stringCompression(String str)//string compression method
    {
        String newstr=" ";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1)
            {
                newstr+=count.toString();
            }
        }
        return newstr;
    }    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        String result=stringCompression(s);//calling method
        System.out.println("The Compressed String is:"+result);//printing compressed String.  
    }
}
