import java.util.*;
import java.io.*;
import java.lang.*;

class week_8b
{
    public static void main(String[] args)
    {
        try {
            File f = new File("Sales.csv");
            FileReader fr = new FileReader(f);
            int count = 0;
            StringBuffer sb = new StringBuffer();
            int ch;
            while((ch=fr.read())!=-1)
            {
                sb.append(Character.toString((char)ch));
                if(((char)ch)=='\n')
                {
                    count++;
                }
            }
            String str = sb.toString();
            String lines[] = str.split("\n");
            String sales[] = new String[count-1];
            ArrayList <String> list = new ArrayList<String>();
            for(int i = 1; i < count; i++)
            {
                String pq[] = lines[i].split(",");
                sales[i-1] = pq[3];
                list.add(lines[i]);
            }
            int sum = 0;
            for(int i = 0; i < count - 1; i++)
            {
                String pq[] = (list.get(i)).split(",");
                try {
                    sum = sum + (Integer.parseInt(pq[2]))*(Integer.parseInt(pq[3]));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input in line " + (i+1) + ": " + e.getMessage());
                }
            }
            System.out.println("Total Revenue : "+sum);
            for(int i = 0; i < count - 2; i++)
            {
                for(int j = 0; j < count - 2 - i; j++)
                {
                    try {
                        if(Integer.parseInt(sales[j])>Integer.parseInt(sales[j+1]))
                        {
                            String temp = sales[j];
                            sales[j] = sales[j+1];
                            sales[j] = temp;
                            temp = lines[j+1];
                            lines[j+1] = lines[j+2];
                            lines[j+2] = temp;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input in sales values: " + e.getMessage());
                    }
                }
            }
            System.out.println("Item list on basis of their sales:");
            for(int i = 1; i < count; i++)
            {
                String pq[] = lines[count-i].split(",");
                System.out.println("Item: "+pq[1]+" and Sales: "+pq[3]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
		}
	}
}