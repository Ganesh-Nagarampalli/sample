import java.io.*;
public class CopyFile
{
    public static void main(String[] args)
    {
        try
        {
            FileReader input = new FileReader("input.txt");
            FileWriter output = new FileWriter("output2.txt");
            int c;
            while((c = input.read())!= -1)
            {
                output.write(c);
            }
            input.close();
            output.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
