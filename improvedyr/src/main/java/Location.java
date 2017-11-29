public class Location {

	private final String locationName;
	private final Country country;
	private final String type;
	private final String timeZoneId;
	private final double utcoffsetMinutes;

	public Location(String locationName, Country country, String type, String timeZoneId, double utcoffsetMinutes) {
		this.locationName = locationName;
		this.country = country;
		this.type = type;
		this.timeZoneId = timeZoneId;
		this.utcoffsetMinutes = utcoffsetMinutes;
	}
}
