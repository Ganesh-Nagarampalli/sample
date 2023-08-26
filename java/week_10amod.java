class greeting extends Thread
{
    String greet;
    int delay;
    greeting(String greet, int delay)
    {
        this.greet = greet;
        this.delay = delay;
    }
    public void run()
    {
        int num = 3;
        while(num!=0)
        {
            System.out.println(greet);
            num--;
            try
            {
                Thread.sleep(delay);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class week_10a
{
    public static void main(String[] args)
    {
        greeting g1 = new greeting("Good Morning", 1000);
        greeting g2 = new greeting("Hello", 2000);
        greeting g3 = new greeting("Welcome", 3000);
        g1.start();
        g2.start();
        g3.start();
    }
}
