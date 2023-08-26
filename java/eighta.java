/*Write a program that reads file name from the user then displays information about that
 file, also read the contents from the file in byte stream to count the number of alphabets,
 numeric values, and special symbols. Write these statistics into another file using byte
 streams*/
import java.io.*;
import java.util.*;
class eighta 
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("eighta.txt");

        System.out.println("File details....");
        System.out.println("file name: "+f.getName());
        System.out.println("Parent name: "+f.getParent());
        System.out.println("Path of file:"+f.getPath());
        System.out.println("Is file readable?"+f.canRead());

        FileInputStream fis = new FileInputStream(f);
        int alpha=0,num=0,spe=0;
        int temp;
        while((temp = fis.read())!=-1)
        {
            if (temp>=33 && temp<=47)
            {
                spe++;
            }
            else if(temp>47 && temp<=57){
                num++;
            }
            else if(temp>=65 && temp<=122){
                alpha++;
            }
        }

        FileOutputStream fos = new FileOutputStream("output.txt");
        String al = "number of alphabets:"+alpha;
        String nu = "number of integers:"+num;
        String spec = "number of special symbols:"+spe;
        fos.write(al.getBytes());
        fos.write("\n".getBytes());
        fos.write(nu.getBytes());
        fos.write("\n".getBytes());
        fos.write(spec.getBytes());
        fos.close();
        fis.close();
    }
}
