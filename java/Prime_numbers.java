import java.util.*;
class OddAndPrime
{
 public static void main(String [] args)
 {
 Scanner sc = new Scanner(System.in);
 int n, i, factors, count = 0;
 System.out.print("Enter size of array: ");
 n = sc.nextInt();
 int a[] = new int[n];
 System.out.println("Enter array elements");
 for(i = 0; i < n; i++)
 a[i] = sc.nextInt();
 for(i = 0; i < n; i++)
 {
 if(a[i] % 2 != 0)
 {
 factors = 0;
 for(int j = 1; j <= a[i]; j++)
 if(a[i] % j == 0)
 factors++;
 if(factors == 2)
 {
 System.out.print(a[i] + " ");
 count++;
 } 
 }
 }
 if(count == 0)
 System.out.println("Elements not found");
 }
}