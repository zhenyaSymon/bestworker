package commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.Config;
import dao.DaoFactory;
import entities.Worker;

public class CommandSpecialization implements ICommand{
	private static final String SPECIALIZATION = "specialization";
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		 String page = null;
	        String specialization = request.getParameter(SPECIALIZATION);
	        
	        try {
	            if (DaoFactory.getDaoWorker().findSpecialization(specialization)) {
	                
	                ArrayList<Worker> entities = new ArrayList<Worker>();
	                entities = DaoFactory.getDaoWorker().FindWokrer(specialization);
	                request.setAttribute("rows", entities);
	                page = Config.getInstance().getProperty(Config.FINDPAGE);
	            } else {
	            	page = Config.getInstance().getProperty(Config.FINDPAGE);
	           //     request.setAttribute("error", Message.getInstance().getProperty(Message.LOGIN_ERROR));
	            //    page = Config.getInstance().getProperty(Config.ERROR);
	            }
	        } catch (NamingException ex) {
	            Logger.getLogger(CommandSpecialization.class.getName()).log(Level.SEVERE, null, ex);
	        }

	        return page;
	}

}
