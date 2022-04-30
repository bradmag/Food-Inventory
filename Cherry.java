public class Cherry extends Fruit implements IsHomeGrown{
	
	/** Default Constructor that sets expiration to 20 days */
	public Cherry() {
		this.setEXP(20);
	}
	
	/** Constructor that sets a manual expiration */
	public Cherry(int exp) {
		this.setEXP(exp);
	}
	
	
	@Override
	public String getClimate() {return "Hot weather";}

	@Override
	public String getHarvestSeason() {return "June and July";}
	
	@Override
	public String toString() {return "Cherry, exp: " + this.getEXP();}
}
