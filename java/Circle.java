import java.util.*;
public class Circle
{
	public static void main(String[] arg)
{
	//create object for scanner
	Scanner sc = new Scanner(System.in);
	float radius, area, perimeter;
	System.out.println("Enter the radius: ");
	radius=sc.nextFloat();
	System.out.println("area of circle = "+Math.PI*radius*radius);
	System.out.println("perimeter of circle = "+2*Math.PI*radius);
}
}