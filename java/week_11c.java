import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
class mouseprog extends MouseAdapter
{
    JFrame jf=new JFrame();
    JLabel action = new JLabel();
    public static void main(String[] arg)
    {
        new mouseprog(); 
    } 
    mouseprog()
    {
        jf.setSize(300,300);
        jf.addMouseListener(this);
        jf.add(action); 
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    public void mousePressed(MouseEvent e)
    {
        action.setText("Mouse Pressed!");
    }
    public void mouseReleased(MouseEvent e)
    { 
        action.setText("Mouse Released!");
    }
    public void mouseClicked(MouseEvent e)
    { 
        action.setText("Mouse Clicked!");
    }
    public void mouseEntered(MouseEvent e)
    {
        action.setText("Mouse Entered!");
    } 
    public void mouseExited(MouseEvent e)
    { 
        action.setText("Mouse Exited!"); 
    }
} 
