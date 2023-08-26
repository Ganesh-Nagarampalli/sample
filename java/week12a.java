//client
import java.io.DataOutputStream;
import java.net.*;
import java.util.*;
import java.io.*;
class week12a
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("ganesh",54459);
        // System.out.println("Enter radius of circle");
        
        System.out.println("hello!");
        // String str = sc.next();
        // DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        // dos.writeUTF(str);
        
        DataInputStream dis = new DataInputStream(s.getInputStream());
        // String str2 = (String)dis.readUTF();
        // System.out.println(""+str2); 
        System.out.println("Received message: " + dis.readUTF());


        s.close();
    }
}
