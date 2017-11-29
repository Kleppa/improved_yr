public class Forecast {
	//	<windDirection deg="313.7" code="NW" name="Northwest"/>
//<windSpeed mps="2.3" name="Light breeze"/>
//<temperature unit="celsius" value="-4"/>
//<pressure unit="hPa" value="1012.5"/>
	private final double windDirectionDeg;
	private final String windCode;
	private final String windName;
	private final double windSpeed;
	private final String windSpeedName;
	private final String tempratureUnit;
	private final double tempratureValue;
	private final String pressureUnit;
	private final double pressureValue;

	public Forecast(double windDirectionDeg, String windCode,
					String windName, double windSpeed, String windSpeedName, String tempratureUnit, double tempratureValue,
					String pressureUnit, double pressureValue) {

		this.windDirectionDeg = windDirectionDeg;
		this.windCode = windCode;
		this.windName = windName;
		this.windSpeed = windSpeed;
		this.windSpeedName = windSpeedName;
		this.tempratureUnit = tempratureUnit;
		this.tempratureValue = tempratureValue;
		this.pressureUnit = pressureUnit;
		this.pressureValue = pressureValue;
	}
}
