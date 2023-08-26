import
javax.swing.*; 
import java.awt.*;
import java.awt.event.*;


 


class registration31


{


public static void main(String arg[])


{


JFrame jf=new
JFrame(" Registration Page "); jf.setSize(500,500);


jf.setLayout(new
GridLayout(6,1,0,0)); jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


 


JPanel
fnamePanel=new JPanel(new FlowLayout(1,30,30)); JPanel lnamePanel=new JPanel(new FlowLayout(1,30,30)); JPanel emailPanel=new JPanel(new
FlowLayout(1,30,30)); JPanel
mobilePanel=new JPanel(new FlowLayout(1,30,30)); JPanel branchPanel=new JPanel(new GridLayout(4,1)); JPanel skillPanel=new JPanel(new GridLayout(4,1));


JPanel detPanel=new JPanel();


JPanel regPanel=new JPanel(new FlowLayout(1,25,30));


 


ButtonGroup branchGroup=new ButtonGroup(); 
JRadioButton cse=new JRadioButton(" CSE "); 
JRadioButton it=new JRadioButton(" IT "); 
JRadioButton ece=new JRadioButton(" ECE ");
 JCheckBox c=new JCheckBox(" C ");
JCheckBox cpp=new JCheckBox(" C++ "); 
JCheckBox java=new JCheckBox(" JAVA ");


fnamePanel.add(new JLabel(" First Name: "));
 fnamePanel.add(new JTextField(20));


lnamePanel.add(new JLabel(" Last Name: "));
 lnamePanel.add(new JTextField(20));

emailPanel.add(new JLabel(" Email ID: "));
 emailPanel.add(new JTextField(20));


mobilePanel.add(new JLabel(" Mobile Number: ")); 
mobilePanel.add(new JTextField(20));


 


branchGroup.add(cse); branchGroup.add(it); branchGroup.add(ece); branchPanel.add(new JLabel(" Branch")); branchPanel.add(cse);








branchPanel.add(it); branchPanel.add(ece);


 


skillPanel.add(new
JLabel(" Skills ")); skillPanel.add(c); skillPanel.add(cpp); skillPanel.add(java);


 


detPanel.setLayout(new
FlowLayout(1,100,10)); detPanel.add(branchPanel); detPanel.add(skillPanel);


 


regPanel.add(new
JCheckBox(" I accept all Terms and Conditions ")); JButton register=new JButton(" Register ");


register.setSize(75,50); regPanel.add(register);


 


jf.add(fnamePanel); jf.add(lnamePanel); jf.add(emailPanel); jf.add(mobilePanel); jf.add(detPanel); jf.add(regPanel);


 


jf.setVisible(true);


}


}