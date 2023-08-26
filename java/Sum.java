import java.util.*;
public class Sum
{
    public static void main(String[] arg)
    {
        int sum = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(5);
        a.add(6);
        for (int i : a)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

