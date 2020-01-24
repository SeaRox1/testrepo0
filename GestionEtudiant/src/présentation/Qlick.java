package présentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Qlick implements ActionListener {

	
int i=0;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("action was performed"+i);
		++i;
		
	}

}
