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

public class CommandDisplayAll implements ICommand{
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		 String page = null;
	                
	                ArrayList<Worker> entities = new ArrayList<Worker>();
	                entities = DaoFactory.getDaoWorker().AllWokrers();
	                request.setAttribute("rows", entities);
	                page = Config.getInstance().getProperty(Config.FINDPAGE);
	            

	        return page;
	}

}
