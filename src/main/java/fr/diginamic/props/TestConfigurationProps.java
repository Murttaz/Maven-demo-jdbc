package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfigurationProps {

	public static void main(String[] args) {
		ResourceBundle config = ResourceBundle.getBundle("application");
		String persoName=config.getString("nom");
		System.out.println(persoName);
		
		config.getKeys();
		Enumeration<String> enum1=config.getKeys();
		while (enum1.hasMoreElements()) {
			String key= enum1.nextElement();
			String val=config.getString(key);
			System.out.println(key+" "+val);
			
		}
		
	}

}
