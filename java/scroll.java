import javax.swing.*;
import java.awt.*;

public class scroll extends JApplet implements Runnable
{
	String msg="Welcome to the Scrolling Message Applet!";
	int x=5,i=1;
	
	public void init()
	{
		setBackground(Color.WHITE);
		setForeground(Color.black);
		new Thread(this).start();
		
	}
	public void run()
	{
		while(true)
		{
			if(x<150)
				x=x+5;	
			else if(i>=150&&i<300)
		{
			x-=5;
		}		
else
{
	i=0;
}	
i++;
			repaint();
			try{
				Thread.sleep(50);
			}catch(Exception e)
			{}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,100);
	}	
}
