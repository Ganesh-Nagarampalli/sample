import java.util.*;

class Calculator
{
    static int powerInt(int num1, int num2)
    {
        int i , product = 1;
        for(i= 0;i<num2;i++)
        {
            product = product*num1;
        }
        return(product);
    }
        public static void main(String[] arg)
        {
            int x, y;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            x = sc.nextInt();
            System.out.print("Enter the second number: ");
            y = sc.nextInt();
            if(x==0&&y==0)
            {
                System.out.print("not possible.");
            }
            else
            {
                System.out.print(x+" power " +y+" is: "+Calculator.powerInt(x, y));
            }
        }
    
}
