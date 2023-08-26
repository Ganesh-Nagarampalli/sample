import java.util.*;
public class Assignment
{
    public static void main(String[] args)
    {
        int num, count = 0, clone1, clone2, i, j, temp[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        num = sc.nextInt();
        clone1 = num;
        clone2 = num;
        while(clone1!=0)
        {
            clone1 = clone1/10;
            count++;
        }
        temp = new int[count];
        for(i=count-1;i>=0; i--)
        {
            temp[i] = clone2%10;
            clone2 = clone2/10;

        }
        if(num%2==0 && count%2==0)
        {
            for(i=1,j=count-1; i<count/2 && j>count/2; i=i+2,j=j-2)
            {
                temp[i] = temp[i] + temp[j];
                temp[j] = temp[i] - temp[j];
                temp[i] = temp[i] - temp[j];
            } 
        }
        if(num%2==0 && count%2!=0)
        {
            for(i=1,j=count-2; i<count/2 && j>count/2; i=i+2,j=j-2)
            {
                temp[i] = temp[i] + temp[j];
                temp[j] = temp[i] - temp[j];
                temp[i] = temp[i] - temp[j];
            } 
        }
        if(num%2!=0 && count%2==0)
        {
            for(i=0,j=count-2; i<count/2 && j>=count/2; i=i+2,j=j-2)
            {
                temp[i] = temp[i] + temp[j];
                temp[j] = temp[i] - temp[j];
                temp[i] = temp[i] - temp[j];
            } 
        }
        if(num%2!=0 && count%2!=0)
        {
            for(i=0,j=count-1; i<count/2 && j>count/2; i=i+2,j=j-2)
            {
                temp[i] = temp[i] + temp[j];
                temp[j] = temp[i] - temp[j];
                temp[i] = temp[i] - temp[j];
            } 
        }
        for(i=0;i<count;i++)
        {
            System.out.print(temp[i]);
        }
    }
}