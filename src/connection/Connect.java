package connection;

import java.sql.*;

public class Connect {
	   String url = "jdbc:mysql://localhost:3306/bestworker";
       String name = "root";
       String password = "crazygarbuz";
       Connection cn;
public Connect() {
		
}
public Connection GetConnection(){
	Connection con=null;
	try {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con=DriverManager.getConnection(url,name,password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return con;

}

}
