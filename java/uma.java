import java.util.*;
import java.lang.*;

class bank
{
    double acc = 10000;
    synchronized void withdraw(double w_num) throws InterruptedException
    {
        if(w_num>acc)
        {
            System.out.println("sorry");
            wait();
        }
        acc = acc - w_num;
        System.out.println("completed.");
        System.out.println(acc);
    }
    synchronized void deposited(double d_num)
    {
        System.out.println("deposition starts");
        acc = acc+d_num;
        System.out.println(acc);
        notify();
    }

}
class thread1 extends Thread
{
    bank b;
    double s = 15000;
    thread1(bank o)
    {
        b = o;
    }
    public void run()
    {
        try {
            b.withdraw(s);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
       
    }
}
class thread2 extends Thread
{
    bank b;
    double s = 15000;
    thread2(bank o)
    {
        b = o;
    }
    public void run()
    {
        
        b.deposited(s);
        
    }
}

public class uma {
    public static void main(String args[])
    {
        bank obj  = new bank();
        thread1 t1 = new thread1(obj);
        thread2 t2 = new thread2(obj);
        t1.start();
        t2.start();
    }
}
