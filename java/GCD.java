import java.util.*;
class GCD
{
    public  static void main(String arg[])
    {
        int rem=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int n1 = sc.nextInt();
        System.out.println("enter the 2nd number: ");
        int n2 = sc.nextInt();
        System.out.println("gcd");
        do
        {
            rem = n2%n1;
            if (rem!=0)
            {
                n2=n1;
                n1=rem;
            }
        }while(rem!=0);
        System.out.println(n1);
    }
}