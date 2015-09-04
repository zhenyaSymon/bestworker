package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import connection.Connect;
import entities.Agent;
import entities.Worker;

public class DaoAgent implements IDaoAgent {

	public void InsertAgent(String login, String password, String firmname) {
		// TODO Auto-generated method stub
		 try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	                cn = a.GetConnection();
	                PreparedStatement st = null;
	                try {
	                    st = cn.prepareStatement("INSERT INTO agent (login,password,firmname) VALUES(?,?,?)");
	                    st.setString(1, login);
	                    st.setString(2, password);
	                    st.setString(3, firmname);
	                    
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

public boolean find(String login, String password) throws NamingException {
try{
	
	 Connection cn = null;
     Connect a = new Connect();
     try {
         cn = a.GetConnection();
         PreparedStatement st = null;
            try {
                st = cn.prepareStatement("SELECT * FROM agent WHERE login = ? AND password = ?");
                st.setString(1, login);
                st.setString(2, password);
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
public Agent  FindAgent(String logina) {

    try {
        Connection cn = null;
        Connect a = new Connect();
        try {
        	 cn = a.GetConnection();
                PreparedStatement st = null;
            try {
            
                st = cn.prepareStatement("SELECT * FROM agent Where login=?");
                st.setString(1, logina);
                
                ResultSet rs = null;
                try {
                    rs = st.executeQuery();
                    
                        Agent tempObject = new Agent();
                        while(rs.next()){
                        tempObject.setIdagent("idagent");
                        tempObject.setFirmname(rs.getString("firmname"));
                        tempObject.setPassword(rs.getString("password"));
                        tempObject.setLogin(rs.getString("login"));
                   
                        }
                    return tempObject;
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
    } 
    Agent tempObject = new Agent();
    return tempObject;
}
public ArrayList<Agent> OutputAgents(String login) {

    try {
        Connection cn = null;
        Connect a = new Connect();
        try {
        	 cn = a.GetConnection();
                PreparedStatement st = null;
            try {
                st = cn.prepareStatement("SELECT * FROM agent Where login=?");
                st.setString(1, login);
                
                ResultSet rs = null;
                try {
                    rs = st.executeQuery();
                    ArrayList<Agent> entities = new ArrayList<Agent>(); 
                    
                    while(rs.next()){
                        Agent tempObject = new Agent();
                        tempObject.setLogin(rs.getString("login"));
                        tempObject.setPassword(rs.getString("password"));
                        tempObject.setFirmname(rs.getString("firmname"));
                        entities.add(tempObject);
                    }    
                    
                    return entities;
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
    } 
     ArrayList<Agent> entities = new ArrayList<Agent>(); 
    return entities;
}
public String IDAgents(String login) {

    try {
        Connection cn = null;
        Connect a = new Connect();
        try {
        	 cn = a.GetConnection();
                PreparedStatement st = null;
                String id = null;
            try {
                st = cn.prepareStatement("SELECT idagent FROM agent Where login=?");
                st.setString(1, login);
                
                ResultSet rs = null;
                try {
                    rs = st.executeQuery();
                    
                    
                    while(rs.next()){
                        
                       id = rs.getString("idagent");
                    }    
                    
                    return id;
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
    } 
    String id=null;
    return id;
}
}