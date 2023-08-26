import java.util.*;
public class Sum2
{
    public static void main(String[] arg)
    {
        int sum=0;
        String s = "12,3,56,42";
        StringTokenizer st = new StringTokenizer(s, ",");
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(st.hasMoreTokens())
        {
            a.add(st.nextToken());
        }
        for (int i : a)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
