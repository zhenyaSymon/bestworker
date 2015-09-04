package commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.Config;
import dao.DaoFactory;
import entities.Worker;


public class CommandLoginWorker implements ICommand {
	private static final String LOGIN = "login";
    private static final String PASSWORD = "password";

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		 String page = null;
	        String login = request.getParameter(LOGIN);
	        String password = request.getParameter(PASSWORD);
	        
	        try {
	            if (DaoFactory.getDaoWorker().find(login, password)) {
	                HttpSession session = request.getSession(true);
	               
	                session.setAttribute("login", new String(login));
	                
	                ArrayList<Worker> entities = new ArrayList<Worker>();
	             //   ArrayList<String> data = new ArrayList<String>();
	                
	                
	                entities = DaoFactory.getDaoWorker().OutputWorkers(login);
	             //   data = DaoFactory.getDaoWorker().OutputData(login);
	                
	                request.setAttribute("rows", entities);
	            //    request.setAttribute("cabinet", data);
	                request.setAttribute("login", login);

	                page = Config.getInstance().getProperty(Config.PRIVATE);
	            } else {
	            	page = Config.getInstance().getProperty(Config.LOGIN);
	           //     request.setAttribute("error", Message.getInstance().getProperty(Message.LOGIN_ERROR));
	            //    page = Config.getInstance().getProperty(Config.ERROR);
	            }
	        } catch (NamingException ex) {
	            Logger.getLogger(CommandLoginWorker.class.getName()).log(Level.SEVERE, null, ex);
	        }

	        return page;
	}

}
