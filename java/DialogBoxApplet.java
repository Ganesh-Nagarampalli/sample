import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="DialogBoxApplet.java", width=1000 height=1000></applet>*/
public class DialogBoxApplet extends JApplet {
    private JButton button;

    public void init() {
        // Create button
        button = new JButton("click Me");
        button.addActionListener(new ButtonListener());
        add(button);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Show dialog box
            JOptionPane.showMessageDialog(null, "Hello, dialog box!", "Dialog Box", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
