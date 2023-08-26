// import javax.swing.*; 
// import java.awt.*;
// import java.awt.event.*;
// class week_11b
// {
//     public static void main(String arg[])
//     {
//         JFrame jf=new JFrame(" Registration Page ");
         
//         jf.setSize(500,500);
//         jf.setLayout(new GridLayout(2,1,0,0)); 
        
//         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         JPanel fnamePanel=new JPanel(new FlowLayout(1,30,30)); 
//         JPanel lnamePanel=new JPanel(new FlowLayout(1,30,30)); 
//         JPanel emailPanel=new JPanel(new FlowLayout(1,30,30));
         
//         JPanel mobilePanel=new JPanel(new FlowLayout(1,30,30)); 
//         JPanel branchPanel=new JPanel(new GridLayout(4,1)); 
//         JPanel skillPanel=new JPanel(new GridLayout(4,1));
//         JPanel detPanel=new JPanel();
//         JPanel regPanel=new JPanel(new FlowLayout(1,25,30));

//         ButtonGroup branchGroup=new ButtonGroup(); 
//         JRadioButton cse=new JRadioButton(" CSE "); 
//         JRadioButton it=new JRadioButton(" IT "); 
//         JRadioButton ece=new JRadioButton(" ECE ");
//         JCheckBox c=new JCheckBox(" C ");
//         JCheckBox cpp=new JCheckBox(" C++ "); 
//         JCheckBox java=new JCheckBox(" JAVA ");

//         fnamePanel.add(new JLabel(" First Name: "));
//         fnamePanel.add(new JTextField(20));

//         lnamePanel.add(new JLabel(" Last Name: "));
//         lnamePanel.add(new JTextField(20));

//         emailPanel.add(new JLabel(" Email ID: "));
//         emailPanel.add(new JTextField(20));

//         mobilePanel.add(new JLabel(" Mobile Number: ")); 
//         mobilePanel.add(new JTextField(20));

//         branchGroup.add(cse); 
//         branchGroup.add(it); 
//         branchGroup.add(ece); 
//         branchPanel.add(new JLabel(" Branch"));
//         branchPanel.add(cse);

//         branchPanel.add(it); 
//         branchPanel.add(ece);

//         skillPanel.add(new JLabel(" Skills "));
         
//         skillPanel.add(c); 
//         skillPanel.add(cpp); 
//         skillPanel.add(java);

//         detPanel.setLayout(new FlowLayout(1,100,10)); 
        
//         detPanel.add(branchPanel); 
//         detPanel.add(skillPanel);

//         regPanel.add(new JCheckBox(" I accept all Terms and Conditions "));
         
//         JButton register=new JButton(" Register ");

//         register.setSize(75,50); 
//         regPanel.add(register);

//         jf.add(fnamePanel); 
//         jf.add(lnamePanel); 
//         jf.add(emailPanel); 
//         jf.add(mobilePanel); 
//         jf.add(detPanel); 
//         jf.add(regPanel);

//         jf.setVisible(true);

//     }

// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class wek11b extends MouseAdapter
{
    wek11b()
    {

    }
    public static void main(String [] args)
    {
        JFrame mainf = new JFrame("Registration page");
        mainf.setSize(700,700);
        mainf.setLayout(new GridLayout(5,1,0,0));
        // mainf.setLayout(new BoxLayout(mainf.getContentPane(), BoxLayout.X_AXIS);
        mainf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel fname = new JPanel(new FlowLayout(1,30,30));
        JPanel lname = new JPanel(new FlowLayout(1,30,30));
        JPanel email = new JPanel(new FlowLayout(1,30,30));
        JPanel d = new JPanel(new GridLayout(2,1,0,0));
        JPanel branch = new JPanel(new FlowLayout(1, 2, 5));
        JPanel skill = new JPanel(new FlowLayout(1, 3, 30));
        JPanel reg = new JPanel(new FlowLayout(1,30,30));
        JPanel mp = new JPanel(new FlowLayout(1,30,30));
        JRadioButton cse = new JRadioButton("CSE");
        JRadioButton it = new JRadioButton("IT");
        JRadioButton ece = new JRadioButton("ECE");
        JCheckBox c = new JCheckBox("C");
        JCheckBox cpp = new JCheckBox("C++");
        JCheckBox java = new JCheckBox("Java");
        fname.add(new JLabel("First name: "));
        fname.add(new JTextField(20));
        fname.add(new JCheckBox("Do you have one? "));
        lname.add(new JLabel("Last name: "));
        lname.add(new JTextField(20));
        email.add(new JLabel("Email: "));
        email.add(new JTextField(20));
        ButtonGroup branches = new ButtonGroup();
        branches.add(cse);
        branches.add(it);
        branches.add(ece);
        // branches.add(c);
        // branches.add(java);
        // branches.add(cpp);
        branch.add(new JLabel("Branch: "));
        branch.add(cse);
        branch.add(it);
        branch.add(ece);
        skill.add(new JLabel("Skills"));
        skill.add(c);
        skill.add(cpp);
        skill.add(java);
        d.add(branch);
        d.add(skill);
        reg.add(new JLabel("OK"));
        reg.add(new JCheckBox());
        JButton register = new JButton("Register");
        register.setSize(80,80);
        reg.add(register);
        mainf.add(fname);
        mainf.add(lname);
        mainf.add(email);
        // mainf.add(branch);
        // mainf.add(skill);
        mainf.add(d);
        mainf.add(reg);
        mainf.setVisible(true);

    }
}