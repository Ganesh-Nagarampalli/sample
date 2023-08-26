import java.util.*;

class week_9a
{
    public static void main(String arg[])
    {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        String str1 = sc.nextLine();
        System.out.print("enter the second number: ");
        String str2 = sc.nextLine();
        try 
        {  
              int num1 = Integer.parseInt(str1);
              int num2 = Integer.parseInt(str2);
              c = num1/num2;
              System.out.println("the division of "+num1+" and "+num2+" is: "+c);
        }
        catch(NumberFormatException ex)
        {  
          System.err.println(ex);
        }  
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("program ended !!!.");
        }
    }
}