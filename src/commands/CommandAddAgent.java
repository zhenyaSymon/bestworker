package commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.Config;
import dao.DaoFactory;

public class CommandAddAgent implements ICommand {
	  private static final String FIRMNAME = "firmname";
	    private static final String LOGIN = "login";
	    private static final String PASSWORD = "password";
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		String page = null;
        String firmname = request.getParameter(FIRMNAME);
        String login = request.getParameter(LOGIN);
        String password = request.getParameter(PASSWORD);
        
        DaoFactory.getAgent().InsertAgent(login, password, firmname);
        page=Config.getInstance().getProperty(Config.LOGIN);
		// TODO Auto-generated method stub
		return page;
	}

}
