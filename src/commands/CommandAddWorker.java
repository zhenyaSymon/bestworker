package commands;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.Config;
import commands.CommandAddWorker;
import dao.DaoFactory;

public class CommandAddWorker implements ICommand{
	  private static final String NAME = "name";
	    private static final String SPECIALIZATION = "specialization";
	    private static final String AGEWORKER = "ageworker";
	    private static final String STORY = "story";
	    private static final String SURNAME = "surname";
	    private static final String PHOTO = "photo";
	    private static final String LOGIN = "login";
	    private static final String PASSWORD = "password";

	    public String execute(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
	        String page = null;
	        String name = request.getParameter(NAME);
	        String specialization = request.getParameter(SPECIALIZATION);
	        String ageworker = request.getParameter(AGEWORKER);
	        String story = request.getParameter(STORY);
	        String surname = request.getParameter(SURNAME);
	        String photo = request.getParameter(PHOTO);
	        String login = request.getParameter(LOGIN);
	        String password = request.getParameter(PASSWORD);
	        
	        DaoFactory.getDaoWorker().InsertWorker(login,password,specialization,  ageworker,  story,  name,
					 surname,  photo);
	        
	         page = Config.getInstance().getProperty(Config.LOGINW);
	        
	        return page;
	    }

		
	}


