import java.util.Scanner;
public class ShortestPath {
    public static float shortestPath(String Path)
    {
        int x=0;
        int y=0;
        for(int i=0;i<Path.length();i++)
        {
            char dir=Path.charAt(i);
            //South
            if(dir=='S')
            {
                y--;
            }
            else if(dir=='N')
            {
                y++;
            }
            else if(dir=='E')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        int x2=(x*x);
        int y2=(y*y);
        return(float) Math.sqrt(x2+y2); 
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the given Route:");
        String s=sc.next();
        float distance=shortestPath(s);
        System.out.println("The Shortest path for the Given Route:"+distance);
    }
}
