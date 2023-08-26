/* Write a program that accepts an array of integers and print those which are both odd
and prime. If no such element in that array print “Not found”.
*/

import java.util.*;
public class week2b
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int ar[], count, ref = 0;
		ar = new int[size];
		System.out.println("Enter the elements");
		for(int i=0; i<size; i++)
		{
			ar[i] = sc.nextInt();
		}
		System.out.println("odd and prime numbers are:");
		for(int i=0; i<size; i++)
		{
			count = 0;
			if(ar[i]%2!=0)
			{
				for(int j=2; j<=ar[i]; j++)
				{
					if(ar[i]%j==0)
					{
						count++;
					}
				}
			}
			if(count==1)
			{
				System.out.println(ar[i]);
				ref = 1;
			}
		}
		if(ref==0)
		{
			System.out.println("not found");
		}
	}
}


