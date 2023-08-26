import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
class sample
{
    public static void main(String arg[])
    {
        //JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("wintage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);//prevent from being resized
        frame.setSize(500,640); //dimensions of frame
        frame.setVisible(true); //makes frame visible
        ImageIcon image = new ImageIcon("my.png"); //create an image icon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(Color.gray);
        // frame.getContentPane().setBackground(new Color(125,56,48));

    }
}