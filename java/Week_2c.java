

import java.util.Scanner;

class Frequency {
    public static void main(String args[]) {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter the element : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            int count = 1;
            int temp = a[i];
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                    n--;
                    for (int k = j; k < n; k++)
                    {
                        a[k] = a[k + 1];
                    }
                    j--;
                }
            }
            f[i] = count;
        }
        
        // sort the a[] and f[] array in ascending order of f[]
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
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
        for (int i = 0; i < n; i++)
        {
            System.out.println(a[i] + ": " + f[i]);
        }
    }
}

