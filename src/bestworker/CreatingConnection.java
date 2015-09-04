package bestworker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.NamingException;
 
/**
 * 14.06.2009 16:08:32
 *
 * @author ctapobep
 */
public class CreatingConnection {
 
    public static void main(String[] args) throws NamingException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
            //у MySQL обязательно есть системная база,
            //к ней и будем создавать соединение.
        String url = "jdbc:mysql://localhost:3306/bestworker";
          String name = "root";
            String password = "crazygarbuz";
            try {
        	//Connection con=ConnectionPool.CreatingConnection();
            	
             Connection con = DriverManager.getConnection(url, name, password);
                System.out.println("Connected.");
               con.close();
                System.out.println("Disconnected.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}