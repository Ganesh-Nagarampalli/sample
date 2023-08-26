import java.util.*;
class Scan
{
	public static void main(String[] arg)
{
	//create object for scanner
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the first number: ");
	a=sc.nextInt();
	System.out.println("Enter the second number: ");
	b=sc.nextInt();
	c=a+b;
	System.out.println("sum="+c);
}
}