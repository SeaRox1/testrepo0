package traitement;

import dao.*;
import entities.*;

import java.util.Scanner;
import java.util.Vector;

public class GestionEtudiant {
	Scanner sc = new Scanner(System.in);
	public Vector v = new Vector();
	EtudiantDao dao=new EtudiantDao();

	public Vector ajouterEtudiant() {
		while (true) {
			Etudiant e = new Etudiant();
			System.out.println("veuillez saisir le nom");
			e.nom = sc.next();
			System.out.println("veuillez saisir la  note");
			e.note = sc.nextDouble();
			v.add(e);
			dao.ajoutEtudiant(e);
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

	public double calculerMoyenne(Vector c) {
		// Calculer la moyenne v.get(i).note
		double mean;
		Etudiant r = new Etudiant();
		double sum = 0;
		for (int i = 0; i < c.size(); i++) {
			// for(int j=0;j<v.size();j++) {
			r = (Etudiant) c.get(i);
			// r.note = (int)v.get(i); //returns cannot be cast error
			// Etudiant r1 = new Etudiant();
			// r1 = (Etudiant)v.get(i++);
			sum += r.note;
			// System.out.println(v.size());
			// r.notemoyenne=(sum)/v.size();
			r.notemoyenne = sum / c.size();
			// }
			// System.out.println(r.notemoyenne);

		}
		System.out.println(sum / v.size());
		return sum / v.size();
	}

}
