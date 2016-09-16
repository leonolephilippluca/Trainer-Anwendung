package dataAccessObjects.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import businessObjects.ITrainer;
import dataAccessObjects.interfaces.ITrainerDao;
import dataLayer.Trainer;

public class TrainerDaoSqlite implements ITrainerDao {

	//get DatabaseConnection SQLite
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
	
	public ResultSet getExecuteReader(String query)
	{
		Statement stmt = null;
		ResultSet reader = null;
		Connection conn = getConnection();		

		try {
			stmt = conn.createStatement();
			reader = stmt.executeQuery(query);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return reader;
	}
	
	public ITrainer getTrainerByReader(ResultSet reader)
	{
		ITrainer trainer = new Trainer();
		try {
			while( reader.next())
			{
				trainer.setExperience(reader.getInt("experience"));
				trainer.setAge(reader.getInt("age"));
				trainer.setName(reader.getString("name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return trainer;
	}
	@Override
	public ITrainer create() {
		// TODO Auto-generated method stub
		
		//erstellt eine Instance vom Objekt Trainer
		return new Trainer();
	}
	@Override
	public void delete(ITrainer trainer) {
		// TODO Auto-generated method stub
		Connection conn = this.getConnection();
		
	}
	@Override
	public ITrainer first() {
		// TODO Auto-generated method stub
		
			String query = "SELECT TOP 1 * FROM TRAINER";
			
		return this.getTrainerByReader(this.getExecuteReader(query));
	}
	@Override
	public ITrainer last() {
		// TODO Auto-generated method stub
		String query ="";
		
			ResultSet reader = this.getExecuteReader(query);

			return this.getTrainerByReader(this.getExecuteReader(query));
	}
	@Override
	public ITrainer next(ITrainer trainer) {
		// TODO Auto-generated method stub
		
			String query = "SELECT * FROM TRAINER WHERE ID = '" + trainer.getId() + 1 + "'";

			return this.getTrainerByReader(this.getExecuteReader(query));
	}
	@Override
	public ITrainer previous(ITrainer trainer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void safe(ITrainer trainer) {
		// TODO Auto-generated method stub
		String query = null;
		Statement stmt = null;
		Connection conn = getConnection();		//Insert Trainer in die DB

		try {
			stmt = conn.createStatement();

			query = "INSERT INTO TRAINER (AGE,EXPERIENCE,ID,NAME)" +
					" VALUES('"+ trainer.getAge() +"','"+ trainer.getExperience()  +"','"+ trainer.getId()  +"','"+ trainer.getName() +"');";

			stmt.executeQuery(query);


			stmt.close();

			conn.close();
		} 
		catch (SQLException e) 
		{
			System.err.println("Fehlern beim Speichern auf die Datenbank");
			e.printStackTrace();
		}

	}
	@Override
	public void select(List<ITrainer> trainerList) {
		// TODO Auto-generated method stub
		// was soll hier gemacht werden?
		// vielleicht save anstatt select?
		String query = null;
		Statement stmt = null;
		ResultSet reader = null;
		Connection conn = getConnection();		
		
		for(int i = 0; i< trainerList.size(); i++)
		{
			this.select(trainerList.get(i).getId());
		}		
	}
	@Override
	public ITrainer select(int id) {
		// TODO Auto-generated method stub
		String query  = "SELECT * FROM TRAINER WHERE ID EQ '"+ id +"';";
		
		return this.getTrainerByReader(this.getExecuteReader(query));
	}
}
