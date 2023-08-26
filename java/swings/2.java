import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
class sample2
{
    public static void main(String arg[])
    {
        //JLabel = a GUI display area for a string of text, an image, or both
        JLabel label = new JLabel(); //create a label
        label.setText("Welcome to WINTAGE!");
        ImageIcon image = new ImageIcon("wintage1.JPG"); //create an image icon
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new ColorUIResource(220,140,49));
        label.setFont(new Font("MV Boli", Font.BOLD, 30));
        JFrame frame = new JFrame();
        frame.setTitle("wintage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,720); //dimensions of frame
        frame.setVisible(true);
        
        frame.add(label);
    }
}
