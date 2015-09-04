package commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.Config;


public class Logout implements ICommand{

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		String page = null;
        HttpSession session = request.getSession(false);  
        session.invalidate();
        page = Config.getInstance().getProperty(Config.MAIN);
                
        return page;
	}

}
