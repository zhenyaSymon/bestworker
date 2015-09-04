package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the invent database table.
 * 
 */
public class Invent implements Serializable {
	private static final long serialVersionUID = 1L;

	private String discription;

	private Agent agent;

	private Worker worker;

	public Invent() {
	}

	public String getDiscription() {
		return this.discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Agent getAgent() {
		return this.agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	public Worker getWorker() {
		return this.worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

}