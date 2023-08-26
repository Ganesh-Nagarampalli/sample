import java.util.*;
import java.io.*;
import java.net.*;

public class client
{
    public static void main(String[] args) throws Exception,EOFException
    {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost",6666);
        String st = new String();
        System.out.println("Enter the radius: ");
        st = sc.nextLine();
        System.out.println("Sending...");
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF(st);

        ServerSocket q = new ServerSocket(5555);
        Socket y = q.accept();
        DataInputStream dis = new DataInputStream(y.getInputStream());
        String area = (String)dis.readUTF();
        System.out.println("The area of the circle received from server: "+area);
        
        out.flush();
        out.close();
        dis.close();
        y.close();
        q.close();
        s.close();
    }
}