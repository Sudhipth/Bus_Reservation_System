import java.sql.*;
public class DB_Connection {
	
    private static final String user="root";
    private static final String pass="root";
    private static final String url="jdbc:mysql://localhost:3306/jdbcdemo";
    
	public static Connection getConnection() throws Exception {
		
		return DriverManager.getConnection(url, user, pass);
		
	}
}
