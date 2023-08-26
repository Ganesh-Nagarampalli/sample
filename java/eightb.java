// /*Write a program that reads a CSV file containing a super market data
// containing product ID, Name, Cost and Quantity of sales and calculate the total
// revenue of the supermarket also sort the products in the order of their demand.*/



import java.io.*;
import java.util.*;
class eightb
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("eightb.csv");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        br.readLine();
        int sum = 0, i=0;
        String s;
        int ar[] = new int[4];
        while((s = br.readLine())!= null)
        {
            String sr[] = s.split(",");
            int a = Integer.parseInt(sr[2]);
            int b = Integer.parseInt(sr[3]);
            sum = sum + a*b;
            ar[i] = b;
            i++;
        }
        System.out.println("total revenue = "+sum);
        FileReader fr2 = new FileReader(f);
        BufferedReader br2 = new BufferedReader(fr2);
        br2.readLine();
        String st[] = new String[5];
        int k = 0; 
        while((st[k]=br2.readLine())!=null)
        {
            k++;
        }
        for(int l=0; l<4; l++)
        {
            for(int m=l+1; m<4; m++)
            {
                if(ar[l]>ar[m])
                {
                    int temp = ar[l];
                    ar[l] = ar[m];
                    ar[m] = temp;
                    String dup = st[l];
                    st[l] = st[m];
                    st[m] = dup;
                }
            }
        }
        System.out.println("id  name  cost  quantity");
        for(int j=0; j<4; j++)
        {
            String show[] = st[j].split(",");
            System.out.println(show[0]+"    "+show[1]+"    "+show[2]+"    "+show[3]);
        }
        fr.close();
        br.close();
        fr2.close();
        br2.close(); 
    }
}


