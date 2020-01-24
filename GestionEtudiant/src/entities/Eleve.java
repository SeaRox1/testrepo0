package entities;

import java.util.Scanner;
import java.util.Vector;

import traitement.*;

public class Eleve extends Etudiant {
Scanner sc = new Scanner(System.in);
	String parent;
GestionEtudiant a=new GestionEtudiant();

	public void cc() {
		a.ajouterEtudiant();

	}
	public Vector ajouterEtudiant() {
		Vector v=new Vector();
		while (true) {
			Eleve e = new Eleve();
			System.out.println("veuillez saisir le nom");
			e.nom = sc.next();
			System.out.println("veuillez saisir la  note");
			e.note = sc.nextDouble();
			System.out.println("smyt bbah");
			e.parent = sc.next();
			v.add(e);
			System.out.println("Etudaint ajoutée avec succes");
			System.out.println("Quitter O/N");
			if (sc.next().equalsIgnoreCase("o"))
				break;
		}
		for (int i = 0; i < v.size(); i++) {
			Etudiant r = new Etudiant();
			r = (Etudiant) v.get(i);

			System.out.println(r.nom + "=====>" + r.note);
		}

		return v;
	}
}
