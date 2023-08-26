import java.util.*;
class Fibonacci
{
    int temp1=0,temp2=1,sum;
    int Value(int n)
    {
        for(int i=0;i<n-1;i++)
        {
            sum = temp1+temp2;
            temp1=temp2;
            temp2=sum;
        }
        return sum;
    }
}
class Test
{
    public static void name(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        int n = sc.nextInt();
        Fibonacci obj = new Fibonacci();
        System.out.println("value = "+obj.Value(n));
        
    }
}

