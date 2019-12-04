package JeuxLabyrinthe;
import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.Statement;
		import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Scanner sc=new Scanner(System.in);
		ConnexionBase p= new ConnexionBase();
		System.out.println("Entrer votre login");
		String login=sc.nextLine();
		System.out.println("Entrer votre mot de passe");
		String mdp=sc.next();
		//boolean r=p.insert(login,mdp);
		//System.out.println("insertion "+r);
		boolean estInscrit= p.rechercher(login, mdp);
		if(!estInscrit) {
			
			System.out.println("vous n'etes pas inscrit en tant que utilisateur"
					+ "veillez vous inscrire pour commencer la "
					+ "partie en entrant votre login et mot de passe");
			System.out.println("Entrer votre login");
			String log=sc.next();
			System.out.println("Entrer votre mot de passe");
			String password=sc.next();
			p.insert(log, password);
			System.out.print("Bienvenue dans le jeu de Labyrinthe."
					+ "vous etes inscrit");
		}
		else {
			
		}
	}

}
