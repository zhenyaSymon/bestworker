package bestworker;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionPool {
	public static Connection CreatingConnection() throws NamingException, SQLException{
		
		InitialContext initContext= new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:comp/env/jdbc/bestworker");
		Connection conn = ds.getConnection();

		return conn;
		
	}

}
