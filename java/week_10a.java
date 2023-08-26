class GoodMorningThread extends Thread {
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
  
  class HelloThread extends Thread {
    public void run() {
        int num = 3;
        while (num!=0){
        System.out.println("Hello");
        num--;
        try {
          Thread.sleep(2000); // pause for 2 seconds
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
  
  class WelcomeThread extends Thread {
    public void run() {
        int num = 3;
        while (num!=0) {
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
  
class week_10a {
    public static void main(String[] args) {
      GoodMorningThread t1 = new GoodMorningThread();
      HelloThread t2 = new HelloThread();
      WelcomeThread t3 = new WelcomeThread();
      t1.start();
      t2.start();
      t3.start();
    }
  }
  
  