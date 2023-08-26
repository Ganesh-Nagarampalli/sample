import java.util.*;
public class Factorial {


    static int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else 
        {
            return n*fact(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("enter a number: ");
        a = sc.nextInt();
        System.out.print("the factorial of "+a+ " is "+ fact(a));
    }
}

