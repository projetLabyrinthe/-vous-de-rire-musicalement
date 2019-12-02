package JeuxLabyrinthe;
import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.Statement;
		import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ConnexionBase p= new ConnexionBase();
		System.out.println("liste des châteaux");
		System.out.println("Entrer votre login");
		String login=sc.nextLine();
		System.out.println("Entrer votre mot de passe");
		String mdp=sc.next();
		boolean r=p.insert(login,mdp);
		System.out.println("insertion "+r);
	}

}
