package abc.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
static Connection con;
static String driver="oracle.jdbc.driver.OracleDriver";	
static String userName="abc";	
static String url="jdbc:oracle:thin:@localhost:1521:xe";	
static String password="abc";	
	
	public static Connection getConnection(){
		if(con==null){
			
			try {
				Class.forName(driver);
				try {
					con=DriverManager.getConnection(url,userName,password);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return con;
		
	}
	public static void main(String[] args) {
		System.out.println("connection mil gaya  :"+getConnection());

	}

}
