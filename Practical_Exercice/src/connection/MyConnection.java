package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
Connection c =null;
    
    public MyConnection() throws ClassNotFoundException, SQLException
    {
         
    }

	public Connection MyConnec() throws SQLException, ClassNotFoundException
	{
		// chargement du pilote sp�cifique au pilote de BD (soit ODBC ou Driver personnalis� du SGBD):
        Class.forName("com.mysql.jdbc.Driver");
        
        // D�finition du contexte de la connection (URL de la connection):
        String url = "jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC";
        // r�cuperer une r�ference vers la connexion � la base de donn�es (source de donn�es) en question :
        c = DriverManager.getConnection(url,"root","");
        
		return c;}

	
}