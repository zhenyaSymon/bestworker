package entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the workers database table.
 * 
 */
public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	private String idworkers;

	private String ageworker;

	private String login;

	private String name;

	private String password;

	private String photo;

	private String specialization;

	private String story;

	private String surname;

	public Worker() {
	}

	public String getIdworkers() {
		return this.idworkers;
	}

	public void setIdworkers(String idworkers) {
		this.idworkers = idworkers;
	}

	public String getAgeworker() {
		return this.ageworker;
	}

	public void setAgeworker(String ageworker) {
		this.ageworker = ageworker;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getStory() {
		return this.story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}