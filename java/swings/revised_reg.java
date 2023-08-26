import javax.swing.*;
import java.awt.*;

class Page {
  public static void main(String[] args) {
    // Create a new JFrame to hold the registration form
    JFrame frame = new JFrame("Registration Form");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the layout manager to a GridBagLayout
    frame.setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Create the form labels and fields
    JLabel nameLabel = new JLabel("Name:");
    JTextField nameField = new JTextField(20);
    JLabel rollNumberLabel = new JLabel("Roll Number:");
    JTextField rollNumberField = new JTextField(20);
    JLabel emailLabel = new JLabel("Email:");
    JTextField emailField = new JTextField(20);
    JLabel phoneNumberLabel = new JLabel("Phone Number:");
    JTextField phoneNumberField = new JTextField(20);

    // Add the form labels and fields to the frame
    constraints.gridx = 0;
    constraints.gridy = 0;
    frame.add(nameLabel, constraints);
    constraints.gridx = 1;
    frame.add(nameField, constraints);
    constraints.gridx = 0;
    constraints.gridy = 1;
    frame.add(rollNumberLabel, constraints);
    constraints.gridx = 1;
    frame.add(rollNumberField, constraints);
    constraints.gridx = 0;
    constraints.gridy = 2;
    frame.add(emailLabel, constraints);
    constraints.gridx = 1;
    frame.add(emailField, constraints);
    constraints.gridx = 0;
    constraints.gridy = 3;
    frame.add(phoneNumberLabel, constraints);
    constraints.gridx = 1;
    frame.add(phoneNumberField, constraints);

    // Create a submit button and add it to the frame
    JButton submitButton = new JButton("Submit");
    constraints.gridx = 0;
    constraints.gridy = 4;
    constraints.gridwidth = 2;
    frame.add(submitButton, constraints);

    // Set the size of the frame and make it visible
    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}

