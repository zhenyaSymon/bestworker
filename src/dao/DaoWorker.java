package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;





import javax.naming.NamingException;

import connection.Connect;
import entities.Worker;

public class DaoWorker {
	
	public ArrayList<Worker> AllWokrers() {
		 try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	                cn = a.GetConnection();
	                PreparedStatement st = null;
	                try {
	                    st = cn.prepareStatement("SELECT* FROM workers ");
	                    
	                    ResultSet rs = null;
	                    try {
	                        rs = st.executeQuery();
	                        ArrayList<Worker> entities = new ArrayList<Worker>(); 
	                        
	                        while(rs.next()){
	                        	   Worker tempObject = new Worker();
		                            tempObject.setName(rs.getString("name"));
		                            tempObject.setPassword(rs.getString("password"));
		                            tempObject.setSpecialization(rs.getString("specialization"));
		                            tempObject.setAgeworker(rs.getString("ageworker"));
		                            tempObject.setSurname(rs.getString("surname"));
		                            tempObject.setStory(rs.getString("story"));
		                            tempObject.setPhoto(rs.getString("photo"));
		                            tempObject.setLogin(rs.getString("login"));
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
	         ArrayList<Worker> entities = new ArrayList<Worker>(); 
	        return entities;
	    }


	 public ArrayList<Worker> OutputWorkers(String login) {

	        try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	            	 cn = a.GetConnection();
		                PreparedStatement st = null;
	                try {
	                
	                    st = cn.prepareStatement("SELECT * FROM workers Where login=?");
	                    st.setString(1, login);
	                    
	                    ResultSet rs = null;
	                    try {
	                        rs = st.executeQuery();
	                        ArrayList<Worker> entities = new ArrayList<Worker>(); 
	                        
	                        while(rs.next()){
	                            Worker tempObject = new Worker();
	                            tempObject.setIdworkers(rs.getString("idworkers"));
	                            tempObject.setName(rs.getString("name"));
	                            tempObject.setPassword(rs.getString("password"));
	                            tempObject.setSpecialization(rs.getString("specialization"));
	                            tempObject.setAgeworker(rs.getString("ageworker"));
	                            tempObject.setSurname(rs.getString("surname"));
	                            tempObject.setStory(rs.getString("story"));
	                            tempObject.setPhoto(rs.getString("photo"));
	                            tempObject.setLogin(rs.getString("login"));
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
	         ArrayList<Worker> entities = new ArrayList<Worker>(); 
	        return entities;
	    }

	 public Worker  FindWorker1(String login) {

	        try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	            	 cn = a.GetConnection();
		                PreparedStatement st = null;
	                try {
	                
	                    st = cn.prepareStatement("SELECT * FROM workers WHERE login=?");
	                    st.setString(1, login);
	                    
	                    ResultSet rs = null;
	                    try {
	                        rs = st.executeQuery();
	                        Worker tempObject = new Worker();
	                        while(rs.next()){
	                            tempObject.setIdworkers("idworkers");
	                            tempObject.setName(rs.getString("name"));
	                            tempObject.setPassword(rs.getString("password"));
	                            tempObject.setSpecialization(rs.getString("specialization"));
	                            tempObject.setAgeworker(rs.getString("ageworker"));
	                            tempObject.setSurname(rs.getString("surname"));
	                            tempObject.setStory(rs.getString("story"));
	                            tempObject.setPhoto(rs.getString("photo"));
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
	        Worker tempObject = new Worker();
	        return tempObject;
	    }
	public ArrayList<Worker> FindWokrer(String specialization) {
		 try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	                cn = a.GetConnection();
	                PreparedStatement st = null;
	                try {
	                    st = cn.prepareStatement("SELECT ageworker,idworkers,login,name,surname,specialization,photo FROM workers WHERE specialization = ?");
	                    st.setString(1, specialization);
	                    
	                    ResultSet rs = null;
	                    try {
	                        rs = st.executeQuery();
	                        ArrayList<Worker> entities = new ArrayList<Worker>(); 
	                        
	                        while(rs.next()){
	                            Worker tempObject = new Worker();
	                            tempObject.setName(rs.getString("name"));
	                            tempObject.setSurname(rs.getString("surname"));
	                            tempObject.setSpecialization(rs.getString("specialization"));
	                            tempObject.setPhoto(rs.getString("photo"));
	                            tempObject.setLogin(rs.getString("login"));
	                            tempObject.setAgeworker(rs.getString("ageworker"));
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
	         ArrayList<Worker> entities = new ArrayList<Worker>(); 
	        return entities;
	    }

	public void InsertWorker(String login, String password,
			String specialization, String ageworker, String story, String name,
			String surname, String photo) {
			
			 try {
		            Connection cn = null;
		            Connect a = new Connect();
		            try {
		                cn = a.GetConnection();
		                PreparedStatement st = null;
		                try {
		                    st = cn.prepareStatement("INSERT INTO workers (login,password,specialization,ageworker,story,name,surname,photo) VALUES(?,?,?,?,?,?,?,?)");
		                    st.setString(1, login);
		                    st.setString(2, password);
		                    st.setString(3, specialization);
		                    st.setString(4, ageworker);
		                    st.setString(5, story);
		                    st.setString(6, name);
		                    st.setString(7, surname);
		                    st.setString(8, photo);
		                   
		                    
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

		 try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	                cn = a.GetConnection();
	                PreparedStatement st = null;
	                try {
	                    st = cn.prepareStatement("SELECT * FROM workers WHERE login = ? AND password = ?");
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
	 public boolean findSpecialization(String specialization) throws NamingException {

		 try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	                cn = a.GetConnection();
	                PreparedStatement st = null;
	                try {
	                    st = cn.prepareStatement("SELECT * FROM workers WHERE specialization = ?");
	                    st.setString(1, specialization);
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
	
/*	 public ArrayList<String> OutputData(String login) {

	        try {
	            Connection cn = null;
	            Connect a = new Connect();
	            try {
	            	 cn = a.GetConnection();
		                PreparedStatement st = null;
	                try {
	                    st = cn.prepareStatement("SELECT * FROM workers Where login=?");
	                    st.setString(1, login);
	                    
	                    ResultSet rs = null;
	                    try {
	                        rs = st.executeQuery();
	                        ArrayList<String> data = new ArrayList<String>(); 
	                        
	                        while(rs.next()){
	                            String name = rs.getString("name");
	                            String password = rs.getString("password");
	                            String specialization = rs.getString("specialization");
	                            String ageworker =rs.getString("ageworker");
	                            String surname = rs.getString("surname");
	                            String story =rs.getString("story");
	                            String photo =rs.getString("photo");
	                            data.add(name);
	                            data.add(password);
	                            data.add(specialization);
	                            data.add(ageworker);
	                            data.add(surname);
	                            data.add(story);
	                            data.add(photo);
	                        }    
	                        
	                        return data;
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
	         ArrayList<String> data = new ArrayList<String>(); 
	        return data;
	    }*/
}