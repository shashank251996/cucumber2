package dataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import Common.ConfigManager;
import testDataTypes.testDatapojo;

public class jsonFileReader {
	
	public final String filepath = ConfigManager.getInstance().getProperty("testData");
	private List <testDatapojo> userList;
	
	public jsonFileReader() {
		userList= getData();
	}

	private List<testDatapojo> getData() {
		// TODO Auto-generated method stubg
		testDatapojo[] user= null;
		try {
			Gson gson =new Gson();
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			user = gson.fromJson(reader, testDatapojo[].class);
			 
		}catch(Exception e) {
			
		}
		
		return Arrays.asList(user);
		
	}

}
