/*  Accept an array of strings and display the number of vowels and consonants occurred
in each string.*/

import java.util.*;

class week4b
{
    public static void main(String arg[])
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of strings");
        size = sc.nextInt();
        String s[] = new String[size];
        for(int i=0; i<size; i++)
        {
            System.out.println("enter string "+(i+1));
            s[i] = sc.next();
        }
        for(int i=0; i<size; i++)
        {
            int vowels = 0, consonants = 0;
            for(int k=0; k<s[i].length(); k++)
            {
                if(s[i].charAt(k)=='a' || s[i].charAt(k)=='e'|| s[i].charAt(k)=='i'|| s[i].charAt(k)=='o'|| s[i].charAt(k)=='u')
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
            System.out.println(s[i]+" has "+vowels+" vowels and "+consonants+" consonants.");
        }
    }
}
