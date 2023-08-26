import java.io.*;

public class ExceptionHandlingExample {
    public static void main(String arg[])
    {
        try{
            File f = new File("example.txt");
            FileReader fr = new FileReader(f);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("file was not found");
            // System.out.println("Error : "+ e.getMessage());
            e.printStackTrace();
        }
    }    
}
