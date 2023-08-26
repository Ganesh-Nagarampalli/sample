import java.util.*;
import java.lang.*;
class Figure_3D
{
    String name;
    void CurvedSurfaceArea(double radius, double height){
    }
    void Volume(double radius, double height){
    }
}
class Cylinder extends Figure_3D
{
    void CurvedSurfaceArea(double radius, double height)
    {
        double csa = 2*Math.PI*radius*height;
        System.out.println("The curved surface area of cylinder is " + csa);

    }
    void Volume(double radius, double height)
    {
        double v = Math.PI*radius*radius*height;
        System.out.println("The volume of cylinder is " + v);
    }
}
class Cone extends Figure_3D
{
    void CurvedSurfaceArea(double radius, double height)
    {
        double csa = Math.PI*radius*Math.sqrt(radius*radius +height*height);
        System.out.println("The curved surface area of cone is " + csa);
    }
    void Volume(double radius, double height)
    {
        double v = (Math.PI*radius*radius*height)/3;
        System.out.println("The volume of cone is " + v);
    }
}
class Sphere extends Figure_3D
{
    void CurvedSurfaceArea(double radius)
    {
        double csa = 4*Math.PI*radius*radius;
        System.out.println("The curved surface area of sphere is " + csa);
    }
    void Volume(double radius)
    {
        double v = (4*Math.PI*radius*radius*radius)/3;
        System.out.println("The volume of sphere is " + v);
    }
}
class Week_5_2
{
    public static void main(String [] args)
    {
        Figure_3D figure[] = new Figure_3D[3];
        for(int i = 0; i < 3; i++)
        {
            figure[i] = new Figure_3D();
        }
        figure[0].name = "Cylinder";
        figure[1].name = "Cone";
        figure[2].name = "Sphere";
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the figure name: ");
        String demo = sc.next();
        int count = 0;
        for(int i = 0; i < 3; i++)
        {
            if(demo.equalsIgnoreCase(figure[i].name))
            {
                count = 1;
                if(i == 0)
                {
                    System.out.print("Enter the radius  of cylinder: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter the height of cylinder: ");
                    double h = sc.nextDouble();
                    Cylinder s = new Cylinder();
                    s.CurvedSurfaceArea(r,h);
                    s.Volume(r, h);
                    break;
                }
                else if(i == 1)
                {
                    System.out.print("Enter the radius cone: ");
                    double r = sc.nextDouble();
                    System.out.print("Enter the height of cone: ");
                    double h = sc.nextDouble();
                    Cone co = new Cone();
                    co.CurvedSurfaceArea(r, h);
                    co.Volume(r, h);
                    break;
                }
                else if(i == 2)
                {
                    System.out.print("Enter the radius of sphere: ");
                    double r = sc.nextDouble();
                    Sphere c = new Sphere();
                    c.CurvedSurfaceArea(r);
                    c.Volume(r);
                }
            }
        }

        if(count == 0)
        {
            System.out.println("Invalid figure.");
        }

    }   
}