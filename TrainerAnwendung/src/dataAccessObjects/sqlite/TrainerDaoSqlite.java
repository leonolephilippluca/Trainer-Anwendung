package dataAccessObjects.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import businessObjects.ITrainer;
import dataAccessObjects.interfaces.ITrainerDao;

public class TrainerDaoSqlite implements ITrainerDao {

	
	private Connection getConnection()
	{
		Connection conn = null;
		try
		{
			Class.forName("org.sqlite.JDBC");		
		}
		catch (ClassNotFoundException e)
		{
			System.err.println("Fehler beim Aufrufen der Klasse org.sqlite.JDBC");
			e.printStackTrace();
		}
		String datei = "";
		String url = "jdbc:sqlite:" + datei;
		try
		{
			conn = DriverManager.getConnection(url);
		}
		catch(SQLException e)
		{
			System.err.println("es konnte keine Datenbankverbindung aufgebaut werden");
			e.printStackTrace();
		}
		
		return conn;
	}

	@Override
	public ITrainer create() {
		// TODO Auto-generated method stub
		
		return new Trainer();
	}
	@Override
	public void delete(ITrainer trainer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ITrainer first() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ITrainer last() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ITrainer next(ITrainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ITrainer previous(ITrainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void safe(ITrainer trainer) {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		
	}
	@Override
	public void select(List<ITrainer> trainerList) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public ITrainer select(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
