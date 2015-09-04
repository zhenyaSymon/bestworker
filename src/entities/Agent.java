package entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the agent database table.
 * 
 */
public class Agent implements Serializable {
	private static final long serialVersionUID = 1L;

	private String idagent;

	private String firmname;

	private String login;

	private String password;

	private List<Invent> invents;

	public Agent() {
	}

	public String getIdagent() {
		return this.idagent;
	}

	public void setIdagent(String idagent) {
		this.idagent = idagent;
	}

	public String getFirmname() {
		return this.firmname;
	}

	public void setFirmname(String firmname) {
		this.firmname = firmname;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Invent> getInvents() {
		return this.invents;
	}

	public void setInvents(List<Invent> invents) {
		this.invents = invents;
	}

	public Invent addInvent(Invent invent) {
		getInvents().add(invent);
		invent.setAgent(this);

		return invent;
	}

	public Invent removeInvent(Invent invent) {
		getInvents().remove(invent);
		invent.setAgent(null);

		return invent;
	}

}