package pr�sentation;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Loginn implements ActionListener {
	Fen�tre l;
	String r, y;
public Loginn(Fen�tre f) {
	System.out.println("je sui");
	l = f;
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("eeee   "  + l.login.getText());
	}

}
