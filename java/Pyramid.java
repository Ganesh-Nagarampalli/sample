import java.util.*;
class Pyramid
{
    public static void main(String arg[])
    {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = sc.nextInt();
        System.out.println("pyramid pattern");
        for(int i=1;i<=rows;i++)
        {
            for(int j=i; j<=rows-1; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}