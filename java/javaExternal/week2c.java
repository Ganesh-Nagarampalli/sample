/* Write a program to accept contents into an Integer Array and print the frequency of
each number in the order of their number of occurrences.
 */

import java.util.*;
public class week2c
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the integer array");
        int size = sc.nextInt();
        int a[] = new int[size];
        int f[] = new int[size];
        System.out.println("Enter "+size+" integers");
        for(int i=0; i<size; i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            int count = 1;
            
            for (int j = i + 1; j < size; j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                    size--;
                    for (int k = j; k < size; k++)
                    {
                        a[k] = a[k + 1];
                    }
                    j--;
                }
            }
            f[i] = count;
        }
        
        // sort the a[] and f[] array in ascending order of f[]
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (f[i] > f[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    int temp2 = f[i];
                    f[i] = f[j];
                    f[j] = temp2;
                }
            }
        }
        
        // print the frequency of each number
        System.out.println("Frequency of each number: ");
        for (int i = 0; i < size; i++)
        {
            System.out.println(a[i] + ": " + f[i]);
        }
    }
}
