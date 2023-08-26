/*Accept a String and a number „n‟ from user. Divide the given string into substrings
each of size „n‟ and sort them lexicographically. */

import java.util.*;
public class week4a  
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        String s = new String();
        System.out.println("enter a line of string");
        s = sc.nextLine();
        System.out.println("enter size of each substring");
        n = sc.nextInt();
        int count = s.length() % n == 0? s.length() / n : (s.length() / n) + 1;   //To know how many parts we have to make the string
        String end[] = new String[count]; 
        for(i = 0; i < count - 1; i++)
        {
            end[i] = s.substring(i * n, (i + 1) * n);
        }
        end[i] = s.substring(i * n, s.length());//loop and statement will divide the strings in parts and store in another loops
        for(i = 0; i < count; i++)
        {
            for(j = i + 1; j < count; j++)
            {
                if(end[i].compareToIgnoreCase(end[j]) > 0)
                {
                    String temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;   
                }
            }
        }
        for(i = 0; i < count; i++)
        {
            System.out.println(end[i]);
        }
    }
}
