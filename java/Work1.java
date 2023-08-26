import java.util.*;
class Radius
{
    double radius;
    void radius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the sphere");
        radius = sc.nextDouble();
    }
}
class Area extends Radius
{
    double area;
    void area()
    {
        area = Math.PI*radius*radius;
    }
}
class Volume extends Area
{
    double volume;
    void volume()
    {
        volume = (1.34)*area*radius;
        System.out.println("volume of the sphere = "+volume);
    }
}
class Work1
{
    public static void main(String arg[])
    {
        Volume v = new Volume();
        v.radius();
        v.area();
        v.volume();
    }
}