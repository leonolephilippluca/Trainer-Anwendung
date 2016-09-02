package dataAccessObjects.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dataAccessObjects.interfaces.ITrainerDao;
import dataLayer.IDataLayer;


public class DataLayerSqlite implements IDataLayer {

	@Override
	public ITrainerDao getTrainerDao() {
		// TODO Auto-generated method stub
		return null;
	}
}
