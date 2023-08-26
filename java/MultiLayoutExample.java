/* here's an example of a single Java code that uses a BorderLayout for the top-level container,
 a GridLayout for a sub-container in the center region, 
and a FlowLayout for another sub-container in the south region.*/

/*This code creates a JFrame with a BorderLayout as the top-level layout manager. 
Inside the center region of the BorderLayout, the code creates a JPanel with a GridLayout, 
and in the south region of the BorderLayout, the code creates a JPanel with a FlowLayout. 
The JPanels are added to the top-level JFrame container, and the JButtons are added to the JPanels. 
This creates a layout where the center region is a 3x2 grid of buttons and 
the south region is a row of buttons arranged left-to-right
Please note that, you'll need to import required libraries. */


import java.awt.*;
import javax.swing.*;

public class MultiLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the layout manager for the top-level container to BorderLayout
        frame.setLayout(new BorderLayout());
        
        // Create a sub-container with a GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(3, 2));
        centerPanel.add(new JButton("Button 1"));
        centerPanel.add(new JButton("Button 2"));
        centerPanel.add(new JButton("Button 3"));
        centerPanel.add(new JButton("Button 4"));
        centerPanel.add(new JButton("Button 5"));
        centerPanel.add(new JButton("Button 6"));
        
        // Create a sub-container with a FlowLayout
        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.add(new JButton("Button 7"));
        southPanel.add(new JButton("Button 8"));
        southPanel.add(new JButton("Button 9"));
        
        // Add the sub-containers to the top-level container
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);
        
        // Set the size and location of the frame
        frame.setSize(450, 300);
        frame.setLocationRelativeTo(null);
        
        // Show the frame
        frame.setVisible(true);
    }
}

