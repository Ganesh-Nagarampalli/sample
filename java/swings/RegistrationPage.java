import java.awt.*;
import javax.swing.*;
class RegistrationPage {
  public static void main(String[] args) {
    // Create the frame
    JFrame frame = new JFrame("Registration Page");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(640, 800);

    // Create the panel and add it to the frame
    JPanel panel = new JPanel();
    frame.add(panel);

    // Set the layout manager for the panel
    panel.setLayout(new BorderLayout());

    // Create the labels and text fields
    JLabel nameLabel = new JLabel("Name:");
    JTextField nameField = new JTextField(20);
    JLabel emailLabel = new JLabel("Email:");
    JTextField emailField = new JTextField(20);
    JLabel passwordLabel = new JLabel("Password:");
    JTextField passwordField = new JTextField(20);

    // Create the button
    JButton submitButton = new JButton("Submit");

    // Add the labels, text fields, and button to the panel
    panel.add(nameLabel, BorderLayout.WEST);
    panel.add(nameField, BorderLayout.CENTER);
    panel.add(emailLabel, BorderLayout.WEST);
    panel.add(emailField, BorderLayout.CENTER);
    panel.add(passwordLabel, BorderLayout.WEST);
    panel.add(passwordField, BorderLayout.CENTER);
    panel.add(submitButton, BorderLayout.SOUTH);

    // Display the frame
    frame.setVisible(true);
  }
}
