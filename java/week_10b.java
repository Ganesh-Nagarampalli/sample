//thread synchronisation
class week_10b
{
    public static void main(String[] args)
    {
      Thread t1 = new Thread()
      {
        public void run() 
        {
          Table(5);
          
        }
      };
  
      Thread t2 = new Thread()
      {
        public void run() 
        {
          Table(7);
          
        }
      };
  
      t1.start();
      t2.start();
    }
  
    public static synchronized void Table(int n) 
    {
      for (int i = 1; i <= 5; i++) 
      {
        System.out.println(n + "*" + i + "=" + (n * i));
        try{
            Thread.sleep(1000);
          }
          catch(InterruptedException e)
          {
            System.out.println("error");
          }
      }
    }
  }
