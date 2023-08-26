class greeting
{
    synchronized void print(String gr, int de)
    {
        int num = 3;
        while(num!=0)
        {
            System.out.println(gr);
            num--;
            try
            {
                Thread.sleep(de);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class Syn extends Thread
{
    greeting g;
    String greet;
    int delay;
    Syn(greeting g, String greet, int delay)
    {
        this.g = g;
        this.greet = greet;
        this.delay = delay;
    }
    public void run()
    {
        g.print(greet, delay);
    }
}
class week_10bmod2
{
    public static void main(String[] args)
    {
        greeting g1 = new greeting();
        Syn t1 = new Syn(g1,"Good Morning", 1000);
        Syn t2 = new Syn(g1,"Hello",1000);
        Syn t3 = new Syn(g1,"Welcome", 1000);
        t1.start();
        t2.start();
        t3.start();
    }
}
