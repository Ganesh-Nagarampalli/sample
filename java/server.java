import java.util.*;
import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws IOException
    {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());  
        String  str=(String)dis.readUTF(); 
        System.out.println("Received the radius."); 
        System.out.println("Radius: "+str);
        double d = Double.parseDouble(str);
        double area = 3.14*d*d;

        Socket r = new Socket("localhost",5555);
        DataOutputStream dos = new DataOutputStream(r.getOutputStream());
        System.out.println("Sending area to client....");
        String are = ""+area;
        dos.writeUTF(are);


        dos.flush();
        s.close();
        r.close();
        ss.close();  

    }
}