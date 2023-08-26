import java.util.*;
public class week_7_1
{
	public static void main(String args[])
	{
		int min, max, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the minimum number");
		min = sc.nextInt();
		System.out.println("Enter the maximum number");
		max = sc.nextInt();
		Random rand = new Random();
		System.out.println("Enter how many random numbers u want");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int num = rand.nextInt(max-min-1)+min+1;
			System.out.println("Random number between "+min+" and "+max+" is: "+num);
		}
	}
}
