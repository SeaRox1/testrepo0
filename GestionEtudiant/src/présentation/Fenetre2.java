package présentation;

import javax.swing.*;
import java.awt.*;

public class Fenetre2 extends JFrame {
	public JTextField sqlcom;
	JButton bouton;
	public void window2() {
		setVisible(true);
		setBounds(10, 10, 720, 600);
		setTitle("Sql!!");
		getContentPane().setLayout(null);
		
		
		
		sqlcom=new JTextField();
		bouton=new JButton();
		
		
		
		sqlcom.setBounds(10, 450, 500, 40);
		bouton.setBounds(50, 300, 60, 40);
		
		getContentPane().add(sqlcom);
		getContentPane().add(bouton);
		
		bouton.addActionListener(new DaoCaller(this));
		
	}
	public String getTextFieldValue() {
		return sqlcom.getText();
	}
}
