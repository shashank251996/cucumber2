package dataProvider;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Common.ConfigManager;

public class JsonUtility {
	private static JsonUtility jsonUtility;

	public String filePath;

	public static JSONObject getJsonData(String data) {
		JSONObject deviceCaps = null;
		JSONParser parser = new JSONParser();

		JSONObject json;
		try {
			json = (JSONObject) parser.parse(new FileReader(ConfigManager.getInstance().getProperty("testData")));
			deviceCaps = (JSONObject) json.get(data);
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deviceCaps;
	}

	public static JsonUtility getInstance() {
		return (jsonUtility == null) ? jsonUtility = new JsonUtility() : jsonUtility;
	}

}
