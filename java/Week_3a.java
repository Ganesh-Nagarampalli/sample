import java.util.*;
class Box 
{
    double width, height, depth;
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume()
    {
        return width*depth*height;
    }
}
public class Week_3a 
{
    public static void main(String args[])
    {
        double w, h, d;
        System.out.println("Enter the width, height, depth : ");
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();
        d = sc.nextInt();
        Box b = new Box(w, h, d);
        double v = b.volume();
        System.out.println("The volume is "+v);
    }
}