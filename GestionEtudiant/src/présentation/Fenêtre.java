package présentation;

import java.awt.CardLayout;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.*;
import présentation.Loginn;

public class Fenêtre extends JFrame {
	 public JLabel lab2;
	public  JTextField login, password;
	 public String e,f;
public void window() {
	
	setVisible(true);
	setTitle("REEEEEE");
	setBounds(0,0,460,720);
    getContentPane().setLayout(null);

	//JButton b1=new JButton();
	//b1.setText("AAAAA");
    //getContentPane().add(b1); 
    JLabel label1=new JLabel();
    label1.setText("login");
    lab2 =new JLabel("password");
     login=new JTextField();
     password=new JTextField();
    getContentPane().add(label1);
    getContentPane().add(login);
    getContentPane().add(lab2);
    getContentPane().add(password);
    label1.setBounds(60, 30, 40, 20);
    lab2.setBounds(60, 60, 40, 20);
    login.setBounds(110, 30, 80, 20);
    password.setBounds(110, 60, 80, 20);
    
JMenuBar menuBar=new JMenuBar();
JMenu file=new JMenu("Fichier");
menuBar.add(file);
JMenu forr=new JMenu("firr");
menuBar.add(forr);
JMenuItem click=new JMenuItem("click");
file.add(click);
JMenuItem click2=new JMenuItem("CLIIICK");
file.add(click2);
JMenuItem click3=new JMenuItem("clickINCLICK");
file.add(click3);
getContentPane().add(menuBar);
menuBar.setBounds(0,0,1425,20);
JRadioButton birdButton = new JRadioButton("bird");

birdButton.setSelected(true);
birdButton.setBounds(20, 180, 50, 50);
JRadioButton catButton = new JRadioButton("cat");
catButton.setBounds(20, 300, 50, 50);


JRadioButton dogButton = new JRadioButton();

JRadioButton rabbitButton = new JRadioButton();


JRadioButton pigButton = new JRadioButton();
JCheckBox checkB=new JCheckBox();
checkB.setText("test");
checkB.setSelected(true);
//Group the radio buttons.
ButtonGroup group = new ButtonGroup();
getContentPane().add(birdButton);
getContentPane().add(catButton);
group.add(dogButton);
group.add(rabbitButton);
group.add(pigButton);
group.add(catButton);
group.add(birdButton);

getContentPane().add(checkB);
checkB.setBounds(300, 300, 60, 100);
//catButton.addActionListener(new Qlick());

catButton.addActionListener(new Loginn(this));



   // b1.setBounds(20, 40, 80, 20);
    
//	JPanel p= (JPanel) getContentPane();
//	p.add(b1);
	
	
			
}
}
