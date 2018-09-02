package Main;

import weather.ArrayOfString;
import weather.WeatherWebService;
import weather.WeatherWebServiceSoap;

import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		WeatherWebService weatherWebService = new WeatherWebService ();
		WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap ();
		ArrayOfString weatherbyCityName = weatherWebServiceSoap.getWeatherbyCityName ("西安");
		//ArrayOfString weatherbyCityName = weatherWebServiceSoap.getSupportCity ("西安");
		//ArrayOfString weatherbyCityName = weatherWebServiceSoap.getSupportProvince ();
		List<String> string = weatherbyCityName.getString ();
		string.forEach (System.out::println);
	}
}
