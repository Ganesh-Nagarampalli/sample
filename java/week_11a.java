import javax.swing.*;
import java.awt.*;
/*<applet code="scroll" width=800 height=800> </applet>*/
public class scroll extends JApplet implements Runnable
{
     String msg="Hello everyone! Good morning.";
     int x = 0, y = 200;
     int flag = 0;
     Thread t = null;
     public void init()
     {
          setBackground(Color.cyan);
          t = new Thread(this);
          t.start();
     }
     public void run()
     {
     while(true){
          
          if(flag <= 200 )
          {
               x =x +2;
               flag++;
          }  
          // if(flag >= 100 && flag <=200)
          // {
          //      x = x - 1;
          //      flag++;
          // }
          if(flag >200){
               flag = 0;
               x=0;
          }
          repaint();
          try {
               Thread.sleep(30);
          } catch(InterruptedException e) {
               e.printStackTrace();
          }
     }
     }
     public void paint(Graphics g){
          g.setColor(Color.cyan);
          g.fillRect(0, 0, 800, 800);
          g.setColor(Color.black);
          g.drawString(msg, x, y);
     }
}