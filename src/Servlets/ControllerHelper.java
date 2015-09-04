package Servlets;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import commands.CommandAddAgent;
import commands.CommandAddInvent;
import commands.CommandAddWorker;
import commands.CommandCabinet;
import commands.CommandDisplayAll;
import commands.CommandLoginAgent;
import commands.CommandLoginWorker;
import commands.CommandSpecialization;
import commands.ICommand;
import commands.Logout;


public class ControllerHelper {
	  private static ControllerHelper instance = null;
	    HashMap<String, ICommand> commands = new HashMap<String, ICommand>();

	    public ControllerHelper() {
	     //   commands.put("login", new CommandLogin());
	        commands.put("addworker", new CommandAddWorker());
	        commands.put("loginworker",new CommandLoginWorker());
	        commands.put("loginagent", new CommandLoginAgent());
	        commands.put("addagent", new CommandAddAgent());
	        commands.put("logout",new Logout());
	        commands.put("cabinet",new CommandCabinet());
	        commands.put("allworkers",new CommandDisplayAll());
	        commands.put("workerspecialization", new CommandSpecialization());
	        commands.put("addinvent", new CommandAddInvent());
	      /*  commands.put("deleterequest", new CommandDeleteRequest());
	        commands.put("settings", new CommandSettings());
	        commands.put("updateseller", new CommandUpdateSeller());
	        commands.put("cabinet", new CommandCabinet());
	        commands.put("logout", new CommandLogout());
	        commands.put("index", new CommandIndex());*/
	       
	    }

	    public ICommand getCommand(HttpServletRequest request) {
	        ICommand command = commands.get(request.getParameter("command"));
	      //  if (command == null) {
	       //     command = new CommandMissing();
	       // }
	        return command;
	    }

	    public static ControllerHelper getInstance() {
	        if (instance == null) {
	            instance = new ControllerHelper();
	        }
	        return instance;
	    }
}
