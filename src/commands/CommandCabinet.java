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

public class CommandCabinet implements ICommand{
	private static final String LOGIN = "login";
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = null;
        String login = request.getParameter(LOGIN);
        
                
                ArrayList<Worker> entities = new ArrayList<Worker>();
                entities = DaoFactory.getDaoWorker().OutputWorkers(login);
                
                request.setAttribute("rows", entities);
                request.setAttribute("login", login);

                page = Config.getInstance().getProperty(Config.PRIVATE);
            

        return page;
}


}
