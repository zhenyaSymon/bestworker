package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.Connect;

public class DaoInvent implements IDaoInvent {

	@Override
	public void InsertInvent(String idworker,String  idagent) {
		 try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	                cn = a.GetConnection();
	                PreparedStatement st = null;
	                try {
	                    st = cn.prepareStatement("INSERT INTO invent (idworkers,idagent) VALUES(?,?)");
	                    st.setString(1, idworker);
	                    st.setString(2, idagent);
	                    
	                    try {
	                        st.executeUpdate();
	                    } finally {
	                        }
	                    
	                } finally {
	                    if (st != null) {
	                        st.close();
	                    }
	                }
	            } finally {
	                if (cn != null) {
	                    cn.close();
	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	}

	@Override
	public boolean find(String idworkers, String idagent) {
		try {
            Connection cn = null;
            Connect a = new Connect();
            try {
                cn = a.GetConnection();
                PreparedStatement st = null;
                try {
                    st = cn.prepareStatement("SELECT * FROM invent WHERE  idworkers= ? AND idagent = ?");
                    st.setString(1, idworkers);
                    st.setString(2, idagent);
                    ResultSet rs = null;
                    try {
                        rs = st.executeQuery();
                        return rs.next();
                    } finally {
                        if (rs != null) {
                            rs.close();
                        }
                    }
                } finally {
                    if (st != null) {
                        st.close();
                    }
                }
            } finally {
                if (cn != null) {
                    cn.close();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
