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
import entities.Agent;
import entities.Worker;

public class CommandAddInvent implements ICommand {
	private static final String IDWORKERS = "idworkers";
    private static final String IDAGENT = "idagent";
    private static final String LOGIN = "login";
    private static final String LOGINA = "logina";
	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session = request.getSession(true);
		String page = null;
    //    String idworkers = request.getParameter(IDWORKERS);
  //      String idagent = request.getParameter(IDAGENT);
        String login = request.getParameter(LOGIN);
        String logina=(String)session.getAttribute("loginA");
        
        Worker worker = DaoFactory.getDaoWorker().FindWorker1(login);
		Agent agent = DaoFactory.getAgent().FindAgent(logina);
		String idw = worker.getIdworkers();
		String ida = agent.getIdagent();
        if (DaoFactory.getDaoInvent().find(idw, ida)) {
		    
		    page = Config.getInstance().getProperty(Config.FINDPAGE);
		} else {
			
			DaoFactory.getDaoInvent().InsertInvent(idw, ida);
		//	DaoFactory.getDaoInvent().InsertInvent(idworkers, idagent);
			page = Config.getInstance().getProperty(Config.FINDPAGE);
		}

        return page;
}

}
