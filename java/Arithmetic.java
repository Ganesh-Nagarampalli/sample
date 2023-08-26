import java.util.*;
public class Arithmetic
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("enter operator(+,-,*,/)");
        char operation = sc.next().charAt(0);
        switch ((operation))
        {
            case '+':
            System.out.println("addition = "+(num1+num2));
                break;
            case '-':
            System.out.println("subtraction = "+(num1-num2));
                break;
            case '*' :
            System.out.println("multiplication = "+(num1*num2));
                break;
            case '/':
            System.out.println("quotient = "+(num1/num2));
                break;
            default:
            System.out.println("ERROR! select the correct operator");
                break;
        }
    }
}

