public class Strawberry extends Fruit implements IsHomeGrown {
	
	/** Default Constructor that sets expiration to 12 days */
	public Strawberry() {
		this.setEXP(12);
	}
	
	/** Constructor that sets a manual expiration */
	public Strawberry(int exp) {
		this.setEXP(exp);
	}
	
	@Override
	public String getHarvestSeason() {return "All Summer long";}
	
	@Override
	public String howToEat() {return "Eat it raw";}

	@Override
	public String getClimate() {return "Hot weather";}
	
	@Override
	public String toString() {return "Strawberry, exp: " + this.getEXP();}
}
