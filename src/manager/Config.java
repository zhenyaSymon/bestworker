package manager;

import java.util.ResourceBundle;
public class Config {
	 private static Config instance;
	    private ResourceBundle resource;
	    private static final String BUNDLE_NAME = "manager.config";
	    public static final String DRIVER = "DRIVER";
	    public static final String URL = "URL";
	    public static final String MAIN = "MAIN";
	    public static final String LOGIN = "LOGIN";
	    public static final String LOGINW="LOGINW";
	    public static final String PRIVATE="PRIVATE";
	    public static final String INDEX="INDEX";
	    public static final String FINDPAGE="FINDPAGE";
	    public static final String FINDPAGEL="FINDPAGEL";
	    public static Config getInstance() {
	        if (instance == null) {
	            instance = new Config();
	            instance.resource = ResourceBundle.getBundle(BUNDLE_NAME);
	        }
	        return instance;
	    }

	    public String getProperty(String key) {
	        return (String) resource.getObject(key);
	    }
}
