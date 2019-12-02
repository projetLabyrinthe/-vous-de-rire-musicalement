package JeuxLabyrinthe;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;

public class ConnexionBase {
	private String url="jdbc:mysql://localhost/niveau";
	private String login="root";
	private String password="";
	private Connection cn=null;
	private Statement st = null;
	
	public ConnexionBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		cn= DriverManager.getConnection(url, login, password);
		} catch (ClassNotFoundException e) {
			//System.err.println("erreur de chargement du driver");
			e.printStackTrace();
		}
 catch (SQLException e) {
	System.err.println("erreur de chargement du driver");
	e.printStackTrace();
}
	}
	public boolean insert(String login, String mdp)
	{
		try {
		Statement st=cn.createStatement();
		String s="insert into utilisateur (login,mdp) values ('"+login+"','"+mdp+")" ;
		
		int res=st.executeUpdate(s);
		if (res==1) 
			return true;
		else 
			return false;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
}
}
