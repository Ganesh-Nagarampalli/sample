import java.awt.*;
import java.applet.*;
/*<applet code = MyAppl width = 300 height = 350></applet> */
import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet {
    public void init() {
        setBackground(Color.CYAN);
        setForeground(Color.BLUE);
    }
    public void paint(Graphics g) {
        g.drawString("hello", 60, 100);
    }
}

