import java.util.*;

public class CountLower {

    public static String countLow(String str){
        Integer count =0;

        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }

        return count.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        System.out.println(countLow(s));
        sc.close();
    }
    
}
