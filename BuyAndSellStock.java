import java.util.*;
public class BuyAndSellStock
{
    public static int buyAndSellStock(int prices[])
    {
        int buyprice=0;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyprice<prices[i])
            {
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else
            {
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Days:");
        int day=sc.nextInt();
        int prices[]=new int[day];

        System.out.println("Enter the buyprice of Stock:");
        for(int i=0;i<day;i++)
        {
            prices[i]=sc.nextInt();
        }
        System.out.println("The buyprice entered by customer of Stock :");
        for(int i=0;i<day;i++)
        {
            System.out.print(prices[i]+" ");
        }
        System.out.println();
        int maxprofit=buyAndSellStock(prices);
        System.out.println("The Profit in "+day+" days is:"+maxprofit);
    }
}
