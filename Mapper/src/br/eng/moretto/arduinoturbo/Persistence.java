package br.eng.moretto.arduinoturbo;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;


public class Persistence {
	
	private Preferences prefs;
	private static Persistence ref = new Persistence();
	
	private static final String NODE_NAME = "/mapper";
	
	private Persistence(){
		// This will define a node in which the preferences can be stored
		prefs = Preferences.userRoot().node(NODE_NAME);            
	}
	
	public static Persistence getInstance(){
            
                // default values
		return ref;
	}
	
	
	public void set(String key, String value) {
		
		prefs.put(key, value);
		
		//Flush ( Forcing write )
		try {
                    prefs.flush();
		} catch (BackingStoreException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
        
	public String get(String key){
		return prefs.get(key, "");
	}
}