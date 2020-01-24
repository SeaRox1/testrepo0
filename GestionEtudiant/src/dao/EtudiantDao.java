package dao;

import entities.*;
import traitement.*;

import java.sql.*;
import java.util.Scanner;
import pr�sentation.*;
public class EtudiantDao {

	Scanner sc = new Scanner(System.in);
	Connection cnx; // Cr�er une cnx (lien) vers une base de donn�es
	Statement st; // Pour envoyer et ex�cuter des requ�tes sql
	ResultSet rs; // r�cup�ration des r�sultats
Fenetre2 fen=new Fenetre2();

//public  String newName = null;

	public EtudiantDao() {
		String chaine = "jdbc:mysql://localhost:3306/gestionetudiant";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Charg� avec succ�s");
		} catch (ClassNotFoundException e1) {
			System.out.println("Probl�me driver");
			e1.printStackTrace();
		}
		try {
			cnx = DriverManager.getConnection(chaine, "root", "");
			System.out.println("Cnx avec succ�s");
		} catch (SQLException e1) {
			System.out.println("Probl�me cnx");
			e1.printStackTrace();
		}
	}

	public void menu() {
		GestionEtudiant gest = new GestionEtudiant();
		while (true) {
			System.out.println("1:ajouter entr�e | 2:modifier note | 3:supprimer entr�e | 4:afficher tableau | 5:commande sql");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				gest.ajouterEtudiant();
				break;
			case 2:
				modifierNote();
				break;
			case 3:
				supprimer();
				break;
			case 4:
				afficher();
			case 5:
		//		injectStatement();
			default:
				break;				
			}
			System.out.println("'o' pour quitter");
			if (sc.next().equalsIgnoreCase("o"))
				break;
		}
	}

	public void ajoutEtudiant(Etudiant e) {

		try {

			st = cnx.createStatement();
			int i = st.executeUpdate("insert into etudiant (nom,prenom,note,notemoyenne) values ('" + e.nom + "', 'ME',"
					+ e.note + ",10)");
			System.out.println("Enregistrement avec succ�s" + i);
		} catch (SQLException e1) {
			System.out.println("Probl�me d'enregistrement");
			e1.printStackTrace();
		}
	}

	public void modifierNote() {
		int code;
		double notej;
		System.out.println("Saisissez le cne de l'etudiant");
		code = sc.nextInt();
		System.out.println("Saisissez la nouvelle note");
		notej = sc.nextDouble();
		try {

			st = cnx.createStatement();
			st.executeUpdate("update etudiant set note=" + notej + "where cne=" + code);
			System.out.println("Modification avec succ�s");
		} catch (SQLException e1) {
			System.out.println("Probl�me de modification");
			e1.printStackTrace();
		}
	}

	public void supprimer() {
		System.out.println("Saisissez le cne � supprimer");
		int code = sc.nextInt();
		try {
			st = cnx.createStatement();
			st.executeUpdate("delete from etudiant where cne=" + code);
			System.out.println("success!");
		} catch (SQLException e) {
			System.out.println("you done fucked up");
			e.printStackTrace();
		}

	}
	
	public void afficher() {
		try {
			st = cnx.createStatement();
			rs=st.executeQuery("select * from etudiant");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"/t"+rs.getString(2)+"/t"+rs.getString(3)+"/t"+rs.getDouble(4)+"/t"+rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Mission Failed");
			e.printStackTrace();
		}
		
		
	}
	
	public void chercherParNomOuPrenom() {
		System.out.println("Saisir nom ou pr�nom � chercher");
		String j=sc.next();
		try {
			st = cnx.createStatement();
			rs=st.executeQuery("select * from etudiant where");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+"/t"+rs.getString(2)+"/t"+rs.getString(3)+"/t"+rs.getDouble(4)+"/t"+rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Mission Failed");
			e.printStackTrace();
		}
		
	}

	public void injectStatement(String ject) {
		
	try {
			//String ject=fen.sqlcom.getText();
			//System.out.println(ject);
			st = cnx.createStatement();
			System.out.println("State your bizness");
			//String newName=;
			rs=st.executeQuery(ject);
				System.out.println("injected.");
				ResultSetMetaData rsmd = rs.getMetaData();
				int column_count = rsmd.getColumnCount();
				while (rs.next()) {
					System.out.println(rs.getString(1)+" /t"+rs.getString(2)+"/t"+rs.getString(3)+"/t"+rs.getString(4)+"/t"+rs.getString(5));
				}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Mission Failed");
			e.printStackTrace();
		}
		
	}
}
