import java.util.*;
public class RemoveDuplicate 
{
    public static void removeDuplicate(String str,String ans,int i,boolean map[])
    {
        if(i==str.length())
        {
            System.out.println("ans:"+ans);
            return;
        }
        int mapIdx=(int)(str.charAt(i)-'a');
        if(map[mapIdx])
        {
            removeDuplicate(str,ans,i+1,map);
        }
        else
        {
            map[mapIdx]=true;
            removeDuplicate(str,ans+str.charAt(i),i+1,map);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ans=" ";
        System.out.println("Enter the String:");
        String s=sc.nextLine().toLowerCase();
        boolean map[]=new boolean[26];
        removeDuplicate(s,ans,0,map);
    }
}
