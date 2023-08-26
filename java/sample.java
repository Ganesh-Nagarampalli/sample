import java.util.*;
class first
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.next();
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        int c = str.length()/n;
        int r = str.length()%n;
        String sub[] = new String[c];
        int f = 0, l = n, i;
        for(i = 0; i < c && l <= str.length() ; i++)
        {
            sub[i] = str.substring(f, l);
            f = f+n;
            l = l+n;
        }
        if(r!=0)
        {
            sub[i] = str.substring(str.length() - r, str.length());
        }
        Arrays.sort(sub);
        for(i = 0; i < c+1; i++)
        {
            System.out.print(sub[i]+" ");
        }
    }
}