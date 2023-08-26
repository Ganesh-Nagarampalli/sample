import java.util.*;
class Week_4c
{
    public static void main(String arg[])
    {
        String s1 = new String();
        String s2 = new String();
        int count = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        s1 = sc.next();
        System.out.println("Enter 2nd string");
        s2 = sc.next();
        if(s1.length()== s2.length())
        {
            char str1[] = s1.toCharArray();
            char str2[] = s2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            for(i=0; i<s1.length(); i++)
            {
                if(str1[i]==str2[i])
                {
                    count++;
                }
            }
            if(count==s1.length())
            {
                System.out.println(s1+" and "+s2+" are Anagrams.");
            }
            else
            {
                System.out.println(s1+" and "+s2+" are not Anagrams.");
            }
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not Anagrams.");
        }
    }
}
