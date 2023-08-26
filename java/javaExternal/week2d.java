/*Write a program that accepts an „m x n‟ double dimension array, where „m‟ represents
 financial years and „n‟ represents Ids of the items sold. Each element in the array represents
 number of items sold in a particular year. Identify the year and id of the item which has
 more demand. */

import java.util.*;
public class week2d
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of financial years");
        int m = sc.nextInt();
        System.out.println("Enter no. of Ids");
        int n = sc.nextInt();
        int a[][] = new int[m+1][n+1];
        int id=0, year=0;
        System.out.println("enter all financial years");
        for(int i=1; i<=m; i++)
        {
            a[i][0] = sc.nextInt();
        }
        System.out.println("enter the Ids");
        for(int i=1; i<=m; i++)
        {
            a[0][i] = sc.nextInt();
        }
        for(int i=1; i<=m; i++)
        {
            System.out.println("Enter sales of item "+a[0][i]+" in consecutive years");
            for(int j=1; j<=n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<=m; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 && j==0)
                {
                    System.out.print("    ");
                }
                else
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
        int max = a[1][1];
        for(int i=1; i<=m; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(a[i][j]>max)
                {
                    max = a[i][j];
                    id = a[0][j];
                    year = a[i][0];
                }
            }
        }
        System.out.println("item "+id+" has more demand in the year "+year);
    }    
}
