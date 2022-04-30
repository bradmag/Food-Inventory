public class Apple extends Fruit{
	
	/** Constructor that sets expiration to 14 days */
	public Apple() {	
		this.setEXP(14);
	}
	
	/** Constructor that sets a manual expiration */
	public Apple(int exp) {
		this.setEXP(exp);
	}
	
	@Override
	public String howToEat() {
	return "Bake an apple pie!";
	}
	
	@Override
	public String toString() {
		return "Apple, exp: " + this.getEXP();
	}
}
