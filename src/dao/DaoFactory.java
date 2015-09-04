package dao;


public class DaoFactory {
	 public static DaoWorker getDaoWorker(){
	        return new DaoWorker();
	    }
	    
	    public static DaoAgent getAgent(){
	        return new DaoAgent();
	    }
	    public static DaoInvent getDaoInvent(){
	        return new DaoInvent();
	    }
}
