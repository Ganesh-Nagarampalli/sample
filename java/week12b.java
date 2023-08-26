//server
import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class week12b
{
    public static void main(String arg[]) throws IOException
    {
       ServerSocket ss = new ServerSocket(54459);
       System.out.println("Server started on port 54459");
       Socket s = ss.accept();
       System.out.println("Client connected");
    //    DataInputStream dis = new DataInputStream(s.getInputStream());
    //    String r = (String)dis.readUTF();
    //    double radius = Double.parseDouble(r);
    //    double area = 3.14*radius*radius;
    //    String ans = "area of circle = "+area;

       DataOutputStream dos = new DataOutputStream(s.getOutputStream());
       dos.writeUTF("Hello client..");

       s.close();
       ss.close();
        
    }    
}
