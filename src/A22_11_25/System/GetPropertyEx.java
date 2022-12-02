package A22_11_25.System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName + userName + userHome);
		
		//임포트 해줘야댐
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objkey : keys) {
			String key = (String) objkey;
			System.out.println(key);
			System.out.println(System.getProperty(key));
		}
		
	}

}
