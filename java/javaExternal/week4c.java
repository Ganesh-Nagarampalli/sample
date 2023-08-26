/* Accept two strings from the user and determine if the strings are anagrams or not. */

import java.util.*;

public class week4c
{
    public static void main(String arg[])
    {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1");
        String s1 = sc.next();
        System.out.println("Enter string 2");
        String s2 = sc.next();
        char c1[] = new char[s1.length()];
        char c2[] = new char[s2.length()];
        if (s1.length()==s2.length())
        {
            for(int i=0; i<s1.length(); i++)
            {
                c1[i] = s1.charAt(i);
                c2[i] = s2.charAt(i);
            }
            for(int i=0; i<s1.length(); i++)
            {
                for(int j=i+1; j<s1.length(); j++)
                {
                    char temp1;
                    char temp2;
                    if(c1[i]>c1[j])
                    {
                        temp1 = c1[i];
                        c1[i] = c1[j];
                        c1[j] = temp1;
                    }
                    if(c2[i]>c2[j])
                    {
                        temp2 = c2[i];
                        c2[i] = c2[j];
                        c2[j] = temp2;
                    }
                }
            }
            for(int i=0; i<s1.length(); i++)
            {
                if(c1[i] == c2[i])
                {
                    count++;
                }
            }
            if(count==s1.length())
            {
                System.out.println(s1+" and "+s2+" are anagrams.");
            }
            else
            {
                System.out.println(s1+" and "+s2+" are not anagrams.");
            }

        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams.");
        }
        
    }    
}
