package dao;

import java.util.ArrayList;

import javax.naming.NamingException;

import entities.Worker;

public interface IDaoWorker {
	public void InsertWorker(String login,String password,String specialization,String ageworker,String story,String name,String surname,String photo);
	public ArrayList<Worker> FindWokrer(String specialization);
	public ArrayList<Worker> OutputWorkers(String login);
}
