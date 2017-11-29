public class XMLhandler {

	public XMLhandler() {
	}
	private final City city = new City();

	public City getCity(){
		return city;
	}
	public City withName(String name){
		return city.withName(name);
	}

}
