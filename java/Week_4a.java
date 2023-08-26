import java.util.*;

class Week_4a
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("enter the size of substrings");
        int n = sc.nextInt();
        int size;
        if(n==1)
        {
            char s[] = str.toCharArray();
            Arrays.sort(s);
            for(int j=0; j<str.length(); j++)
            {
                System.out.print(s[j]+" ");
            }
        }
        else
        {
            int c = str.length()/n;
            int r = str.length()%n;
            if(r==0)
            {
                size=c;
            }
            else
            {
                size = c+1;
            }
            String sub[] = new String[size];
            int first = 0, last = n, i;
            for(i = 0; i < size && last <= str.length() ; i++)
            {
                sub[i] = str.substring(first, last);
                first = first+n;
                last = last+n;
            }
            if(r!=0)
            {
                sub[i] = str.substring(str.length() - r, str.length());
            }  
            Arrays.sort(sub);
            for(i = 0; i < size; i++)
            {
                System.out.print(sub[i]+" ");
            }
        }
    }
}
