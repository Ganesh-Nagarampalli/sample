import java.util.*;
class Check_prime
{
    public  static void main(String arg[])
    {
        int count=0;
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number to check: ");
        int n = a.nextInt();
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}