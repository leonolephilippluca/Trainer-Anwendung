package dataLayer.Settings;

public class SettingsManager {
	private static SettingsManager instance = null;
	private static PersistenceSettings persistenceSettingsInstance = null;
	
	private SettingsManager(){
		
	}
	
	public static SettingsManager getInstance(){
		if(instance == null) {
			instance = new SettingsManager();
		}
		return instance;
	}
	
	public static PersistenceSettings getPersistenceSettings(){
		if(persistenceSettingsInstance == null) {
			persistenceSettingsInstance = new PersistenceSettings();
		}
		return persistenceSettingsInstance;
	}
}
