class GoodMorningRunnable implements Runnable
{
    public void run()
    {
        int num = 3;
        while (num!=0)
        {
          System.out.println("Good Morning");
          num--;
          try
          {
            Thread.sleep(1000); // pause for 1 second
          }
          catch (InterruptedException e)
          {
            e.printStackTrace();
          }
      }
    }
}
  
class HelloRunnable implements Runnable
{
    public void run()
    {
        int num = 3;
        while (num!=0)
        {
            System.out.println("Hello");
            num--;
            try
            {
              Thread.sleep(2000); // pause for 2 seconds
            }
            catch (InterruptedException e)
            {
              e.printStackTrace();
            }
        }
    }
}
  
class WelcomeRunnable implements Runnable
{
    public void run()
    {
        int num = 3;
        while (num!=0)
        {
        System.out.println("Welcome");
        num--;
        try {
          Thread.sleep(3000); // pause for 3 seconds
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
}
  
class week_10a2
{
    public static void main(String[] args) {
      GoodMorningRunnable r1 = new GoodMorningRunnable();
      HelloRunnable r2 = new HelloRunnable();
      WelcomeRunnable r3 = new WelcomeRunnable();
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      Thread t3 = new Thread(r3);
      t1.start();
      t2.start();
      t3.start();
    }
}
  