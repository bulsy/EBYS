package ebys.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	private static DBconnection DBcon;
	private Connection dbConnection;
	
	private DBconnection(){}
	
    public static DBconnection getDBcon() {
		if(DBcon==null) DBcon=new DBconnection();
    	return  DBcon;
	}
	public Connection getDBConnection() throws ClassNotFoundException, SQLException {		
		Class.forName("com.mysql.jdbc.Driver");
		return dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:6666/jcg", "root", "password");		
	}
	
	public int executeQuery(String query) throws ClassNotFoundException, SQLException {
		return dbConnection.createStatement().executeUpdate(query);
	}
	
}
