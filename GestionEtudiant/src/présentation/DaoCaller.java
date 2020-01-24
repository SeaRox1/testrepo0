package présentation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.EtudiantDao;

public class DaoCaller implements ActionListener {
Fenetre2 d;
EtudiantDao c=new EtudiantDao();
public DaoCaller(Fenetre2 a) {
	System.out.println("dao caller start");
	d=a;
}
	
	public void actionPerformed(ActionEvent sqlEvent) {
		// TODO Auto-generated method stub
		System.out.println(d.sqlcom.getText()+"from eventlist");
		c.injectStatement(d.getTextFieldValue());
		//c.afficher();
		
	}

}
