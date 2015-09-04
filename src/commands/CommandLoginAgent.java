package commands;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.Config;
import dao.DaoFactory;

public class CommandLoginAgent implements ICommand{
	private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String page = null;
	        String login = request.getParameter(LOGIN);
	        String password = request.getParameter(PASSWORD);
	        
	        try {
	            if (DaoFactory.getAgent().find(login, password)) {
	                HttpSession session = request.getSession(true);
	                String id = DaoFactory.getAgent().IDAgents(login);
	                session.setAttribute("loginA", new String(login));
	                session.setAttribute("ida", id);
	                request.setAttribute("loginA", login);
	                page = Config.getInstance().getProperty(Config.FINDPAGE);
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
