import java.util.*;
public class wrapperexample
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int n = sc.nextInt();
        System.out.println("enter a long integer");
        long l = sc.nextLong();
        System.out.println("enter a double value");
        double d = sc.nextDouble();
        System.out.println("enter a character");
        char c = sc.next().charAt(0);
        System.out.println("enter a boolean value");
        boolean b = sc.nextBoolean();

        Integer in = Integer.valueOf(n);
        Long ln = Long.valueOf(l);
        Double db = Double.valueOf(d);
        Character cr = Character.valueOf(c);
        Boolean bl = Boolean.valueOf(b);

        Vector<Object> v = new Vector<>();
        v.add(in);
        v.add(ln);
        v.add(db);
        v.add(cr);
        v.add(bl);

        System.out.println(v);


    }
}
