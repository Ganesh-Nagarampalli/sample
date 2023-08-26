class GoodMrng extends Thread{
    public void run()
    {
        int num = 3;
        while(num!=0)
        {
            System.out.println("good mrng");
            num--;
        
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    }
}
class Hello extends Thread{
    public void run()
    {
        int num = 3;
        while(num!=0)
        {
            System.out.println("Hello");
            num--;
        
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    }
}
class Welcome extends Thread{
    public void run()
    {
        int num = 3;
        while(num!=0)
        {
            System.out.println("Welcome");
            num--;
        
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    }
}
class practice
{
    public static void main(String arg[])
    {
        GoodMrng t1 = new GoodMrng();
        Hello t2 = new Hello();
        Welcome t3 = new Welcome();
        t1.start();
        t2.start();
        t3.start();
    }
}

