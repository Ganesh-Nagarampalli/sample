import java.util.*;
import java.io.*;
import java.lang.*;
class week_8c
{
    public static void main(String [] args) throws IOException
    {
        StringBuffer sb = new StringBuffer();
        File f = new File("thermodynamics.txt");
        FileReader fr = new FileReader(f);
        int ch;
        System.out.println("Content in file: ");
        while((ch=fr.read())!=-1)
        {
            System.out.print((char)ch);
            if(ch!='.'&&ch!=',')
            {
                sb.append(Character.toString((char)ch));
            }
        }
        String s = sb.toString();
        String ar[] =  s.split(" ");
        Arrays.sort(ar);
        System.out.println("\nAfter Sorting the text: ");
        for(String i : ar)
        {
            System.out.print(i+" ");
        }
    }
}